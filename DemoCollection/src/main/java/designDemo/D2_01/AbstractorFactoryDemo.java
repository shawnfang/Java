package designDemo.D2_01;

public class AbstractorFactoryDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory = factoryProducer.getFactory("ColourFactory");
        abstractFactory.getColourFactoryD2("Red").fill();
    }
}
