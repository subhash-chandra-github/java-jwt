package com.learning.jwtauthentication.dto;

/**
 * Created by subhashchandra on 9/5/20.
 */
public class CurrentAccount extends BankAccount {

    private String reward;
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
