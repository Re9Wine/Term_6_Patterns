package org.example;

import org.example.Views.PatientView;

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