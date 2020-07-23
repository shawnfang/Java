package ThinkingInJava.ThinkingInJavaChapterSeven;

class Draw {
    public void draw() {
        System.out.println("draw");
    }
}

class Erase {
    public void erase() {
        System.out.println("erase");
    }
}

class Work {
    public void work() {
        new Draw().draw();
        new Erase().erase();
    }
}

public class Composition {
    public static void main(String[] args) {
        new Work().work();
    }
}
