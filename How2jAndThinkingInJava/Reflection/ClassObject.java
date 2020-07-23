package Reflection;

import Reflection.ReflectionHero;

public class ClassObject {
    public static void main(String[] args) {
        // 获取类对象的三种方式
        //获取类对象有3种方式
        //1. Class.forName
        //2. Hero.class
        //3. new Hero().getClass()
        //
        //在一个JVM中，一种类，只会有一个类对象存在。所以以上三种方式取出来的类对象，都是一样的。
        //
        //注： 准确的讲是一个ClassLoader下，一种类，只会有一个类对象存在。通常一个JVM下，只会有一个ClassLoader。因为还没有引入ClassLoader概念， 所以暂时不展开了。
        String className = "Reflection.ReflectionHero";
        try {
            Class pClass1 = Class.forName(className);
            Class pClass2 = ReflectionHero.class;
            Class pClass3 = new ReflectionHero().getClass();
            System.out.println(pClass1 == pClass2);
            System.out.println(pClass2 == pClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
