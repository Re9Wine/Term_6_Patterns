package org.example.BurgerBuilders;

import org.example.Burger;

public abstract class BurgerBuilder {
    public Burger burger = new Burger();

    public Burger createBurger(){
        return burger;
    }

    public abstract void setName();
    public abstract void setBun();
    public abstract void setCutlet();
    public abstract void setTomato();
    public abstract void setOnion();
    public abstract void setCucumber();
    public abstract void setSauce();
    public abstract void setCheese();
    public abstract void setBacon();
    public abstract void setPepper();
    public abstract void setSalad();
}
