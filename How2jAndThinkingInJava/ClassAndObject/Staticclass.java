package ClassAndObject;

public class Staticclass {
    // 类属性，静态属性
    // 如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
    static String copyright;

    // 实例属性，对象属性
    public String name;

    public static void main(String[] args){


        Staticclass S = new Staticclass();

        // 如果一个属性，每个对象都不一样，比如name，这样的属性就应该设计为对象属性，因为它是跟着对象走的，每个对象的name都是不同的
        //如果一个属性，所有的对象都共享，都是一样的，那么就应该设计为类属性。比如血量上限，所有的英雄的血量上限都是 9999，不会因为英雄不同，而取不同的值。 这样的属性，就适合设计为类属性
        S.name = "gailun";

        Staticclass.copyright = "Gailun公司所有权";
    }
}
