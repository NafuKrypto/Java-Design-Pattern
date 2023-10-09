package org.example.builder.one;

public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 30.00f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
