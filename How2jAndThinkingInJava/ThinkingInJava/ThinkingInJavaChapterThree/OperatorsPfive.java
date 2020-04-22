package ThinkingInJava.ThinkingInJavaChapterThree;

public class OperatorsPfive {
    String name;
    String say;

    public static void main(String[] args) {
        OperatorsPfive d1 = new OperatorsPfive();
        OperatorsPfive d2 = new OperatorsPfive();
        d1.name = "spot";
        d1.say = "Ruff";
        d2.name = "scruffy";
        d2.say = "Wurf";
        OperatorsPfive d3 = d1;

        // 观察equals与 == 输出的结果
        System.out.println(d1.equals(d3));
        System.out.println(d1==d3);
    }
}
