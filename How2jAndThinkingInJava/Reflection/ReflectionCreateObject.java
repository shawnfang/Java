package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import Reflection.ReflectionHero;
import sun.security.jca.GetInstance;

public class ReflectionCreateObject {
    public static void main(String[] args) {
        // 传统创建对象
        ReflectionHero RH = new ReflectionHero();

        // 使用反射创建对象
        try {
            String className = "Reflection.ReflectionHero";
            // 类对象
            Class pClass = Class.forName(className);
            // 构造器
            Constructor c = pClass.getConstructor();
            // 通过构造器实例化
            ReflectionHero R = (ReflectionHero) c.newInstance();
            R.name = "gareen";
            System.out.println(R.name);
            System.out.println(ReflectionHero.copyright);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //<二>
        // 通过反射对象修改属性
        System.out.println("通过反射对象修改属性");
        // 传统修改属性的方法
        RH.name = "gareen";

        // 通过反射对象修改属性
        try {
            // 获取类的name字段
            Field f1 = RH.getClass().getDeclaredField("name");
            // 修改这个字段的值
            f1.set(RH, "teemo");
            System.out.println(RH.name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //getField和getDeclaredField的区别
        //这两个方法都是用于获取字段
        //getField 只能获取public的，包括从父类继承来的字段。
        //getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
        // (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
        System.out.println("通过反射机制，调用对象的方法");
        //通过反射机制，调用对象的方法
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = RH.getClass().getMethod("setName", String.class);
            // 对h对象，调用这个方法
            m.invoke(RH, "盖盖");
            System.out.println(RH.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
