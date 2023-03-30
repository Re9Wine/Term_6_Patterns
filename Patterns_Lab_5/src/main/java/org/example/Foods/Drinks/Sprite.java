package org.example.Foods.Drinks;

public class Sprite implements IDrink{
    @Override
    public void beDrunk() {
        System.out.println("You drink sprite");
    }

    @Override
    public String getName() {
        return "Sprite";
    }
}
