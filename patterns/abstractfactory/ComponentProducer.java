package abstractfactory;

public class ComponentProducer {
    private final Button button;
    private final CheckBox checkBox;

    ComponentProducer(AbstractFactory abstractFactory) {
        this.button = abstractFactory.createButton();
        this.checkBox = abstractFactory.createCheckBox();
    }

    public void render() {
        button.draw();
        checkBox.paint();
    }
}
