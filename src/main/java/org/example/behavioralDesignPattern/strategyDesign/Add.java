package org.example.behavioralDesignPattern.strategyDesign;

import org.example.behavioralDesignPattern.strategyDesign.strategyInterface.StrategyInterface;

public class Add implements StrategyInterface {

    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
