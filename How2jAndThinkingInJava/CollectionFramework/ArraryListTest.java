package CollectionFramework;

import java.util.ArrayList;

import ClassAndObject.Heroclass;

public class ArraryListTest {
    public static void main(String[] args) {
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        heros.add(new Heroclass());
        System.out.println(heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add(new Heroclass());
        System.out.println(heros.size());

        // add方法 第一种是直接add对象，把对象加在最后面
        ArrayList hero = new ArrayList();
        for (int i = 0; i < 5; i++) {
            hero.add(new ArraryListHero("hero" + i));
        }
        System.out.println(hero);
        // add方法  第二种在指定位置增加对象
        ArraryListHero SpecialHero = new ArraryListHero("special hero");
        hero.add(3, SpecialHero);
        System.out.println(hero.toString());

        // 判断对象是否存在  contains是用来判断对象是否已经存在
        System.out.println(hero.contains(new ArraryListHero("hero 1")));
        System.out.println(hero.contains(SpecialHero));

        ArraryListHero a = new ArraryListHero("hero test");
        hero.add(a);
        System.out.println(hero.contains(a));

        //获取指定位置的对象get  获取SpeciaHero
        System.out.println(hero.get(3));

        // 获取对象所处的位置indexOf
        System.out.println(hero.indexOf(SpecialHero));

        // 删除对象 remove
        System.out.println(hero.remove(2));
        System.out.println(hero.toString());

        // 替换对象 set
        System.out.println(hero.set(5, new ArraryListHero("hero replace")));
        System.out.println(hero);

        // 获取ArrayList的大小
        System.out.println(hero.size());

        // 加入另外一个容器所有的对象
        ArrayList anotherArrayList = new ArrayList();
        anotherArrayList.add(new ArraryListHero("hero o1"));
        System.out.println(anotherArrayList);
        hero.addAll(anotherArrayList);
        System.out.println(hero);

        // 清空容器中所有对象
        hero.clear();
        System.out.println(hero);
    }
}
