package org.example.State;

public class TVStateOff implements IState{
    @Override
    public void doAction() {
        System.out.println("Tv is turned OFF");
    }
}
