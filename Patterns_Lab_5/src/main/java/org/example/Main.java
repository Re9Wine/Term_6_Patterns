package org.example;

import org.example.Helpers.InputHelper;
import org.example.Helpers.ParseHelper;

public class Main {
    public static void main(String[] args) {
        try{
            // создание клиента
            FastFoodStoreClient client = new FastFoodStoreClient();

            // вывод фастфудов, куда может пойти клиент
            System.out.println("Select fast food store");
            System.out.println("1. BurgerKing");
            System.out.println("2. TastyAndPoint");

            // получение фастфуда, который выбрал клиент
            var fastFoodStore = client.selectFastFoodStore(ParseHelper.tryParseInt(InputHelper.readTextFromKeyboard()));
            var menu = fastFoodStore.getMenu();

            System.out.println("Choose product");

            // вывод меню фастфуда
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getName());
            }

            // продажа выбранного продукта
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