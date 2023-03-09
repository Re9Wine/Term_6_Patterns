package org.example.Controllers;

import org.decimal4j.util.DoubleRounder;
import org.example.Entity.ComplexNumber;
import org.example.Entity.Polynomial;
import org.example.Helpers.FileHelper;
import org.example.Helpers.JsonHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PolynomialController {
    public List<Polynomial> getPolynomialsFromJson(String filePath) throws IOException {
        return JsonHelper.DeserializeList(FileHelper.readFile(filePath), Polynomial.class);
    }

    public void writePolynomialsToJsonFile(List<Polynomial> polynomials, String filePath) throws IOException {
        FileHelper.writeFile(filePath, JsonHelper.Serialize(polynomials));
    }

    public void sortPolynomial(List<Polynomial> polynomials){
        polynomials.sort(null);
    }
    public void sortPolynomial(List<Polynomial> polynomials, Comparator<Polynomial> comparator){
        polynomials.sort(comparator);
    }

    public List<Polynomial> setPolynomials(int polynomialsCount){
        List<Polynomial> polynomials = new ArrayList<>();

        for (int i = 0; i < polynomialsCount; i++) {
            polynomials.add(new Polynomial(
                    setCoefficients(),
                    setDegrees(),
                    DoubleRounder.round(Math.random() * 20, 2)
            ));
        }

        return polynomials;
    }

    private static List<Double> setDegrees(){
        List<Double> result = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            result.add(DoubleRounder.round(Math.random() * 13, 2));
        }

        return result;
    }

    private static List<ComplexNumber> setCoefficients(){
        List<ComplexNumber> result = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            result.add(new ComplexNumber(
                    DoubleRounder.round(Math.random() * 7, 2),
                    DoubleRounder.round(Math.random() * 7, 2)
            ));
        }

        return result;
    }
}
