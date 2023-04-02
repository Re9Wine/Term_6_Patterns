package org.example;

import org.example.Controller.PatientController;
import org.example.Controller.UserController;
import org.example.Repository.PatientRepository;
import org.example.Service.PatientService;
import org.example.Service.UserService;
import org.example.View.MessageView;

public class Browser {
    public void launch() {
        boolean isRun = true;
        var patientRepository = new PatientRepository();
        var patientService = new PatientService(patientRepository);
        var patientController = new PatientController(patientService);

        var userService = new UserService();
        var userController = new UserController(userService);

        var commands = Invoker.getInstance(patientController, userController).getCommands();

        while (isRun){
            try{
                //вызывай что-то одно - или меню пациента или главное меню

                // меню пациента
//                commands.get("printPatientMenu").execute();
//
//                isRun = commands.get("selectPatientMenuItem").execute();

                // главное меню (регистрация/авторизация)
                commands.get("printMainMenu").execute();

                isRun = commands.get("selectUserMenuItem").execute();

            } catch (Exception e){
                printErrorMessage(e.getMessage());
            }
        }

        System.out.println("Пока)");
    }

    private void printErrorMessage(String message){
        MessageView.printMessage(message);
    }
}
