package org.example.Foods.Drinks;

// одна из реализаций продукта напиток
public class CocaCola implements IDrink{
    @Override
    public void beDrunk() {
        System.out.println("You drink coca-cola");
    }

    @Override
    public String getName() {
        return "Coca-Cola";
    }
}
