package org.example.Entity;

import java.io.Serializable;
import java.util.List;

public class Polynomial implements Serializable {
    private List<ComplexNumber> coefficients;
    private List<Double> degrees;
    private ComplexNumber value = new ComplexNumber();

    private double variable;

    public Polynomial(List<ComplexNumber> coefficients, List<Double> degrees, double variable) {
        setCoefficients(coefficients);
        setDegrees(degrees);
        setVariable(variable);
    }

    public List<ComplexNumber> getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(List<ComplexNumber> coefficients) {
        if(degrees == null || degrees.isEmpty() || coefficients.size() == degrees.size()){
            this.coefficients = coefficients;
        }
        else{
            throw new IllegalArgumentException("Ошибка: количество коэфициентов должно равняться количесву степеней");
        }
    }

    public List<Double> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Double> degrees) {
        if(coefficients == null || coefficients.isEmpty() || coefficients.size() == degrees.size()){
            this.degrees = degrees;
        }
        else{
            throw new IllegalArgumentException("Ошибка: количество степеней должно равняться количесву коэфициентов");
        }
    }

    public ComplexNumber getValue() {
        return value;
    }

    public void setValue(ComplexNumber value) {
        this.value = value;
    }

    public double getVariable() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }

    public void findValue(){
        for (int i = 0; i < degrees.size(); i++) {
            value.fold(coefficients.get(i).multiply(Math.pow(variable, degrees.get(i))));
        }
    }

    @Override
    public String toString() {
        String result = "";
        String item = "";

        for (int i = 0; i < degrees.size(); i++) {
            if (i == 0) {
                item += "(" + coefficients.get(i).multiply(Math.pow(variable, degrees.get(i))).toString() + ")";
            }
            else {
                item += (coefficients.get(i).getRealPart() >= 0 ? " + " : " - ") + "(" + coefficients.get(i).multiply(Math.pow(variable, degrees.get(i))).toString() + ")";
            }

            result.concat(item);
        }

        return item;
    }
}
