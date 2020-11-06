package designDemo.D6_01;

public class Circle extends Shape {
    public Circle(DrawAPI drawAPI){
        super(drawAPI);
    }

    @Override
    void draw() {
        drawAPI.drawCircle();
    }
}
