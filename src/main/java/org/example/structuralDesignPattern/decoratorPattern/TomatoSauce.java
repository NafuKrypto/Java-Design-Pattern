package org.example.structuralDesignPattern.decoratorPattern;

public class TomatoSauce extends  ToppingDecorator{
        public TomatoSauce(Pizza pizza) {
            super(pizza);
            System.out.println("Adding Sauce");
        }
        @Override
        public String getDescription() {
            return pizza.getDescription()+", Sauce";
        }
        @Override
        public double getCost() {
            return pizza.getCost()+ .35;
        }


}
