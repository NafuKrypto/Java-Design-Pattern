package org.example.creationalDesignPattern.builder.one;

public abstract class ColdDrink implements Item{
    public Packing packing(){
        return new Bottle();
    }
    public abstract float price();
}
