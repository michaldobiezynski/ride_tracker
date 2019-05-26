package com.pluralsight.Services;

import com.pluralsight.DAO.AccountDAO;
import com.pluralsight.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    @Transactional
    public boolean saveAccount(Account account) {

        return accountDAO.saveAccount(account);
    }
}