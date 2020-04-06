package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetclass {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("gareen");
        System.out.println(names);
        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen1");
        System.out.println(names);

        names.add("gareen2");
        System.out.println(names);

        //Set不提供get()来获取指定位置的元素
        //所以遍历需要用到迭代器，或者增强型for循环
        HashSet<Integer> iname = new HashSet<Integer>();
        for (int i =0; i<20;i++){
            iname.add(i);
        }
        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator =iname.iterator();iterator.hasNext();){
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        System.out.println("~~~~~~~~~~分割线~~~~~~~~~~~~");
        for (Integer i : iname){
            System.out.println(i);
        }

    }
}
