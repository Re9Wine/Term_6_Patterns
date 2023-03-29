package org.example.Command;

import org.example.Controller.UserController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class RegistrationCommand implements ICommand {
    private final UserController userController;

    public RegistrationCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean execute() throws IOException {
        userController.registration();

        return true;
    }
}
