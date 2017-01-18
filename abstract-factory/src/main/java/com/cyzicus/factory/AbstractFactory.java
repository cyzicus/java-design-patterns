package com.cyzicus.factory;

import com.cyzicus.color.Color;
import com.cyzicus.shape.Shape;

public abstract class AbstractFactory {

    public enum ColorType {
        RED, GREEN, BLUE
    }

    public enum ShapeType {
        CIRCLE, SQUARE, RECTANGLE
    }

    public abstract Color getColor(ColorType color);
    public abstract Shape getShape(ShapeType shape);
}
