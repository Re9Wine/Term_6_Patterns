package org.example.Entity;

import java.io.Serializable;

public class QuadraticEquation implements Serializable {
    private double firstFactor;
    private double secondFactor;
    private double freeMember;
    private double value;
    private double firstRoot;
    private double secondRoot;
    private double extrema;

    public QuadraticEquation(double firstFactor, double secondFactor, double freeMember, double value){
        setFirstFactor(firstFactor);
        setSecondFactor(secondFactor);
        setFreeMember(freeMember);
        setValue(value);
    }

    public double getFirstFactor() {
        return firstFactor;
    }

    public void setFirstFactor(double firstFactor) throws ArithmeticException {
        if(firstFactor != 0){
            this.firstFactor = firstFactor;
        }
        else {
            throw new ArithmeticException("Первый коэффициент не может равняться 0");
        }
    }

    public double getSecondFactor() {
        return secondFactor;
    }

    public void setSecondFactor(double secondFactor) {
        this.secondFactor = secondFactor;
    }

    public double getFreeMember() {
        return freeMember;
    }

    public void setFreeMember(double freeMember) {
        this.freeMember = freeMember;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public void setFirstRoot(double firstRoot) {
        this.firstRoot = firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public void setSecondRoot(double secondRoot) {
        this.secondRoot = secondRoot;
    }

    public double getExtrema() {
        return extrema;
    }

    public void setExtrema(double extrema) {
        this.extrema = extrema;
    }

    public void findRootsOfEquation() throws IllegalArgumentException, ArithmeticException{
        if(firstFactor != 0){
            double discriminant = secondFactor * secondFactor - 4 * firstFactor * freeMember;

            if(discriminant >= 0){
                firstRoot = (-secondFactor - Math.sqrt(discriminant)) / (2 * firstFactor);
                secondRoot = (-secondFactor + Math.sqrt(discriminant)) / (2 * firstFactor);
            }
            else{
                throw new IllegalArgumentException("Уравнение не имеет действительных корней!");
            }
        }
        else {
            throw new ArithmeticException("Первый коэффициент не может равняться 0");
        }
    }

    public void findExtrema(){
        if(firstFactor != 0){
            extrema = (-secondFactor) / firstFactor;
        }
        else {
            throw new ArithmeticException("Первый коэффициент не может равняться 0");
        }
    }
}
