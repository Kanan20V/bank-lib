package com.example.banklib;

import com.example.banklib.client.account.AccountClient;
import com.example.banklib.client.card.CardClient;

public interface CoreFacade extends
    CardClient,
    AccountClient {
}