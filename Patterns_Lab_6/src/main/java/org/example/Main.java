package org.example;

import org.example.BurgerBuilders.KFC;
import org.example.Helpers.InputHelper;

public class Main {
    public static void main(String[] args) {
        try {
            KFC kfc = new KFC();
            Client client = new Client();

            kfc.getMenu();

            Director director = new Director();

            director.setBurgerBuilder(client.chooseBurger(InputHelper.readTextFromKeyboard()));

            Burger burger = director.buildBurger();

            System.out.println("Here is your " + burger.getName() + ":\n" + burger);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}