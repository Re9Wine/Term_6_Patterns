package org.example;

import org.example.BurgerBuilders.BurgerBuilder;

public class Director {
    BurgerBuilder burgerBuilder;

    public Director(){}
    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger(){
        burgerBuilder.setName();
        burgerBuilder.setBun();
        burgerBuilder.setCutlet();
        burgerBuilder.setTomato();
        burgerBuilder.setOnion();
        burgerBuilder.setCucumber();
        burgerBuilder.setSauce();
        burgerBuilder.setCheese();
        burgerBuilder.setBacon();
        burgerBuilder.setPepper();
        burgerBuilder.setSalad();

        return burgerBuilder.createBurger();
    }
}
