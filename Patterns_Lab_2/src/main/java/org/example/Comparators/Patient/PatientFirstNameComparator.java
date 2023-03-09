package org.example.Comparators.Patient;

import org.example.Entity.Patient;

import java.util.Comparator;

public class PatientFirstNameComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
