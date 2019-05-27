package com.pluralsight.DAO;


import com.pluralsight.Entity.AccountEntity;
import com.pluralsight.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveAccount(Account account) {

        boolean saveFlag = true;

        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setAccountNo(account.getAccountNo());
        accountEntity.setAccountHolderName(account.getAccountHolderName());
        accountEntity.setBalance(account.getBalance());
        accountEntity.setAccountType(account.getAccountType());
        accountEntity.setDateOfBirth(account.getDateOfBirth());
        accountEntity.setPsCode(account.getPsCode());

        try {
            Session currentSession = sessionFactory.getCurrentSession();
//            currentSession.save(accountEntity);
            currentSession.saveOrUpdate(accountEntity);
        } catch (Exception ex) {
            ex.printStackTrace();
            saveFlag = false;
        }

        return saveFlag;

    }

    @Override
    public List<Account> getAccounts() {
        List<Account> list = new ArrayList<Account>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Query<AccountEntity> query = session.createQuery("from AccountEntity", AccountEntity.class);
            List<AccountEntity> accounts = query.getResultList();

            for(int i =0; i < accounts.size(); i++) {

                AccountEntity accountEntity = (AccountEntity) accounts.get(i);
                Account account = new Account();

                account.setAccountNo(accountEntity.getAccountNo());
                account.setAccountHolderName(accountEntity.getAccountHolderName());
                account.setBalance(accountEntity.getBalance());
                account.setAccountType(accountEntity.getAccountType());
                account.setDateOfBirth(accountEntity.getDateOfBirth());
                account.setPsCode(accountEntity.getPsCode());

                list.add(account);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Account getAccount(Integer accountNo) {
        Account account = new Account();
        try {
            Session session = sessionFactory.getCurrentSession();
            AccountEntity accountEntity = (AccountEntity) session.load(AccountEntity.class, accountNo);

            account.setAccountNo(accountEntity.getAccountNo());
            account.setAccountHolderName(accountEntity.getAccountHolderName());
            account.setBalance(accountEntity.getBalance());
            account.setAccountType(accountEntity.getAccountType());
            account.setDateOfBirth(accountEntity.getDateOfBirth());
            account.setPsCode(accountEntity.getPsCode());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return account;
    }
}













