package com.learning.jwtauthentication.dto;

import javax.persistence.Column;

/**
 * Created by subhashchandra on 9/5/20.
 */
public class SavingAccount extends BankAccount {

    @Column(name = "bonus")
    private int bonus;

    @Column(name="offers")
    private String offers;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }
}
