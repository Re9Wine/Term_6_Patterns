package org.example;

import org.example.Controller.PatientController;
import org.example.Controller.UserController;
import org.example.Repository.PatientRepository;
import org.example.Service.PatientService;
import org.example.Service.UserService;

public class Browser {
    public void launch() {
            boolean isRun = true;
            var patientRepository = new PatientRepository();
            var patientService = new PatientService(patientRepository);
            var patientController = new PatientController(patientService);

            var userService = new UserService();
            var userController = new UserController(userService);

            while (isRun){
                try{
//                    patientController.patientMenu();

//                    isRun = patientController.selectMenuItem();

                    userController.mainMenu();

                    isRun = userController.selectMenuItem();
                } catch (Exception e){
                    patientController.error(e.getMessage());
                }
            }
    }
}
