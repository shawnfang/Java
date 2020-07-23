package ThinkingInJava.ThinkingInJavaChapterFive;

class Tree {
    int height;

    Tree() {
        System.out.println("plannig a seeding");
        height = 0;
    }

    // 重载构造器
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Create new Tree that is " + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    // 重载方法
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("重载");
        }
        new Tree();
    }
}
