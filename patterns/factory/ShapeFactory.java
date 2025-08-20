package factory;

abstract class ShapeFactoryCreator {
    public abstract Shape createShape();

    public void draw() {
        Shape shape = createShape();
        shape.draw();
    }
}
