package org.exemple;

public class BonusCardQuestion extends CashierQuestion{
    public BonusCardQuestion(){
        super(2);
    }

    @Override
    public void askQuestion() {
        System.out.println("Do you have a bonus card?");
    }
}
