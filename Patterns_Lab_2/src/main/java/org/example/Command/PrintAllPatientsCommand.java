package org.example.Command;

import org.example.Controller.PatientController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class PrintAllPatientsCommand implements ICommand {
    private final PatientController patientController;

    public PrintAllPatientsCommand(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public boolean execute() throws IOException {
        patientController.allPatients();

        return true;
    }
}
