package com.example.banklib.client.payment;

import com.example.banklib.client.payment.model.PaymentRequestDto;
import com.example.banklib.client.payment.model.TransferRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentClient {

  @PostMapping("/actions/payment")
  void payment(@RequestBody PaymentRequestDto request);

  @PostMapping("actions/transfer")
  String transfer(@RequestBody TransferRequestDto request);
}
