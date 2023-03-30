package org.example.Foods.Burgers;

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
