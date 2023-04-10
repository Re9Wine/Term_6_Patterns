package org.example.BurgerBuilders.Implementations;

import org.example.BurgerBuilders.BurgerBuilder;

public class ClassicBurgerBuilder extends BurgerBuilder {
    @Override
    public void setName() {
        burger.setName("classic burger");
    }

    @Override
    public void setBun() {
        burger.setBun("white");
    }

    @Override
    public void setCutlet() {
        burger.setCutlet("beef");
    }

    @Override
    public void setTomato() {
    burger.setTomato(true);
    }

    @Override
    public void setOnion() {
        burger.setOnion(true);
    }

    @Override
    public void setCucumber() {
        burger.setCucumber("pickled");
    }

    @Override
    public void setSauce() {
        burger.setSauce("ketchup");
    }

    @Override
    public void setCheese() {
        burger.setCheese(false);
    }

    @Override
    public void setBacon() {
        burger.setBacon(false);
    }

    @Override
    public void setPepper() {
        burger.setPepper(null);
    }

    @Override
    public void setSalad() {
        burger.setSalad(true);
    }
}
