package com.example.banklib.client.card;

import com.example.banklib.client.card.model.CardResponse;
import com.example.banklib.client.card.model.CardStatus;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public interface CardClient {

  @GetMapping("/cards/uuid/{uuid}")
  CardResponse getCard(@PathVariable UUID uuid,
                       @RequestHeader("x-user-cms-id") Long customerId);

  @GetMapping("/cards/pan/{pan}")
  CardResponse getCard(@PathVariable String pan,
                       @RequestHeader("x-user-cms-id") Long customerId);

  @PatchMapping("/cards/status")
  CardResponse updateCardStatus(
      @RequestHeader("x-user-customer-id") Long customerId,
      @RequestParam String pan,
      @RequestParam CardStatus status
  );
}
