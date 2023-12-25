package org.example.structuralDesignPattern.decoratorPattern;

public abstract class ToppingDecorator implements Pizza {
//    only subclass can access it
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }


}
