package GenericsStudy;

import InterfaceAndExtends.APHero;
import InterfaceAndExtends.HeroBoss;
import InterfaceAndExtends.AMHero;

import java.util.ArrayList;

public class GenericsExtendsAndSuper {
    public static void main(String[] args) {
        ArrayList<APHero> apHeroesList = new ArrayList<APHero>();
        apHeroesList.add(new APHero());
        //? extends HeroBoss表示这是一个HeroBoss泛型或者其子类泛型
        //heroList 的泛型可以是Hero
        //heroList 的泛型可以使APHero
        //heroList 的泛型可以使ADHero
        //可以确凿的是，从heroList取出来的对象，一定是可以转型成HeroBoss的
        ArrayList<? extends HeroBoss> herolist = apHeroesList;
        System.out.println(herolist);
        HeroBoss h = herolist.get(0);
        // 不能往里面加对象 有可能是任意对象
        //herolist.add(new AMHero());
        System.out.println(h);

        // ArrayList herosuper<? super HeroBoss> 表示这是一个HeroBoss泛型或者其父类泛型
        //heroList的泛型可能是HeroBoss
        //heroList的泛型可能是Object
        ArrayList<? super HeroBoss> herosuper = new ArrayList<Object>();
        herosuper.add(new HeroBoss());
        // 可以插入任何对象
        herosuper.add(new APHero());
        herosuper.add(new AMHero());
        // 不能从里面取对象，因为其泛型可能是Object,而Object是强转HeroBoss会失败
        //HeroBoss h1 = herosuper.get(0);


        // ? 泛型通配符，表示任意泛型
        ArrayList<APHero> apHeros = new ArrayList<APHero>();
        ArrayList<?> generalList = apHeros;
        //?的缺陷1： 既然?代表任意泛型，那么换句话说，你就不知道这个容器里面是什么类型
        //所以只能以Object的形式取出来
        Object o = generalList.get(0);
        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
        //generalList.add(new APHero());

        // 总结
        //如果希望只取出，不插入，就使用? extends Hero
        //如果希望只插入，不取出，就使用? super Hero
        //如果希望，又能插入，又能取出，就不要用通配符？

    }
}
