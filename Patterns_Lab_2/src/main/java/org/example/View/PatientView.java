package org.example.View;

import org.example.Bean.Patient;
import org.example.Controller.PatientController;
import org.example.Service.InputService;
import org.example.Service.ParseService;

import java.io.IOException;
import java.util.List;

public class PatientView {

    public static void execute() throws IOException {
        boolean isRun = true;
        String selectedMenuItem;
        var patients = PatientController.getPatientsFromJsonFile();

        while (isRun){
            try {
                printMenu();

                System.out.println("Выберите пункт меню");

                selectedMenuItem = InputService.readTextFromKeyboard();

                switch (selectedMenuItem){
                    case "1" -> { printList(patients); }
                    case "2" -> { printPatientsWithDiagnosis(patients); }
                    case "3" -> { printPatientsInMedCardNumberRange(patients); }
                    case "0" -> { isRun = false; }
                    default -> { throw new Exception("Некорретный ввод"); }
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static <T> void printList(List<T> list){
        if(list == null || list.isEmpty()){
            System.out.println("Пусто");
        }

        for(T item: list){
            System.out.println(item);
        }
    }

    private static void printMenu(){
        System.out.println("1. Вывести пациентов");
        System.out.println("2. Вывести пациентов, имеющих данный диагноз");
        System.out.println("3. Вывести пациентов, номер медицинской карты которых находится в заданном интервале");
        System.out.println("0. Выход");
    }

    private static void printPatientsWithDiagnosis(List<Patient> patients) throws IOException {
        System.out.println("Введите диагноз");

        String diagnosis = InputService.readTextFromKeyboard();

        printList(PatientController.filterByDiagnosis(patients, diagnosis));
    }

    private static void printPatientsInMedCardNumberRange(List<Patient> patients) throws IOException {
        System.out.println("Введите минимальный номер медкарты");

        int minMedCardNumber = ParseService.tryParseInt(InputService.readTextFromKeyboard());

        System.out.println("Введите максимальный номер медкарты");

        int maxMedCardNumber = ParseService.tryParseInt(InputService.readTextFromKeyboard());

        printList(PatientController.filterByMedCardRange(patients,minMedCardNumber, maxMedCardNumber));
    }
}
