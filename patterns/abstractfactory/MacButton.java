package abstractfactory;

public class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Creating Mac Button");
    }
}
