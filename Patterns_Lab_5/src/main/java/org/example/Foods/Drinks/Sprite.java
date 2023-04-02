package org.example.Foods.Drinks;

// одна из реализация продукта напиток
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
