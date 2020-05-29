package com.learning.jwtauthentication.dao;

import javax.persistence.*;

/**
 * Created by subhashchandra on 9/5/20.
 */

@Entity
@Table(name = "account")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class BankAccountDao {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "accountnumber")
    private int accountNumber;

    @Column(name = "customername")
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
