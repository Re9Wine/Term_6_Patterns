package org.example.Service;

import org.example.Bean.User;

import java.util.Objects;

public class UserService {
    public boolean authorization(String login, String password){
        User user = User.getInstance();

        return Objects.equals(user.getLogin(), login)
                && Objects.equals(user.getPassword(), password);
    }

    public boolean registration(String login, String password){
        User user = User.getInstance();

        if(Objects.equals(user.getLogin(), null)){
            user.setLogin(login);
            user.setPassword(password);

            return true;
        }

        return false;
    }
}
