package org.example.Foods.Burgers;

// одна из реализация бургера
public class Whopper implements IBurger{
    @Override
    public void beEaten() {
        System.out.println("You eat whopper");
    }

    @Override
    public String getName() {
        return "Whopper";
    }
}
