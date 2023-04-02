package org.example.FastFoodStores;

import org.example.Foods.Burgers.IBurger;
import org.example.Foods.Drinks.IDrink;
import org.example.Foods.IFood;

import java.util.List;

// интерфейс абстрактой фабрики
public interface IFastFoodStore {
    // метод продажи бургера с дефольной реализацией.
    // Если класс не переопределяет метод, то используется дефолтная реализация
    default IBurger sellBurger() throws Exception {
        throw new Exception("Burgers not sells");
    }

    // метод продажи напитка с дефольной реализацией.
    // Если класс не переопределяет метод, то используется дефолтная реализация
    default IDrink sellDrink() throws Exception {
        throw new Exception("Drinks not sells");
    }

    // метод получения меню с дефольной реализацией.
    // Если класс не переопределяет метод, то используется дефолтная реализация.
    // В данном случае, если меню нету, то возвраащется null - отсутсвие меню
    default List<IFood> getMenu(){
        return null;
    }
}
