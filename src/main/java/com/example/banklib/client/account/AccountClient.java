package com.example.banklib.client.account;


import com.example.banklib.client.account.model.AccountRequestDto;
import com.example.banklib.client.account.model.AccountResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface AccountClient {

  @PostMapping("/accounts")
  void createAccount(@RequestBody AccountRequestDto request);

  @GetMapping("/accounts")
  List<AccountResponse> getAccounts(@RequestHeader("x-user-cms-id") Long cmsId);

  @GetMapping("/accounts/accountNumber/{accountNumber}")
  List<AccountResponse> getAccount(@RequestHeader("x-user-cms-id") Long cmsId,
                                   @PathVariable String accountNumber);
}
