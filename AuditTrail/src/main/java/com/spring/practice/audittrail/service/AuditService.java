package com.spring.practice.audittrail.service;

import com.spring.practice.audittrail.entity.AuditRecord;
import com.spring.practice.audittrail.repository.AuditRecordRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Locale;

@Service
public class AuditService {

    private final AuditRecordRepository repository;

    public AuditService(AuditRecordRepository repository) {
        this.repository = repository;
    }

    public Page<AuditRecord> search(
            String name,
            String processName,
            String region,
            String packageName,
            String country,
            String status,
            String q,
            LocalDate startDate,
            LocalDate endDate,
            Pageable pageable) {

        Specification<AuditRecord> spec =
                (root, query, cb) -> cb.conjunction();

        spec = addTextFilter(spec, "name", name);
        spec = addTextFilter(spec, "processName", processName);
        spec = addTextFilter(spec, "region", region);
        spec = addTextFilter(spec, "packageName", packageName);
        spec = addTextFilter(spec, "country", country);
        spec = addTextFilter(spec, "inboxStatus", status);

        if (startDate != null) {
            spec = spec.and((root, query, cb) ->
                    cb.greaterThanOrEqualTo(
                            root.get("processingDate"), startDate));
        }

        if (endDate != null) {
            spec = spec.and((root, query, cb) ->
                    cb.lessThanOrEqualTo(
                            root.get("processingDate"), endDate));
        }

        if (q != null && !q.isBlank()) {
            String pattern = "%" +
                    q.trim().toLowerCase(Locale.ROOT) + "%";

            spec = spec.and((root, query, cb) ->
                    cb.or(
                            cb.like(cb.lower(root.get("name")), pattern),
                            cb.like(cb.lower(root.get("processName")), pattern),
                            cb.like(cb.lower(root.get("region")), pattern),
                            cb.like(cb.lower(root.get("packageName")), pattern),
                            cb.like(cb.lower(root.get("country")), pattern),
                            cb.like(cb.lower(root.get("inboxStatus")), pattern),
                            cb.like(cb.lower(root.get("reason")), pattern),
                            cb.like(cb.lower(root.get("maker")), pattern),
                            cb.like(root.get("id").as(String.class), pattern)
                    ));
        }

        return repository.findAll(spec, pageable);
    }

    private Specification<AuditRecord> addTextFilter(
            Specification<AuditRecord> spec,
            String field,
            String value) {

        if (value == null || value.isBlank()
                || value.equalsIgnoreCase("All")) {
            return spec;
        }

        String normalized = value.trim();

        return spec.and((root, query, cb) ->
                cb.equal(
                        cb.lower(root.get(field)),
                        normalized.toLowerCase(Locale.ROOT)));
    }
}
