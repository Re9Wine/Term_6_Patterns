package org.example.Bean;

import java.util.Objects;

// класс-синглтон
public class User {
    // возбращаемый User из метода getInstance
    private static User user;
    private String login;
    private String password;

    // приматный конструктор для реалиазции синглтон
    private User() {}

    // геттер (в синглоне это можно расценивать как публиный конструктор) для получения объекта User
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
