package org.example;

import org.example.BurgerBuilders.BurgerBuilder;
import org.example.BurgerBuilders.Implementations.ClassicBurgerBuilder;
import org.example.BurgerBuilders.Implementations.WhopperBuilder;

public class Client {
    public BurgerBuilder chooseBurger(String data) throws Exception {
        switch (data){
            case "Classic" -> {
                return new ClassicBurgerBuilder();
            }
            case "Whopper" -> {
                return new WhopperBuilder();
            }
            default -> {
                throw new Exception("There is no such burger");
            }
        }
    }
}
