package org.example.FastFoodStores;

import org.example.Foods.Burgers.IBurger;
import org.example.Foods.Burgers.Whopper;
import org.example.Foods.Drinks.IDrink;
import org.example.Foods.Drinks.Sprite;
import org.example.Foods.IFood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BurgerKing implements IFastFoodStore{
    @Override
    public IBurger sellBurger() {
        System.out.println("You buy whopper");

        return new Whopper();
    }

    @Override
    public IDrink sellDrink() {
        System.out.println("You buy sprite");

        return new Sprite();
    }

    @Override
    public List<IFood> getMenu() {
        return new ArrayList<>(Arrays.asList(new Whopper(), new Sprite()));
    }
}
