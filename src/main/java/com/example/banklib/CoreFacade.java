package com.example.banklib;

import com.example.banklib.client.account.AccountClient;
import com.example.banklib.client.card.CardClient;
import com.example.banklib.client.payment.PaymentClient;
import com.example.banklib.client.transaction.TransactionClient;

public interface CoreFacade extends
    CardClient,
    AccountClient,
    PaymentClient,
    TransactionClient {
}