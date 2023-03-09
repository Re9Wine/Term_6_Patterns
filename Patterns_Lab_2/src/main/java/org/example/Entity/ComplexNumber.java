package org.example.Entity;

import org.decimal4j.util.DoubleRounder;

import java.io.Serializable;

public class ComplexNumber implements Serializable {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public ComplexNumber(double realPart, double imaginaryPart){
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber fold(ComplexNumber number){
        return new ComplexNumber(
                DoubleRounder.round(realPart + number.realPart, 2),
                DoubleRounder.round(imaginaryPart + number.imaginaryPart, 2)
        );
    }

    public ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(
                DoubleRounder.round(realPart * number.realPart - imaginaryPart * number.imaginaryPart, 2),
                DoubleRounder.round(imaginaryPart * number.realPart + realPart * number.imaginaryPart, 2)
        );
    }

    public ComplexNumber multiply(double number){
        return new ComplexNumber(
                DoubleRounder.round(realPart * number, 2),
                DoubleRounder.round(imaginaryPart * number, 2)
        );
    }

    @Override
    public String toString() {
        return realPart + (imaginaryPart >= 0 ? " + " : " - ") + imaginaryPart + "i";
    }
}
