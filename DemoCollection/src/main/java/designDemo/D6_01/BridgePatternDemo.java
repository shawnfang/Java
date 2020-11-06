package designDemo.D6_01;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle());
        Shape greenCircle = new Circle(new GreenCirclei());
        redCircle.draw();
        greenCircle.draw();
    }
}
