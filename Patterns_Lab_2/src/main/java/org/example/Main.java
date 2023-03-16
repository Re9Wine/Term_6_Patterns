package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            Browser browser = new Browser();

            browser.launch();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}