package main;

import main.services.ShapeService;
import main.shapeEssens.Circle;
import main.shapeEssens.Rectangle;
import main.shapeEssens.Shape;
import main.shapeEssens.Triangle;

public class Main {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();

        Shape shape = new Circle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(shapeService.getShapeType(shape));
        System.out.println(shapeService.getShapeType(circle));
        System.out.println(shapeService.getShapeType(triangle));

        shape = new Rectangle();

        System.out.println(shapeService.getShapeType(shape));

    }
}
