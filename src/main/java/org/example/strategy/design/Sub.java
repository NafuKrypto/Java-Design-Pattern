package org.example.strategy.design;

import org.example.strategy.design.strategyInterface.StrategyInterface;

import static java.lang.Math.abs;

public class Sub implements StrategyInterface {
    @Override
    public int doOperation(int num1, int num2) {
        return abs(num2-num1);
    }
}
