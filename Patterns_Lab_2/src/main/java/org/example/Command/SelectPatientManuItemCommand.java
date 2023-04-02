package org.example.Command;

import org.example.Controller.PatientController;
import org.example.Interface.ICommand;

import java.io.IOException;

// команда выбора пункта меню пациента
public class SelectPatientManuItemCommand implements ICommand {
    private final PatientController patientController;

    public SelectPatientManuItemCommand(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public boolean execute() throws IOException {
        return patientController.selectMenuItem();
    }
}
