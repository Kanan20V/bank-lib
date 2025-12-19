package com.example.banklib.error.exception;

public class CustomerException extends RuntimeException {
    public CustomerException(String message) {
        super(message);
    }
}