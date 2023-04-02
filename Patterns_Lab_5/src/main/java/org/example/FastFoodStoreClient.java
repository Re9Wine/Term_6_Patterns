package org.example;

import org.example.FastFoodStores.BurgerKing;
import org.example.FastFoodStores.IFastFoodStore;
import org.example.FastFoodStores.TastyAndPoint;

// класс клиента - служит для выбора заведения (фабрики)
public class FastFoodStoreClient {
    // метод выбора заведения (фабрики)
    public IFastFoodStore selectFastFoodStore(int fastFoodStore) throws Exception {
        switch (fastFoodStore){
            case 1 -> {
                return new BurgerKing();
            }
            case 2 -> {
                return new TastyAndPoint();
            }
            default -> {
                throw new Exception("Fast food store not found");
            }
        }
    }
}
