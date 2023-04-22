package org.exemple;

public class Main {
    public static void main(String[] args) {
        CashierQuestion _bonusCard = new BonusCardQuestion();
        CashierQuestion _package = new PackageQuestion();
        CashierQuestion _payment = new PaymentQuestion();

        _payment.setNextQuestion(_package);
        _package.setNextQuestion(_bonusCard);

        int goodsNumberInCheck_1 = 1;
        int goodsNumberInCheck_2 = 2;
        int goodsNumberInCheck_3 = 3;

        _payment.handleQuestion(goodsNumberInCheck_1);
        System.out.println("--------------------------------------");
        _payment.handleQuestion(goodsNumberInCheck_2);
        System.out.println("--------------------------------------");
        _payment.handleQuestion(goodsNumberInCheck_3);
    }
}
