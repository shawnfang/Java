package designDemo.D1_01;

public class ShapeFactory {
    public Shape getShape(String shapeTyep){
        if (shapeTyep == null) {
            return null;
        }
        if (shapeTyep.equalsIgnoreCase("Square")) {
            return new Square();
        }
        if (shapeTyep.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shapeTyep.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
