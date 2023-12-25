package org.example.creationalDesignPattern.builder.one;

public abstract  class Burger implements Item {
    public Packing packing(){
    return new Wrapper();
    }

    public abstract float price();

}
