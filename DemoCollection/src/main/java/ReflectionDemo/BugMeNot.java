package ReflectionDemo;

public class BugMeNot {
    public static boolean isJavaClass(Class<?> clz) {
        return clz != null && clz.getClassLoader() == null;
    }
}

