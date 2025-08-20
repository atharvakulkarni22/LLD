package abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Creating Windows CheckBox");
    }
}
