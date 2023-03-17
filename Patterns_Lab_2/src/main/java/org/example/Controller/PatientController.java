package org.example.Controller;

import org.example.Bean.User;
import org.example.Helper.InputHelper;
import org.example.Helper.ParseHelper;
import org.example.Service.PatientService;
import org.example.View.ListView;
import org.example.View.MessageView;
import org.example.View.PatientMenuView;

import java.io.IOException;


public class PatientController {
    private final PatientService service;

    public PatientController(PatientService service){
        this.service = service;
    }

    public void allPatients(){
        ListView.printList(service.getAll());
    }

    public void patientMenu(){
        PatientMenuView.printPatientMenu();
    }

    public void patientsWithDiagnosis() throws IOException {
        MessageView.printMessage("Введите диагноз");

        var diagnosis = InputHelper.readTextFromKeyboard();
        var patients = service.filterByDiagnosis(diagnosis);

        ListView.printList(patients);
    }

    public boolean selectMenuItem() throws IOException, IllegalArgumentException {
        MessageView.printMessage("Выберите пункт меню");

        String menuItem = InputHelper.readTextFromKeyboard();

        switch (menuItem){
            case "1" -> allPatients();
            case "2" -> patientsWithDiagnosis();
            case "3" -> patientsInMedCardRange();
            case "0" -> {
                return false;
            }
            default -> throw new IllegalArgumentException("Некорректный ввод");
        }

        return true;
    }

    public void patientsInMedCardRange() throws IOException {
        MessageView.printMessage("Введите минимальный номер медкарты");

        var minMedCardNumber = ParseHelper.tryParseInt(InputHelper.readTextFromKeyboard());

        MessageView.printMessage("Введите максимальный номер медкарты");

        var maxMedCardNumber = ParseHelper.tryParseInt(InputHelper.readTextFromKeyboard());
        var patients = service.filterByMedCardRange(minMedCardNumber, maxMedCardNumber);

        ListView.printList(patients);
    }

    public void error(String errorMessage){
        MessageView.printMessage(errorMessage);
    }
}
