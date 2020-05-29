package com.learning.jwtauthentication.dao;

import javax.persistence.*;

/**
 * Created by subhashchandra on 9/5/20.
 */

@Entity
@Table(name="currentaccount")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id")),
        @AttributeOverride(name="accountnumber", column=@Column(name="accountnumber")),
        @AttributeOverride(name="customername", column = @Column(name = "customername"))
})
public class CurrentAccountDao extends BankAccountDao {

    @Column(name= "reward")
    private String reward;

    @Column(name="earning")
    private int earning;

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }
}
