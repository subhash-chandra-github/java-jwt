package com.learning.jwtauthentication.model;

import javax.persistence.Column;

/**
 * Created by subhashchandra on 5/5/20.
 */
public class UserDto {

    private String name;
    private String password;
    private String email;
    private String mobileNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumnber() {
        return mobileNo;
    }

    public void setMobileNumnber(String mobileNumnber) {
        this.mobileNo = mobileNumnber;
    }
}
