package org.example;

import org.example.Helpers.InputHelper;
import org.example.Helpers.ParseHelper;

public class Main {
    public static void main(String[] args) {
        try{
            FastFoodStoreClient client = new FastFoodStoreClient();

            System.out.println("Select fast food store");
            System.out.println("1. BurgerKing");
            System.out.println("2. TastyAndPoint");

            var fastFoodStore = client.selectFastFoodStore(ParseHelper.tryParseInt(InputHelper.readTextFromKeyboard()));
            var menu = fastFoodStore.getMenu();

            System.out.println("Choose product");

            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getName());
            }

            switch (ParseHelper.tryParseInt(InputHelper.readTextFromKeyboard())){
                case 1 -> {
                    fastFoodStore.sellBurger();
                }
                case 2 -> {
                    fastFoodStore.sellDrink();
                }
                default -> {
                    throw new Exception("Uncorrected input");
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}