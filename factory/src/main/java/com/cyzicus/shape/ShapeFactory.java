package com.cyzicus.shape;

public class ShapeFactory {

    public enum ShapeType {
        CIRCLE, RECTANGLE, SQUARE
    }

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
        }
        return null;
    }

}
