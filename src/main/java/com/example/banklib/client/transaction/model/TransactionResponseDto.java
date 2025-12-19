package com.example.banklib.client.transaction.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionResponseDto {

  String recipient;

  String transactionDate;

  BigDecimal amount;

  boolean isGoingOut;

  TransactionType type;

  BigDecimal cashbackAmount;
}
