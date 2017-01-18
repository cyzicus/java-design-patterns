package com.cyzicus;

import com.cyzicus.color.Color;
import com.cyzicus.shape.Shape;

public abstract class AbstractFactory {

    public enum ColorType {
        RED, GREEN, BLUE
    }

    public enum ShapeType {
        CIRCLE, SQUARE, RECTANGLE
    }

    abstract Color getColor(ColorType color);
    abstract Shape getShape(ShapeType shape);
}
