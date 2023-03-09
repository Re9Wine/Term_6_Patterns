package org.example.Controllers;

import org.example.Entity.Patient;
import org.example.Helpers.FileHelper;
import org.example.Helpers.JsonHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientController {
    public List<Patient> filterPatientsByMedCardNumber(List<Patient> patients, int minCardNumber, int maxCardNumber){
        return patients.stream().filter(x -> x.getMedCardNumber() >= minCardNumber && x.getMedCardNumber() <= maxCardNumber).toList();
    }

    public List<Patient> filterPatientsByDiagnosis(List<Patient> patients, String diagnosis){
        return patients.stream().filter(x -> x.getDiagnosis().equals(diagnosis)).toList();
    }

    public List<Patient> getPatientsFromJson(String filePath) throws IOException {
        return JsonHelper.DeserializeList(FileHelper.readFile(filePath), Patient.class);
    }

    public void writePatientsToJsonFile(List<Patient> patients, String filePath) throws IOException {
        FileHelper.writeFile(filePath, JsonHelper.Serialize(patients));
    }

    public void sortPatients(List<Patient> patients){
        patients.sort(null);
    }

    public void sortPatients(List<Patient> patients, Comparator<Patient> comparator){
        patients.sort(comparator);
    }

    public List<Patient> setDefaultPatients(){
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
