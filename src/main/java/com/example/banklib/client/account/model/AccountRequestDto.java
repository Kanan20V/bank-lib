package com.example.banklib.client.account.model;

import com.example.banklib.client.card.model.CardRequestDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountRequestDto {

  String customerName;

  Long customerId;

  CurrencyType currency;

  CardRequestDto cardDto;
}

