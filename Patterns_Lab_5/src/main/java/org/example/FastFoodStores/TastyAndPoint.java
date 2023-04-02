package org.example.FastFoodStores;

import org.example.Foods.Burgers.Cheeseburger;
import org.example.Foods.Burgers.IBurger;
import org.example.Foods.Drinks.CocaCola;
import org.example.Foods.Drinks.IDrink;
import org.example.Foods.IFood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// одна из реализация фабрики
public class TastyAndPoint implements IFastFoodStore{
    @Override
    public IBurger sellBurger() {
        System.out.println("You buy cheeseburger");

        return new Cheeseburger();
    }

    @Override
    public IDrink sellDrink() {
        System.out.println("You buy coca-cola");

        return new CocaCola();
    }

    @Override
    public List<IFood> getMenu() {
        return new ArrayList<>(Arrays.asList(new Cheeseburger(), new CocaCola()));
    }
}
