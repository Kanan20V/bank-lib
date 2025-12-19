package com.example.banklib.client.card.model;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardResponse {

  UUID id;

  String pan;

  String cvv;

  String expiryDate;

  String nameOnCard;

  CardStatus status;

  String cardCategory;

  BigDecimal balance;

}

