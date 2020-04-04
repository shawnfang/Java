package CollectionFramework;

import interfaceAndExtends.HeroBoss;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// ArraryList遍历
public class ArraryListTraversal {
    public static void main(String[] args) {
        ArrayList<HeroBoss> heroes = new ArrayList<HeroBoss>();

        for(int i = 0;i < 5; i++){
            heroes.add(new HeroBoss("hero name"+i));
        }

        System.out.println("第一种遍历 for循环");
        for(int i = 0;i < heroes.size(); i++){
            HeroBoss h = heroes.get(i);
            System.out.println(h.name);
        }

        System.out.println("第二种遍历 使用迭代器");
        Iterator<HeroBoss> it = heroes.iterator();
        System.out.println(" 使用while");
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while (it.hasNext()){
            HeroBoss h1 = it.next();
            System.out.println(h1);
        }
        System.out.println(" 使用for");
        for (Iterator<HeroBoss> iterator = heroes.iterator(); iterator.hasNext();){
            HeroBoss h2 = (HeroBoss)iterator.next();
            System.out.println(h2);
        }

        System.out.println("第三种遍历 使用for增强");
        for (HeroBoss h : heroes){
            System.out.println(h);
        }

        //首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
        //hero 0
        //hero 1
        //hero 2
        //...
        //hero 99.
        //
        //通过遍历的手段，删除掉名字编号是8的倍数的对象
        ArrayList<HeroBoss> hb = new ArrayList<>();
        for(int i = 0;i < 100;i++){
            hb.add(new HeroBoss("hero"+i));
        }
        System.out.println("~~~~~~~~~~~~~~分割线~~~~~~~~~~~~~~~~~");
        for (int n = 0;n < hb.size(); n++ ){
            if(n%7==0){
                hb.remove(n);
            }
        }
        for (HeroBoss h: hb){
            System.out.println(h.name);
        }


    }
}
