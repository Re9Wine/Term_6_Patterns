package org.example.Command;

import org.example.Controller.UserController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class PrintMainMenuCommand implements ICommand {
    private final UserController userController;

    public PrintMainMenuCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean execute() throws IOException {
        userController.mainMenu();

        return true;
    }
}
