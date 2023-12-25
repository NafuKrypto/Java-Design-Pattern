package org.example.structuralDesignPattern.decoratorPattern;

public class Mozzarella extends ToppingDecorator  {
    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Mozarella";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+ .50;
    }
}
