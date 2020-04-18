package Operators;

public class DogCTPF {
    String name;
    String say;

    public static void main(String[] args) {
        DogCTPF d1 = new DogCTPF();
        DogCTPF d2 = new DogCTPF();
        d1.name = "spot";
        d1.say = "Ruff";
        d2.name = "scruffy";
        d2.say = "Wurf";
        DogCTPF d3 = d1;

        // 观察equals与 == 输出的结果
        System.out.println(d1.equals(d3));
        System.out.println(d1==d3);
    }
}
