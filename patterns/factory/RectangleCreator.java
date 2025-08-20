package factory;

public class RectangleCreator extends ShapeFactoryCreator {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
