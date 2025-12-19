package com.example.banklib.client.transaction;

import com.example.banklib.client.transaction.model.TransactionResponseDto;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface TransactionClient {

  @GetMapping("/transactions/{uuid}")
  List<TransactionResponseDto> getTransactionsByCard(@PathVariable UUID uuid);
}
