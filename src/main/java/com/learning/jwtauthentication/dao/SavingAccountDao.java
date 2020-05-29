package com.learning.jwtauthentication.dao;

import javax.persistence.*;

/**
 * Created by subhashchandra on 9/5/20.
 */

@Entity
@Table(name="savingaccount")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id")),
        @AttributeOverride(name="accountnumber", column=@Column(name="accountnumber")),
        @AttributeOverride(name="customername", column = @Column(name = "customername"))
})
public class SavingAccountDao extends BankAccountDao {

    @Column(name="bonus")
    private int bonus;

    @Column(name = "offers")
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
