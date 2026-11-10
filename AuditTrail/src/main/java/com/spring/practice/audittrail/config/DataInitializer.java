package com.spring.practice.audittrail.config;

import com.spring.practice.audittrail.entity.AuditRecord;
import com.spring.practice.audittrail.repository.AuditRecordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner seedAuditRecords(AuditRecordRepository repository) {
        return args -> {
            if (repository.count() > 0) {
                return;
            }

            String[] names = {
                    "Copyover L2_dep_rt_dl",
                    "Copyover L2_dep_rt_dl",
                    "L2",
                    "Copyover L2_dep_rt_dl",
                    "New Spread",
                    "L2",
                    "Copyover L2_dep_rt_dl"
            };

            String[] processes = {
                    "Copyover", "Copyover", "E2E Resume",
                    "Copyover", "Spread Maintenance",
                    "E2E Resume", "Copyover"
            };

            String[] regions = {
                    "LATAM", "NAM", "APAC", "EMEA",
                    "NAM", "APAC", "EMEA"
            };

            String[] statuses = {
                    "Completed", "Completed", "Rejected",
                    "Completed", "Expired", "Rejected", "Completed"
            };

            String[] reasons = {
                    "Zeroed Out", "Threshold Breach", "-",
                    "Doubled Up", "2026 Q1 Update", "-",
                    "Zeroed Out Portfolios"
            };

            String[] packages = {
                    "Core", "Core", "E2E", "Core",
                    "Spread", "E2E", "Core"
            };

            String[] countries = {
                    "Brazil", "United States", "Australia",
                    "Germany", "United States", "Singapore", "France"
            };

            for (int i = 0; i < 100; i++) {
                int index = i % names.length;

                repository.save(new AuditRecord(
                        names[index],
                        processes[index],
                        regions[index],
                        packages[index],
                        countries[index],
                        statuses[index],
                        reasons[index],
                        "Ella Estefan",
                        LocalDate.of(2026, 9, 17).minusDays(i % 30)
                ));
            }
        };
    }
}
