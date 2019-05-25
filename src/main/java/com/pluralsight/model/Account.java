package com.pluralsight.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



public class Account {

    @Valid
    @NotNull(message = "Account# can't be blank")
    private Integer accountNo;

    @Valid
    @NotBlank(message = "Account Holder Name can't be blank")
    private String accountHolderName;

    @Valid
    @NotNull(message = "Balance can't be blank")
    private Integer balance;

    @Valid
    @NotBlank(message = "Account type can't be blank")
    private String accountType;

    @Valid
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull(message = "Data of birth can't be blank")
    private Date dataOfBirth;

    @Valid
    @NotBlank(message = "PS Code can't be blank")
    private String psCode;


    public Account() {
        accountNo =null;
        accountHolderName = "";
        balance = null;
        accountType = "";
        dataOfBirth = new Date();
        psCode = "";
    }

    public Account(Integer accNo, String holderName, Integer balance,
    String accType, Date dob, String psCode) {

        this.accountNo = accNo;
        this.accountHolderName = holderName;
        this.balance = balance;
        this.accountType = accType;
        this.dataOfBirth = dob;
        this.psCode = psCode;
    }


    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getPsCode() {
        return psCode;
    }

    public void setPsCode(String psCode) {
        this.psCode = psCode;
    }
}
