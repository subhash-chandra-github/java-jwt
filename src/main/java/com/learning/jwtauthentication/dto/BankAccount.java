package com.learning.jwtauthentication.dto;

/**
 * Created by subhashchandra on 9/5/20.
 */
public class BankAccount {

    private int accountNumber;
    private String customerName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
