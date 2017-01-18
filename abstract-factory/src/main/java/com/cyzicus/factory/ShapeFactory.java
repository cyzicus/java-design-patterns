package com.cyzicus.factory;

import com.cyzicus.color.Color;
import com.cyzicus.shape.Circle;
import com.cyzicus.shape.Rectangle;
import com.cyzicus.shape.Shape;
import com.cyzicus.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType color) {
        return null;
    }

    @Override
    public Shape getShape(ShapeType shape) {
        switch (shape) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
        }
        return null;
    }
}
