package org.example.FastFoodStores;

import org.example.Foods.Burgers.IBurger;
import org.example.Foods.Drinks.IDrink;
import org.example.Foods.IFood;

import java.util.List;

public interface IFastFoodStore {
    default IBurger sellBurger() throws Exception {
        throw new Exception("Burgers not sells");
    }
    default IDrink sellDrink() throws Exception {
        throw new Exception("Drinks not sells");
    }

    default List<IFood> getMenu(){
        return null;
    }
}
