package GenericsStudy;

import java.util.ArrayList;
import java.util.List;

/*
方法的返回值前面，修饰符后面增加<T>，表示为泛型方法。这样，就可以在方法的代码中使用T代表类型。
没有参数的泛型方法，类型的确定，是根据等号左边的类型推导泛型的最终类型。
 */
class Demo2 {

    public <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }
}

public class GenericsDemoTwo {

    public static void main(String[] args) throws java.lang.Exception {
        Demo2 demo2 = new Demo2();
        List<String> list = demo2.newArrayList();
        list.add("www.bo56.com");
        list.add("bo56.com");
        //list.add(1); 报错。只能添加String
        for (String str : list) {
            System.out.println(str);
        }
    }
}

