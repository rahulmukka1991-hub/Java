package com.spring.practice.audittrail.dto;

import java.util.List;

public record AuditPageResponse(
        List<?> records,
        int currentPage,
        int totalPages,
        long totalItems,
        int pageSize,
        long startItem,
        long endItem
) {}