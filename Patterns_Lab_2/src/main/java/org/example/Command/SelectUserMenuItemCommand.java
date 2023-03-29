package org.example.Command;

import org.example.Controller.UserController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class SelectUserMenuItemCommand implements ICommand {
    private final UserController userController;

    public SelectUserMenuItemCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean execute() throws IOException {
        return userController.selectMenuItem();
    }
}
