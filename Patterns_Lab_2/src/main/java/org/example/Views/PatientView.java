package org.example.Views;

import org.example.Controllers.PatientController;
import org.example.Entity.Patient;
import org.example.Helpers.KeyboardHelper;
import org.example.Helpers.ParseHelper;

import java.io.IOException;
import java.util.List;

public class PatientView implements IView{
    @Override
    public void execute() {
        PatientController controller = new PatientController();
        List<Patient> patients = controller.setDefaultPatients();
        boolean isRun = true;
        int menuItem;

        while (isRun) {
            try {
                printMenu();

                menuItem = ParseHelper.tryParseInt(setItem("Выберите пункт меню"));

                switch (menuItem) {
                    case 1:
                        printList(patients);
                        break;
                    case 2:
                        printList(controller.filterPatientsByDiagnosis(patients, setItem("Введите диагноз")));
                        break;
                    case 3:
                        printList(controller.filterPatientsByMedCardNumber
                                (patients, ParseHelper.tryParseInt(setItem("Введите минимальный номер медкарты")),
                                        ParseHelper.tryParseInt(setItem("Введите максимальный номер медкарты"))));
                        break;
                    case 0:
                        isRun = false;
                        System.out.println("Пока)");
                        break;
                    default:
                        throw new Exception("Некорретный ввод");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void printMenu(){
        System.out.println("1. Вывести список");
        System.out.println("2. Вывести список пациентов, имеющий данный диагноз");
        System.out.println("3. Вывести список пациентов, номер медицинской карты которых находится в заданном интервале");
        System.out.println("0. Выход");
    }

    private String setItem(String message) throws IOException {
        System.out.println(message);

        return KeyboardHelper.readString();
    }
}
