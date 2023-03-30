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

            fastFoodStore.sellBurger();
            fastFoodStore.sellDrink();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}