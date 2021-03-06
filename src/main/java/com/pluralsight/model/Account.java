package com.pluralsight.model;

import com.pluralsight.Validations.PSCode;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.*;


public class Account {

    @Valid
    @NotNull
    private Integer accountNo;

    @Valid
    @NotBlank
    @Size(min=2,max=50,message="Invalid length for Account Holder Name")
    @Pattern(regexp="[A-Za-z(\\s)]+",message="Invalid Account Holder Name")
    private String accountHolderName;

    @Valid
    @NotNull(message = "Balance can't be blank")
    @Min(value=5000,message="Minimum balance must not be less than 5000")
    private Integer balance;

    @Valid
    @NotBlank(message = "Account type can't be blank")
    private String accountType;

    @Valid
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull(message = "Data of birth can't be blank")
    @Past(message="Account cant be created for a person not born")
    private Date dateOfBirth;

    @Valid
    @PSCode
    @NotBlank(message = "PS Code can't be blank")
    private String psCode;


    public Account() {
        accountNo =null;
        accountHolderName = "";
        balance = null;
        accountType = "";
        dateOfBirth = new Date();
        psCode = "";
    }

    public Account(Integer accNo, String holderName, Integer balance,
    String accType, Date dob, String psCode) {

        this.accountNo = accNo;
        this.accountHolderName = holderName;
        this.balance = balance;
        this.accountType = accType;
        this.dateOfBirth = dob;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPsCode() {
        return psCode;
    }

    public void setPsCode(String psCode) {
        this.psCode = psCode;
    }
}
