package com.spring.practice.audittrail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuditPageController {

    @GetMapping("/")
    public String home() {
        return "redirect:/audit";
    }

    @GetMapping("/audit")
    public String auditPage() {
        return "audit-list";
    }
}