package com.cyzicus.factory;

import com.cyzicus.color.Blue;
import com.cyzicus.color.Color;
import com.cyzicus.color.Green;
import com.cyzicus.color.Red;
import com.cyzicus.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType color) {
        switch (color) {
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
            case RED:
                return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(ShapeType shape) {
        return null;
    }
}
