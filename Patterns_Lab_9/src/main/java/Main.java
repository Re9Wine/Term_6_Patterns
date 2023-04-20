package org.example;

import org.example.State.IState;
import org.example.State.TVStateOff;
import org.example.State.TVStateOn;

public class Main {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        IState tvStateOn = new TVStateOn();
        IState tvStateOff = new TVStateOff();

        context.setState(tvStateOn);
        context.doAction();

        context.setState(tvStateOff);
        context.doAction();
    }
}