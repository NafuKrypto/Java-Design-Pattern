package org.example.strategy.design;

import org.example.strategy.design.strategyInterface.StrategyInterface;

public class Mul implements StrategyInterface {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
