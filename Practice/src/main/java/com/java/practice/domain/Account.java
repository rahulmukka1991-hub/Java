package com.java.practice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    // Account identification
    private Long id;
    private String accountNumber;
    private String iban;
    private String routingNumber;
    private String swiftCode;

    // Account holder information
    private String customerId;
    private String accountHolderName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    // Account details
    private String accountType;
    private String accountCategory;
    private String currency;
    private String accountStatus;

    // Financial information
    private BigDecimal accountBalance;
    private BigDecimal availableBalance;
    private BigDecimal overdraftLimit;
    private BigDecimal minimumBalance;
    private BigDecimal interestRate;

    // Banking details
    private String bankName;
    private String branchName;
    private String branchCode;

    // Account dates
    private LocalDate openingDate;
    private LocalDate closingDate;
    private LocalDate lastTransactionDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Additional account settings
    private Boolean active;
    private Boolean internetBankingEnabled;
    private Boolean mobileBankingEnabled;
    private Boolean debitCardEnabled;
    private Boolean jointAccount;
    private String accountDescription;
}
