package com.spring.practice.audittrail.controller;

import com.spring.practice.audittrail.dto.AuditPageResponse;
import com.spring.practice.audittrail.service.AuditService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/audit")
public class AuditRestController {

    private final AuditService auditService;

    public AuditRestController(AuditService auditService) {
        this.auditService = auditService;
    }

    @GetMapping
    public ResponseEntity<?> listAudits(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String processName,
            @RequestParam(defaultValue = "") String region,
            @RequestParam(defaultValue = "") String packageName,
            @RequestParam(defaultValue = "") String country,
            @RequestParam(defaultValue = "") String status,
            @RequestParam(defaultValue = "") String q,

            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate startDate,

            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate endDate,

            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        // Validate date range.
        if (startDate != null && endDate != null
                && startDate.isAfter(endDate)) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "message",
                            "Start date must not be after end date."
                    )
            );
        }

        // Validate pagination parameters.
        page = Math.max(page, 0);

        if (size != 10 && size != 25 && size != 50) {
            size = 10;
        }

        PageRequest pageable = PageRequest.of(
                page,
                size,
                Sort.by(Sort.Direction.DESC, "processingDate")
                        .and(Sort.by(Sort.Direction.DESC, "id"))
        );

        Page<?> results = auditService.search(
                name,
                processName,
                region,
                packageName,
                country,
                status,
                q,
                startDate,
                endDate,
                pageable
        );

        AuditPageResponse response = new AuditPageResponse(
                results.getContent(),
                results.getNumber(),
                results.getTotalPages(),
                results.getTotalElements(),
                size,
                results.getTotalElements() == 0
                        ? 0
                        : (long) results.getNumber() * size + 1,
                (long) results.getNumber() * size
                        + results.getNumberOfElements()
        );

        return ResponseEntity.ok(response);
    }
}