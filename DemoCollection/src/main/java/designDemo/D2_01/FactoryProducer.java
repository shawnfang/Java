package designDemo.D2_01;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryType){
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("ColourFactory")) {
            return new ColourFactoryD2();
        }
        if (factoryType.equalsIgnoreCase("ShapeFactory")) {
            return new ShapeFactoryD2();
        }
        return null;
    }
}
