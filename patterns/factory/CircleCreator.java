package factory;

public class CircleCreator extends ShapeFactoryCreator {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
