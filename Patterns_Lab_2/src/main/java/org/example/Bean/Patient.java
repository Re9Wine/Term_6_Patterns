package org.example.Bean;

import java.io.Serializable;
import java.util.Objects;

public class Patient implements Serializable, Comparable<Patient> {
    private int id;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String address;
    private int phoneNumber;
    private int medCardNumber;
    private String diagnosis;

    public Patient(){}

    public Patient(int id, String firstName, String secondName, String thirdName, String address, int phoneNumber,
                   int medCardNumber, String diagnosis)
    {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medCardNumber = medCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedCardNumber() {
        return medCardNumber;
    }

    public void setMedCardNumber(int medCardNumber) {
        this.medCardNumber = medCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Пациент:\n" +
                "id: " + id + '\n' +
                "имя: " + firstName + '\n' +
                "фамилия: " + secondName + '\n' +
                "отчество: " + thirdName + '\n' +
                "адресс: " + address + '\n' +
                "номер телефона: " + phoneNumber + '\n' +
                "номер медицинской карты: " + medCardNumber + '\n' +
                "диагноз: " + diagnosis + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id
                && phoneNumber == patient.phoneNumber
                && medCardNumber == patient.medCardNumber
                && firstName.equals(patient.firstName)
                && secondName.equals(patient.secondName)
                && thirdName.equals(patient.thirdName)
                && address.equals(patient.address)
                && diagnosis.equals(patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, thirdName, address, phoneNumber, medCardNumber, diagnosis);
    }

    @Override
    public int compareTo(Patient o) {
        int result = this.firstName.compareTo(o.firstName);

        if(result == 0){
            result = this.secondName.compareTo(o.secondName);
        }

        if(result == 0){
            result = this.thirdName.compareTo(o.thirdName);
        }

        if(result == 0){
            result = this.address.compareTo(o.address);
        }

        if(result == 0){
            result = this.phoneNumber - o.phoneNumber;
        }

        if(result == 0){
            result = this.medCardNumber - o.medCardNumber;
        }

        if(result == 0){
            result = this.diagnosis.compareTo(o.diagnosis);
        }

        return  result;
    }
}
