package GenericsStudy;

import java.util.ArrayList;

import InterfaceAndExtends.AMHero;
import InterfaceAndExtends.APHero;
import InterfaceAndExtends.HeroBoss;

//
public class CollectionAndGenerics {
    public static void main(String[] args) {

        // 不使用泛型
        //不使用泛型带来的问题
        //ADHero（物理攻击英雄） AMHero（魔法攻击英雄）都是Hero的子类
        //ArrayList 默认接受Object类型的对象，所以所有对象都可以放进ArrayList中
        //所以get(0) 返回的类型是Object
        //接着，需要进行强制转换才可以得到APHero类型或者AMHero类型。
        ArrayList heros = new ArrayList();
        heros.add(new AMHero());
        heros.add(new APHero());
        APHero apHero = (APHero) heros.get(1);
        AMHero amHero = (AMHero) heros.get(0);

        //使用泛型的好处：
        //泛型的用法是在容器后面添加<Type>
        //Type可以是类，抽象类，接口
        //泛型表示这种容器，只能存放AMHero，APHero就放不进去了。
        ArrayList<AMHero> heroa = new ArrayList<AMHero>();
        // 只放的进AMHero类型
        heroa.add(new AMHero());
        // 放不进APHero类型
        //heroa.add(new APHero());
        AMHero amHero1 = heroa.get(0);
        System.out.println(amHero1);

        // 容器的泛型HeroBoss，那么HeroBoss的子类都可以放进去
        // 与HeroBoss无关的LifePotion放不进去
        ArrayList<HeroBoss> heroBosses = new ArrayList<HeroBoss>();
        heroBosses.add(new AMHero());
        heroBosses.add(new APHero());
        //heroBosses.add(new LifePotion());

        // 泛型简写 后面不需要写泛型的类型
        ArrayList<HeroBoss> HB = new ArrayList<HeroBoss>();
        // 根据数字类的知识，设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串
        ArrayList<Number> nu = new ArrayList<Number>();
        nu.add(new Integer(1));
        nu.add(new Float(1));
        System.out.println(nu);

    }
}
