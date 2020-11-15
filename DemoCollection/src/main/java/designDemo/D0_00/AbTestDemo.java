package designDemo.D0_00;

public class AbTestDemo {
    public static void main(String[] args) {
        AbstractorAnimal abstractorAnimal = new AbMan();
        abstractorAnimal.eat();

        AbstractorAnimal abstractorAnimal1 = new AbWomen(160,80);
        abstractorAnimal1.eat();
    }
}
