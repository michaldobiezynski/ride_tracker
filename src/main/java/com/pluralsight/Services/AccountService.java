package com.pluralsight.Services;

import com.pluralsight.model.Account;

import java.util.List;

public interface AccountService {
    public boolean saveAccount(Account account);

    public List<Account> getAccounts();

}
