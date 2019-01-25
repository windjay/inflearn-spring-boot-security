package com.windjay.springboot.springsecurity;

import com.windjay.springboot.springsecurity.account.Account;
import com.windjay.springboot.springsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

  @Autowired
  AccountService accountService;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Account account = accountService.createAccount("windjay", "1234");
    System.out.println("username: " + account.getUsername() + ": " + " password: " + account.getPasword());
  }

}
