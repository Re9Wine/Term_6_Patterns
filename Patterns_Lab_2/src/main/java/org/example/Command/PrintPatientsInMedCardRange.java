package org.example.Command;

import org.example.Controller.PatientController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class PrintPatientsInMedCardRange implements ICommand {
    private final PatientController patientController;

    public PrintPatientsInMedCardRange(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public boolean execute() throws IOException {
        patientController.patientsInMedCardRange();

        return true;
    }
}
