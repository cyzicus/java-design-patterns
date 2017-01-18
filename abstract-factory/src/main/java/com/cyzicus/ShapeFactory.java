package com.cyzicus;

import com.cyzicus.AbstractFactory;
import com.cyzicus.color.Color;
import com.cyzicus.shape.*;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(ColorType color) {
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
