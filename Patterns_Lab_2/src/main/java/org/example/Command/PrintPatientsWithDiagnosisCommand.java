package org.example.Command;

import org.example.Controller.PatientController;
import org.example.Interface.ICommand;

import java.io.IOException;

public class PrintPatientsWithDiagnosisCommand implements ICommand {
    private final PatientController patientController;

    public PrintPatientsWithDiagnosisCommand(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public boolean execute() throws IOException {
        patientController.patientsWithDiagnosis();

        return true;
    }
}
