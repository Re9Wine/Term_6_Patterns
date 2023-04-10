package org.example.BurgerBuilders.Implementations;

import org.example.BurgerBuilders.BurgerBuilder;

public class WhopperBuilder extends BurgerBuilder {
    @Override
    public void setName() {
        burger.setName("whopper");
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
        burger.setCucumber("fresh");
    }

    @Override
    public void setSauce() {
        burger.setSauce("ketchup");
    }

    @Override
    public void setCheese() {
        burger.setCheese(true);
    }

    @Override
    public void setBacon() {
        burger.setBacon(true);
    }

    @Override
    public void setPepper() {
        burger.setPepper("jalapeno");
    }

    @Override
    public void setSalad() {
        burger.setSalad(true);
    }
}
