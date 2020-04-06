package CollectionFramework;

import java.util.ArrayList;
//Collections是一个类，容器的工具类,就如同Arrays是数组的工具类
import java.util.Collections;
import java.util.List;
public class Collectionsclass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        // 反转numbers
        Collections.reverse(numbers);
        System.out.println(numbers);

        // 混淆排序
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // 排序，混淆后的排序
        Collections.sort(numbers);
        System.out.println(numbers);

        // 交换位置
        Collections.swap(numbers,1,6);
        System.out.println(numbers);

        // 向右滚动5个单位
        Collections.rotate(numbers,5);
        System.out.println(numbers);
    }
}
