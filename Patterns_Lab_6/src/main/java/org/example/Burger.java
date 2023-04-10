package org.example;

public class Burger {
    private String name;
    private String bun;
    private String cutlet;
    private boolean tomato;
    private boolean onion;
    private String cucumber;
    private String sauce;
    private boolean cheese;
    private boolean bacon;
    private String pepper;
    private boolean salad;

    public Burger() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setCutlet(String cutlet) {
        this.cutlet = cutlet;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setCucumber(String cucumber) {
        this.cucumber = cucumber;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = bun + " bun with "
                + cutlet + " cutlet, "
                + (salad ? "salad, " : "")
                + (tomato ? "tomato, " : "")
                + (onion ? "onion, " : "")
                + cucumber + " cucumber, "
                + sauce + ", "
                + (cheese ? "cheese, " : "")
                + (bacon ? "bacon, " : "")
                + (pepper != null ? pepper + " pepper." : "");

        output = output.trim();

        if(output.charAt(output.length() - 1) == ','){
            output = new StringBuilder(output).replace(output.length() - 1, output.length(), ".").toString();
        }

        return output;
    }
}
