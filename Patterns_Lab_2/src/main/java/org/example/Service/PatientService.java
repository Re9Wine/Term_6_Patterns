package org.example.Service;

import org.example.Bean.Patient;
import org.example.Repository.PatientRepository;

import java.util.List;
import java.util.Objects;

public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository){
        this.repository = repository;
    }

    public List<Patient> getAll(){
        return repository.getDefaultPatients();
    }

    public List<Patient> filterByDiagnosis(String diagnosis){
        return repository.getDefaultPatients().stream().filter(x -> Objects.equals(x.getDiagnosis(), diagnosis)).toList();
    }

    public List<Patient> filterByMedCardRange(int minMedCardNumber, int maxMedCardNumber){
        return repository.getDefaultPatients().stream().filter(x -> x.getMedCardNumber() >= minMedCardNumber
                && x.getMedCardNumber() <= maxMedCardNumber).toList();
    }
}
