package org.exemple;

public class PackageQuestion extends CashierQuestion{

    public PackageQuestion(){
        super(3);
    }

    @Override
    public void askQuestion() {
        System.out.println("Will you take the package?");
    }
}
