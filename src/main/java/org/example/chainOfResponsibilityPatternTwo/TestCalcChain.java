package org.example.chainOfResponsibilityPatternTwo;

public class TestCalcChain {
    public static void main(String[] args) {
        Chain chainCalc1 = new Add();
        Chain chainCalc2 = new Sub();
        Chain chainCalc3 = new Mul();
        Chain chainCalc4 = new Div();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request= new Numbers(4,2,"mul");
        chainCalc1.calculate(request);
    }
}
