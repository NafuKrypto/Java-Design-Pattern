package org.example.strategy.design;

import org.example.strategy.design.strategyInterface.StrategyInterface;

public class Add implements StrategyInterface {

    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
