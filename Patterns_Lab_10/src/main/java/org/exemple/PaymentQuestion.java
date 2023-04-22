package org.exemple;

public class PaymentQuestion extends CashierQuestion{
    public PaymentQuestion(){
        super(1);
    }

    @Override
    public void askQuestion() {
        System.out.println("You will pay by card?");
    }
}
