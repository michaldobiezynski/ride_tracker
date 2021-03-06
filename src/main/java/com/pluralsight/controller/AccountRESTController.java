package com.pluralsight.controller;

import com.pluralsight.Services.AccountService;
import com.pluralsight.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountRESTController {

    @Autowired
    private AccountService accountService;

    @ResponseBody
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Account> getAccount(int accountNo) {
        System.out.println("Requested Account Number: " + accountNo);
        Account account = accountService.getAccount(accountNo);
        if(account == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

//    @ResponseBody
//    @RequestMapping(value = "/{id}", method=RequestMethod.POST)
//    public ResponseEntity<Account> getAccount(@RequestBody Account accnt) {
//        System.out.println("Requested Account Number: " + accnt.getAccountNo());
//        Account account = accountService.getAccount(accnt.getAccountNo());
//        if (account == null) {
//            return new ResponseEntity( HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<Account>(account, HttpStatus.OK);
//        //return account;
//    }


}
