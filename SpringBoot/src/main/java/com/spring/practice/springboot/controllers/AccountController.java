package com.spring.practice.springboot.controllers;

import com.spring.practice.springboot.model.Account;
import com.spring.practice.springboot.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
@AllArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

    // Get all accounts
    @GetMapping
    public List<Account> getAllAccounts() {
        log.info("getAllAccounts in controller");
        return accountService.findAll();
    }

    // Get account by ID
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Account not found: " + id));
    }

    // Create a new account
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {
        account.setId(null); // Let JPA generate the ID
        return accountService.addAccount(account);
    }

}
