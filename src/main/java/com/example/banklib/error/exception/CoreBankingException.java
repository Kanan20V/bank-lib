package com.example.banklib.error.exception;

public class CoreBankingException extends RuntimeException {
    public CoreBankingException(String message) {
        super(message);
    }
}