package com.pluralsight.DAO;


import com.pluralsight.Entity.AccountEntity;
import com.pluralsight.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
            currentSession.save(accountEntity);
        } catch (Exception ex) {
            ex.printStackTrace();
            saveFlag = false;
        }

        return saveFlag;

    }
}
