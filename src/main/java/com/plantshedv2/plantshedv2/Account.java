package com.plantshedv2.plantshedv2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String User;

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

}
