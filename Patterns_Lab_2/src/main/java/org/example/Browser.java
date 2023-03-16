package org.example;

import org.example.Controller.PatientController;
import org.example.Repository.PatientRepository;
import org.example.Service.PatientService;

import java.io.IOException;

public class Browser {
    public void launch() {
            boolean isRun = true;
            var patientRepository = new PatientRepository();
            var patientService = new PatientService(patientRepository);
            var patientController = new PatientController(patientService);

            while (isRun){
                try{
                    patientController.patientMenu();

                    isRun = patientController.selectMenuItem();
                } catch (Exception e){
                    patientController.error(e.getMessage());
                }
            }
    }
}
