package org.example.behavioralDesignPattern.strategyDesign;

import org.example.behavioralDesignPattern.strategyDesign.strategyInterface.StrategyInterface;

public class ContextStrategy {
    private StrategyInterface strategyInterface;

    public ContextStrategy(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public int executeStrategy(int num1,int num2){

       return strategyInterface.doOperation(num1,num2);

    }
}
