package org.example.decoratorPatternTwo;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draweing circle");
    }
}
