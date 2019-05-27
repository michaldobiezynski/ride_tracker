package com.pluralsight.Services;

import com.pluralsight.model.Account;

import java.util.List;

public interface AccountService {
    public boolean saveAccount(Account account);

    public List<Account> getAccounts();

    Account getAccount(Integer accountNo);

    public boolean deleteAccount(int accountNo);
}
