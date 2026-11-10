package com.spring.practice.springboot.service;

import com.spring.practice.springboot.model.Account;
import com.spring.practice.springboot.repo.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class AccountService {
    private final AccountRepository accountRepository;

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }


    public List<Account> findAll() {
        log.info("getAllAccounts in server");
        return accountRepository.findAll();
    }


}
