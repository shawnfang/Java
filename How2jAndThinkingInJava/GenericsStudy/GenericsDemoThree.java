package GenericsStudy;
//有参数方法定义时，使用泛型
class Demo3 {

    public <T> void showClass(T t) {
        System.out.println(t.getClass());
    }
}

public class GenericsDemoThree {

    public static void main (String[] args) throws java.lang.Exception
    {
        Demo3 demo3 = new Demo3();
        demo3.showClass("123");
        demo3.showClass(123);
    }
}
