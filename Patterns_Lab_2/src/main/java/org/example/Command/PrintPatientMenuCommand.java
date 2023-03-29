package org.example.Command;

import org.example.Controller.PatientController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class PrintPatientMenuCommand implements ICommand {
    private final PatientController patientController;

    public PrintPatientMenuCommand(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public boolean execute() throws IOException {
        patientController.patientMenu();

        return true;
    }
}
