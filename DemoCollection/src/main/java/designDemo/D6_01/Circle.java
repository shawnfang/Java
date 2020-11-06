package designDemo.D6_01;

public class Circle extends Shape {
    public int x;
    public int y;
    public int radius;

    @Override
    void Circle() {
        System.out.println("我要画个圆，x: "+x+" y: "+y+" radius: "+radius);
    }

    @Override
    String draw() {
        return null;
    }
}
