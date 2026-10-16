package com.spring.practice.audittrail.repository;

import com.spring.practice.audittrail.entity.AuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuditRecordRepository
        extends JpaRepository<AuditRecord, Long>,
                JpaSpecificationExecutor<AuditRecord> {
}
