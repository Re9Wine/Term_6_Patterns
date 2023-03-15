package org.example;

import org.example.Comparators.Patient.PatientDiagnosisComparator;
import org.example.Comparators.Patient.PatientPhoneNumberComparator;
import org.example.Entity.Patient;
import org.example.Views.PatientView;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        try{
            PatientView view = new PatientView();

            view.execute();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}