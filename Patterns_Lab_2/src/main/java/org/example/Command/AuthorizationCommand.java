package org.example.Command;

import org.example.Controller.UserController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class AuthorizationCommand implements ICommand {
    private final UserController userController;

    public AuthorizationCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean execute() throws IOException {
        userController.authorization();

        return true;
    }
}
