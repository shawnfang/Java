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
            System.out.println(h);
        }

        System.out.println("第二种遍历 使用迭代器");
        Iterator<HeroBoss> it = heroes.iterator();
        System.out.println(" 使用while");
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

        ArrayList<HeroBoss> hb = new ArrayList<>();
        for(int i = 0;i < 100;i++){
            hb.add(new HeroBoss("hero"+i));
        }
        for (HeroBoss h: hb){
            System.out.println(h.name);
        }
        System.out.println("~~~~~~~~~~~~~~分割线~~~~~~~~~~~~~~~~~");
        ArrayList<HeroBoss> del = new ArrayList<>();
        for (int n = 0;n < 100; n++ ){
            if(n%8==0){
                for (HeroBoss s1 : hb) {
                    del.add(s1);
                }

            }else {
                for (HeroBoss s : del) {
                    hb.remove(s);
                }
            }

        }
        for (HeroBoss ss : del){
            System.out.println(ss);
        }

    }
}
