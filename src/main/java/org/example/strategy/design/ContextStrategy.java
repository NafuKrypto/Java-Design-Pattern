package org.example.strategy.design;

import org.example.strategy.design.strategyInterface.StrategyInterface;

public class ContextStrategy {
    private StrategyInterface strategyInterface;

    public ContextStrategy(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public int executeStrategy(int num1,int num2){

       return strategyInterface.doOperation(num1,num2);

    }
}
