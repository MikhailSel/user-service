package ru.seliverstov.userservice;

import java.util.Random;

public class User {
    private Long id;
    private String email;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String email) {
        this.id = new Random().nextLong(1000);
        this.email = email;
    }


}
