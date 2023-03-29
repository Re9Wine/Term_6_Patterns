package org.example;

import org.example.Command.*;
import org.example.Controller.PatientController;
import org.example.Controller.UserController;
import org.example.Interface.ICommand;

import java.util.HashMap;

public class Invoker {
    private static Invoker instance;
    private final HashMap<String, ICommand> commands;

    private Invoker(PatientController patientController, UserController userController) {
        commands = new HashMap<>();

        commands.put("authorization", new AuthorizationCommand(userController));
        commands.put("registration", new RegistrationCommand(userController));
        commands.put("selectUserMenuItem", new SelectUserMenuItemCommand(userController));
        commands.put("printMainMenu", new PrintMainMenuCommand(userController));

        commands.put("printAllPatients", new PrintAllPatientsCommand(patientController));
        commands.put("printPatientMenu", new PrintPatientMenuCommand(patientController));
        commands.put("printPatientsWithDiagnosis", new PrintPatientsWithDiagnosisCommand(patientController));
        commands.put("selectPatientMenuItem", new SelectPatientManuItemCommand(patientController));
        commands.put("printPatientsInMedCardRange", new PrintPatientsInMedCardRange(patientController));
    }

    public static Invoker getInstance(PatientController patientController, UserController userController){
        if(instance == null){
            instance = new Invoker(patientController, userController);
        }

        return instance;
    }

    public HashMap<String, ICommand> getCommands() {
        return commands;
    }
}
