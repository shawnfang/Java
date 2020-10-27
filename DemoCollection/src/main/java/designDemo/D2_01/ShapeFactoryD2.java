package designDemo.D2_01;

import designDemo.D1_01.Square;

public class ShapeFactoryD2 extends AbstractFactory  {

    @Override
    ShapeD2 getShapeFactoryD2(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new SquareD2();
        }
        return null;
    }

    @Override
    ColorD2 getColourFactoryD2(String color) {
        return null;
    }
}
