package org.example;

import org.example.View.PatientView;

public class Main {
    public static void main(String[] args) {
        try{
            PatientView.execute();

            System.out.println("Пока)");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}