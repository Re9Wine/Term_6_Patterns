package org.example.Bean;

import java.util.Objects;

public class User {
    private static User user;
    private String login;
    private String password;

    private User() {}

    public static User getInstance(){
        if(Objects.equals(user, null)){
            user = new User();
        }

        return user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
