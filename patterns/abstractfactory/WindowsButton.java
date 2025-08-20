package abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("Creating a windows button");
    }
}
