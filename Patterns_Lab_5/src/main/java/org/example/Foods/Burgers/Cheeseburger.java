package org.example.Foods.Burgers;

// одна из реализаций бургера
public class Cheeseburger implements IBurger{
    @Override
    public void beEaten() {
        System.out.println("You eat cheeseburger");
    }

    @Override
    public String getName() {
        return "Cheeseburger";
    }
}
