package org.example.FastFoodStores;

import org.example.Foods.Burgers.IBurger;
import org.example.Foods.Drinks.IDrink;

public interface IFastFoodStore {
    IBurger sellBurger();
    IDrink sellDrink();
}
