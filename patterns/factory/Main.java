package factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactoryCreator shapeFactoryCreator;

        shapeFactoryCreator = new RectangleCreator();
        Shape rectangle = shapeFactoryCreator.getShape();
        rectangle.draw();

        shapeFactoryCreator = new CircleCreator();
        Shape circle = shapeFactoryCreator.getShape();
        circle.draw();
    }
}

// Object is decided at runtime.
//Resources are saved as new Object is only created when required.
//Can easily add new Shape triangle need to implement Triangle and add condition in ShapeFactory. Open closed principle.
