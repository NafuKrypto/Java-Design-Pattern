package org.example.decoratorPatternTwo;

public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Draw Red Lines");
    }
}
