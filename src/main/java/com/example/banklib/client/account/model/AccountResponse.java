package com.example.banklib.client.account.model;

import com.example.banklib.client.card.model.CardResponse;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountResponse {

  Long id;

  String accountNumber;

  String iban;

  BigDecimal balance;

  String customerName;

  Long customerId;

  CurrencyType currency;

  AccountStatus accountStatus;

  LocalDateTime createdAt;

  LocalDateTime updatedAt;

  List<CardResponse> card;
}