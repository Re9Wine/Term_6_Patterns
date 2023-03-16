package org.example.Repository;

import org.example.Bean.Patient;
import org.example.Helper.FileHelper;
import org.example.Helper.JsonHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    private final String PATIENT_FILEPATH = "D:\\Study\\Term 6\\Паттерны\\Labs\\Term_6_Patterns\\Patterns_Lab_2\\src\\main\\resources\\Patients.json";

    public List<Patient> getPatientsFromJsonFile() throws IOException {
        return JsonHelper.DeserializeList(FileHelper.readFile(PATIENT_FILEPATH), Patient.class);
    }

    public List<Patient> getDefaultPatients(){
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient());
        patients.add(new Patient(1, "Никита", "Жариков", "Владимирович", "пр. Мира 1", 298416177, 1123, "ишемическая болезнь сердца"));
        patients.add(new Patient(2, "Иван", "Иванов", "Иванович", "ул. Мовчанского 3а", 334568434, 2234, "диабет"));
        patients.add(new Patient(3, "Андрей", "Карташов", "Николаевич", "ул. Непокорённых 23", 448451314, 3324, "нету"));
        patients.add(new Patient(4, "Анастасия", "Камлёва", "Юрьевна", "ул. Машерова 15", 298493431, 2345, "анемия"));
        patients.add(new Patient(5, "Евгений", "Опидович", "Анатольевич", "ул. Островского 101", 293456789, 7361, "анемия"));
        patients.add(new Patient(6, "Анна", "Морозова", "Александровна", "пл. Орджанекидзе 90", 335667343, 8574, "диабет"));
        patients.add(new Patient(7, "Максим", "Попов", "Генадьевич", "ул. Космонавнов 70", 445354613, 9035, "ишемическая болезнь сердца"));
        patients.add(new Patient(8, "Ангелина", "Карнелюк", "Владимировна", "ул. Каштановая 20а", 298567344, 6457, "туберкулез"));
        patients.add(new Patient(9, "Наталья", "Мартинович", "Леонидовна", "ул. Криулина 23", 448567471, 8455, "ишемическая болезнь сердца"));

        return patients;
    }
}
