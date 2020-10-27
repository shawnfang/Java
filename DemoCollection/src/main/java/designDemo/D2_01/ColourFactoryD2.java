package designDemo.D2_01;

public class ColourFactoryD2 extends AbstractFactory{

    @Override
    ShapeD2 getShapeFactoryD2(String shapeTyep) {
        return null;
    }

    @Override
    ColorD2 getColourFactoryD2(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("Green")) {
            return new Green();
        }
        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        }
        return null;
    }
}
