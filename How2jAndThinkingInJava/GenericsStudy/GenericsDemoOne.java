package GenericsStudy;
//类名后面增加<T>，说明是泛型类。T可以视为类型的占位符。泛型类的代码就可以使用这个占位符T。
class Demo <T> {
    T field;

    public void setFiled(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}

public class GenericsDemoOne {

    public static void main (String[] args) throws java.lang.Exception
    {
        Demo<String> demo = new Demo<String>();
        demo.setFiled("www.bo56.com");
        System.out.println(demo.getField());
    }
}
