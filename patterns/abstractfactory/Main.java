package abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new WindowsFactory();
        ComponentProducer componentProducer = new ComponentProducer(factory);
        componentProducer.render();

        factory = new MacFactory();
        componentProducer = new ComponentProducer(factory);
        componentProducer.render();
    }


}
