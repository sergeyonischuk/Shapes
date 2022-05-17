package main.services;

import main.shapeEssens.Shape;

public class ShapeService {
    public String getShapeType(Shape shape) {
        return "This is " + shape.getShapeType();
    }
}
