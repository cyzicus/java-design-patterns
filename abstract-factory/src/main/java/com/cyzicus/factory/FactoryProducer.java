package com.cyzicus.factory;

public class FactoryProducer {

    public enum FactoryType {
        COLOR, SHAPE
    }

    public static AbstractFactory getFactory(FactoryType type) {
        switch (type) {
            case COLOR:
                return new ColorFactory();
            case SHAPE:
                return new ShapeFactory();
        }
        return null;
    }
}
