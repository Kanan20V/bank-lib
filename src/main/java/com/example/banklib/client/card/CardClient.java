package com.example.banklib.client.card;

import com.example.banklib.client.card.model.CardResponse;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

public interface CardClient {

  @GetMapping("/uuid/{uuid}")
  CardResponse getCard(@PathVariable("uuid") UUID uuid,
                       @RequestHeader("x-user-cms-id") Long customerId);

  @GetMapping("/pan/{pan}")
  CardResponse getCard(@PathVariable("uuid") String pan,
                       @RequestHeader("x-user-cms-id") Long customerId);
}
