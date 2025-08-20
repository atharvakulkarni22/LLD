package factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactoryCreator shape;

        shape = new RectangleCreator();
        shape.draw();

        shape = new CircleCreator();
        shape.draw();
    }
}

// Object is decided at runtime.
//Resources are saved as new Object is only created when required.
//Can easily add new Shape triangle need to implement Triangle and add condition in ShapeFactory. Open closed principle.
