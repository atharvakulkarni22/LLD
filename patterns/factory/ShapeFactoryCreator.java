package factory;

abstract class ShapeFactoryCreator {
    public abstract Shape createShape();

    public Shape getShape() {
        return createShape();
    }
}
