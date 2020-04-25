package ThinkingInJava.ThinkingInJavaChapterSeven;

import static net.mindview.util.Print.*;
class Art {
    Art() { print("Art constructor"); }
}
class Drawing extends Art {
    Drawing() { print("Drawing constructor"); }
}
public class ExtendsTest extends Drawing {
    public ExtendsTest() { print("Cartoon constructor"); }
    public static void main(String[] args) {
        ExtendsTest x = new ExtendsTest();
    }
}