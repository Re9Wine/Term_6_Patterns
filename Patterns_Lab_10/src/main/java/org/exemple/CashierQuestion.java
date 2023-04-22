package org.exemple;

public abstract class CashierQuestion {
    private int goodsThreshold;
    private CashierQuestion nextQuestion;

    public CashierQuestion(int goodsThreshold) {
        this.goodsThreshold = goodsThreshold;
    }

    public void setNextQuestion(CashierQuestion nextQuestion) {
        this.nextQuestion = nextQuestion;
    }

    public void handleQuestion(int quantityOfGoods){
        if(quantityOfGoods >= goodsThreshold){
            askQuestion();
        }

        if(nextQuestion != null){
            nextQuestion.handleQuestion(quantityOfGoods);
        }
    }

    public abstract void askQuestion();
}
