package abstractfactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Creating Mac CheckBox");
    }
}
