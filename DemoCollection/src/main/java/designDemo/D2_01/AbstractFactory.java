package designDemo.D2_01;

public abstract class AbstractFactory {
    abstract ShapeD2 getShapeFactoryD2(String shape);

    abstract ColorD2 getColourFactoryD2(String color);
}
