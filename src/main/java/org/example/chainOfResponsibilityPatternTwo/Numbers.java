package org.example.chainOfResponsibilityPatternTwo;

public class Numbers {
    private int number1;
    private int number2;
    private String calculationWanted;

    public Numbers(int newNumber1,int newNumber2,String calWanted){
        number1=newNumber1;
        number2=newNumber2;
        calculationWanted=calWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
