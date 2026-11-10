package com.spring.practice.audittrail.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "audit_records")
public class AuditRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String processName;

    private String region;
    private String packageName;
    private String country;
    private String inboxStatus;

    @Column(length = 1000)
    private String reason;

    private String maker;
    private LocalDate processingDate;

    public AuditRecord() {
    }

    public AuditRecord(
            String name,
            String processName,
            String region,
            String packageName,
            String country,
            String inboxStatus,
            String reason,
            String maker,
            LocalDate processingDate) {
        this.name = name;
        this.processName = processName;
        this.region = region;
        this.packageName = packageName;
        this.country = country;
        this.inboxStatus = inboxStatus;
        this.reason = reason;
        this.maker = maker;
        this.processingDate = processingDate;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getProcessName() { return processName; }
    public String getRegion() { return region; }
    public String getPackageName() { return packageName; }
    public String getCountry() { return country; }
    public String getInboxStatus() { return inboxStatus; }
    public String getReason() { return reason; }
    public String getMaker() { return maker; }
    public LocalDate getProcessingDate() { return processingDate; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setProcessName(String processName) {
        this.processName = processName;
    }
    public void setRegion(String region) { this.region = region; }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    public void setCountry(String country) { this.country = country; }
    public void setInboxStatus(String inboxStatus) {
        this.inboxStatus = inboxStatus;
    }
    public void setReason(String reason) { this.reason = reason; }
    public void setMaker(String maker) { this.maker = maker; }
    public void setProcessingDate(LocalDate processingDate) {
        this.processingDate = processingDate;
    }
}
