package com.pluralsight.DAO;

import com.pluralsight.model.Account;

import java.util.List;

public interface AccountDAO {

    public boolean saveAccount(Account account);

    public List<Account> getAccounts();

}
