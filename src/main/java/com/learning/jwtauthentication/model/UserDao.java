package com.learning.jwtauthentication.model;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by subhashchandra on 3/5/20.
 */
@Entity
@Table(name = "USER")
public class UserDao implements Serializable {

    private static final long serialVersionUID = 7968948500324847263L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MOBILE_NO")
    private String mobileNumnber;

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
        return mobileNumnber;
    }

    public void setMobileNumnber(String mobileNumnber) {
        this.mobileNumnber = mobileNumnber;
    }
}
