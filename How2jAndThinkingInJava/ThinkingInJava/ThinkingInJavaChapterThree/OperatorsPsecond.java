package ThinkingInJava.ThinkingInJavaChapterThree;

class Tank {
    float level;
}

/*
对于基本数据类型来说，赋值是很简单的，因为基本数据类型（在堆栈中）存储了实际的数值，
而并非指向一个对象的引用，所有在为其赋值的时候，是直接将一个地方的内容复制到了另一个地方。
但是在为对象“赋值”的时候，情况却发生了变化。对一个对象进行操作的时候，我们真正操作的是对象的引用，
所以倘若“将一个对象赋值给另一个对象”，实际上是将“引用”从一个地方复制到另一个地方
 */
public class OperatorsPsecond {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 1.0f;
        t2.level = 2.0f;
        System.out.println("t1:" + t1.level + " t2: " + t2.level);
        // 将一个对象赋值给另外一个对象时，意味着，两个对象的引用指向同一个地方
        t1 = t2;
        System.out.println("t1:" + t1.level + " t2: " + t2.level);
        // 所以在修改一个对象的时候，另外一个对象也会跟着被改变
        t2.level = 3.3f;
        System.out.println("t1:" + t1.level + " t2: " + t2.level);


        Tank t3 = new Tank();
        Tank t4 = new Tank();
        t3.level = 4.0f;
        t4.level = 5.0f;
        System.out.println("t3:" + t3.level + " t4: " + t4.level);
        // 通过别名机制，保持对象的独立
        t3.level = t4.level;
        System.out.println("t3:" + t3.level + " t4: " + t4.level);
        // 再次修改对象的时候，将不再会修改到其他对象的引用
        t3.level = 6.0f;
        System.out.println("t3:" + t3.level + " t4: " + t4.level);
    }
}
