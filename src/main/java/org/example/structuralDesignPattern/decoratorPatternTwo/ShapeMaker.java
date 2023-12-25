package org.example.structuralDesignPattern.decoratorPatternTwo;

public class ShapeMaker {
    public   static void  main(String[] args){
        Shape circle =new Circle();
        Shape rectangle =new Rectangle();

        circle.draw();
        rectangle.draw();

        Shape redCircle=new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
