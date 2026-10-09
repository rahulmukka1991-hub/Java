package com.java.practice.core;

import com.java.practice.domain.Account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountManagement {

    private static List<Account> accounts =  new ArrayList<>();

    //Have list of accounts -> deposit amount from one account to another account
    //Questions:
    //  min balance of account ->
    //  from account is having sufficient balance ->
    //  what is account is going to have -> accountNumber, accountBalance, identificationNumber, accountHolderName
    public static void main(String... args) {
        if (accounts.isEmpty()) {
            createAccounts();
        }
    }


    public static void createAccounts() {
        accounts = List.of(

                Account.builder()
                        .id(1001L)
                        .accountNumber("100045678901")
                        .iban("GB00DEMO12345678901234")
                        .routingNumber("021000021")
                        .swiftCode("DEMOUS33XXX")
                        .customerId("CUST-1001")
                        .accountHolderName("Olivia Thompson")
                        .email("olivia.thompson@example.com")
                        .phoneNumber("+1-416-555-0101")
                        .dateOfBirth(LocalDate.of(1990, 4, 15))
                        .accountType("CHECKING")
                        .accountCategory("PERSONAL")
                        .currency("CAD")
                        .accountStatus("ACTIVE")
                        .accountBalance(new BigDecimal("12450.75"))
                        .availableBalance(new BigDecimal("11950.75"))
                        .overdraftLimit(new BigDecimal("1000.00"))
                        .minimumBalance(new BigDecimal("100.00"))
                        .interestRate(new BigDecimal("0.25"))
                        .bankName("Example Canadian Bank")
                        .branchName("Downtown Toronto")
                        .branchCode("TOR001")
                        .openingDate(LocalDate.of(2021, 3, 10))
                        .closingDate(null)
                        .lastTransactionDate(LocalDate.of(2026, 10, 7))
                        .createdAt(LocalDateTime.of(2021, 3, 10, 9, 30))
                        .updatedAt(LocalDateTime.of(2026, 10, 7, 14, 45))
                        .active(true)
                        .internetBankingEnabled(true)
                        .mobileBankingEnabled(true)
                        .debitCardEnabled(true)
                        .jointAccount(false)
                        .accountDescription("Primary everyday chequing account")
                        .build(),

                Account.builder()
                        .id(1002L)
                        .accountNumber("100078901234")
                        .iban("GB00DEMO23456789012345")
                        .routingNumber("021000021")
                        .swiftCode("DEMOUS33XXX")
                        .customerId("CUST-1002")
                        .accountHolderName("Liam Chen")
                        .email("liam.chen@example.com")
                        .phoneNumber("+1-416-555-0102")
                        .dateOfBirth(LocalDate.of(1985, 8, 22))
                        .accountType("SAVINGS")
                        .accountCategory("PERSONAL")
                        .currency("CAD")
                        .accountStatus("ACTIVE")
                        .accountBalance(new BigDecimal("58750.20"))
                        .availableBalance(new BigDecimal("58750.20"))
                        .overdraftLimit(new BigDecimal("0.00"))
                        .minimumBalance(new BigDecimal("500.00"))
                        .interestRate(new BigDecimal("2.50"))
                        .bankName("Example Canadian Bank")
                        .branchName("North York Branch")
                        .branchCode("NYK002")
                        .openingDate(LocalDate.of(2019, 7, 15))
                        .closingDate(null)
                        .lastTransactionDate(LocalDate.of(2026, 10, 5))
                        .createdAt(LocalDateTime.of(2019, 7, 15, 11, 0))
                        .updatedAt(LocalDateTime.of(2026, 10, 5, 16, 20))
                        .active(true)
                        .internetBankingEnabled(true)
                        .mobileBankingEnabled(true)
                        .debitCardEnabled(false)
                        .jointAccount(false)
                        .accountDescription("Personal savings account")
                        .build(),

                Account.builder()
                        .id(1003L)
                        .accountNumber("100012345678")
                        .iban("GB00DEMO34567890123456")
                        .routingNumber("021000021")
                        .swiftCode("DEMOUS33XXX")
                        .customerId("CUST-1003")
                        .accountHolderName("Sophia Martinez")
                        .email("sophia.martinez@example.com")
                        .phoneNumber("+1-416-555-0103")
                        .dateOfBirth(LocalDate.of(1994, 11, 3))
                        .accountType("CHECKING")
                        .accountCategory("BUSINESS")
                        .currency("CAD")
                        .accountStatus("ACTIVE")
                        .accountBalance(new BigDecimal("125000.00"))
                        .availableBalance(new BigDecimal("120000.00"))
                        .overdraftLimit(new BigDecimal("5000.00"))
                        .minimumBalance(new BigDecimal("1000.00"))
                        .interestRate(new BigDecimal("0.10"))
                        .bankName("Example Canadian Bank")
                        .branchName("Mississauga Business Centre")
                        .branchCode("MIS003")
                        .openingDate(LocalDate.of(2022, 1, 20))
                        .closingDate(null)
                        .lastTransactionDate(LocalDate.of(2026, 10, 8))
                        .createdAt(LocalDateTime.of(2022, 1, 20, 10, 15))
                        .updatedAt(LocalDateTime.of(2026, 10, 8, 12, 0))
                        .active(true)
                        .internetBankingEnabled(true)
                        .mobileBankingEnabled(true)
                        .debitCardEnabled(true)
                        .jointAccount(true)
                        .accountDescription("Small business operating account")
                        .build(),

                Account.builder()
                        .id(1004L)
                        .accountNumber("100098765432")
                        .iban("GB00DEMO45678901234567")
                        .routingNumber("021000021")
                        .swiftCode("DEMOUS33XXX")
                        .customerId("CUST-1004")
                        .accountHolderName("Noah Williams")
                        .email("noah.williams@example.com")
                        .phoneNumber("+1-416-555-0104")
                        .dateOfBirth(LocalDate.of(1978, 2, 17))
                        .accountType("SAVINGS")
                        .accountCategory("PERSONAL")
                        .currency("CAD")
                        .accountStatus("DORMANT")
                        .accountBalance(new BigDecimal("8250.00"))
                        .availableBalance(new BigDecimal("8250.00"))
                        .overdraftLimit(new BigDecimal("0.00"))
                        .minimumBalance(new BigDecimal("100.00"))
                        .interestRate(new BigDecimal("1.75"))
                        .bankName("Example Canadian Bank")
                        .branchName("Scarborough Branch")
                        .branchCode("SCA004")
                        .openingDate(LocalDate.of(2018, 9, 12))
                        .closingDate(null)
                        .lastTransactionDate(LocalDate.of(2024, 6, 1))
                        .createdAt(LocalDateTime.of(2018, 9, 12, 13, 30))
                        .updatedAt(LocalDateTime.of(2024, 6, 1, 10, 0))
                        .active(false)
                        .internetBankingEnabled(false)
                        .mobileBankingEnabled(false)
                        .debitCardEnabled(false)
                        .jointAccount(false)
                        .accountDescription("Savings account with no recent activity")
                        .build(),

                Account.builder()
                        .id(1005L)
                        .accountNumber("100056789012")
                        .iban("GB00DEMO56789012345678")
                        .routingNumber("021000021")
                        .swiftCode("DEMOUS33XXX")
                        .customerId("CUST-1005")
                        .accountHolderName("Emma Patel")
                        .email("emma.patel@example.com")
                        .phoneNumber("+1-416-555-0105")
                        .dateOfBirth(LocalDate.of(2000, 6, 29))
                        .accountType("CHECKING")
                        .accountCategory("STUDENT")
                        .currency("CAD")
                        .accountStatus("CLOSED")
                        .accountBalance(new BigDecimal("0.00"))
                        .availableBalance(new BigDecimal("0.00"))
                        .overdraftLimit(new BigDecimal("0.00"))
                        .minimumBalance(new BigDecimal("0.00"))
                        .interestRate(new BigDecimal("0.00"))
                        .bankName("Example Canadian Bank")
                        .branchName("Etobicoke Branch")
                        .branchCode("ETO005")
                        .openingDate(LocalDate.of(2020, 9, 1))
                        .closingDate(LocalDate.of(2025, 12, 15))
                        .lastTransactionDate(LocalDate.of(2025, 12, 15))
                        .createdAt(LocalDateTime.of(2020, 9, 1, 9, 0))
                        .updatedAt(LocalDateTime.of(2025, 12, 15, 15, 30))
                        .active(false)
                        .internetBankingEnabled(false)
                        .mobileBankingEnabled(false)
                        .debitCardEnabled(false)
                        .jointAccount(false)
                        .accountDescription("Closed student chequing account")
                        .build()
        );
    }

    public static boolean transfer(int fromAccount, int toAccount, BigDecimal amount) {

        return true;
    }


}

