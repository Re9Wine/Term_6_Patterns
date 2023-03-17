package org.example.Controller;

import org.example.Bean.User;
import org.example.Helper.InputHelper;
import org.example.Service.UserService;
import org.example.View.MainMenuView;
import org.example.View.MessageView;

import java.io.IOException;

public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public void authorization() throws IOException {
        MessageView.printMessage("Введите логин");

        String login = InputHelper.readTextFromKeyboard();

        MessageView.printMessage("Введите пароль");

        String password = InputHelper.readTextFromKeyboard();

        if(service.authorization(login, password)){
            MessageView.printMessage("Привет " + login);
        } else {
            MessageView.printMessage("Неверный логин или пароль");
        }
    }

    public void registration() throws IOException {
        MessageView.printMessage("Введите логин");

        String login = InputHelper.readTextFromKeyboard();

        MessageView.printMessage("Введите пароль");

        String password = InputHelper.readTextFromKeyboard();

        if(service.registration(login, password)){
            MessageView.printMessage("Привет " + login);
        } else {
            MessageView.printMessage("Пользователь уже зарегестрирован");
        }
    }

    public boolean selectMenuItem() throws IOException, IllegalArgumentException {
        MessageView.printMessage("Выберите пункт меню");

        String menuItem = InputHelper.readTextFromKeyboard();

        switch (menuItem){
            case "1" -> authorization();
            case "2" -> registration();
            case "0" -> {
                return false;
            }
            default -> throw new IllegalArgumentException("Некорректный ввод");
        }

        return true;
    }

    public void mainMenu(){
        MainMenuView.printMainMenu();
    }
}
