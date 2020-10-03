package ReflectionDemo;
import ReflectionDemo.ReflectionTestClass;

import java.lang.reflect.Field;

public class ReflectionTestClassDemo {
    public static Class getClassOne(){
        /**
         * 获取类实例的方式1  通过import
         */
        Class cls1 = ReflectionTestClass.class;
        System.out.println(cls1.getName());
        return cls1;
    }

    public static Class getClassTwo() throws ClassNotFoundException {
        /**
         * 获取类实例的方式2   通过引入类的路径
         */
        String path = "ReflectionDemo.ReflectionTestClass";
        Class cls2 = Class.forName(path);
        System.out.println(cls2.getName());
        return cls2;
    }

    public static Class getClassThree(){
        /**
         * 获取类实例的方式3  通过实例变量getclass()
         */
        ReflectionTestClass reflectionTestClass = new ReflectionTestClass();
        Class cls3 = reflectionTestClass.getClass();
        System.out.println(cls3);
        return cls3;
    }

    public static Field getPublicField() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * Field getField(name)：根据字段名获取某个public的field（包括父类）
         */
        Field f = getClassTwo().getField("with");
        System.out.println(f);
        return f;
    }

    public static Field getPrivateDeclaredField() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
         */
        Field f = getClassTwo().getDeclaredField("fakeName");
        System.out.println(f);
        return f;
    }

    public static void getPublicFields() throws ClassNotFoundException {
        /**
         * Field[] getFields()：获取所有public的field（包括父类）
         */
        Field[] fields = getClassTwo().getFields();
        for (Field f : fields){
            System.out.println(f);
        }
    }

    public static Field getFieldName() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * 返回字段名称
         */
        Field f = getClassTwo().getDeclaredField("fakeName");
        System.out.println(f.getName());
        return f;
    }


    public static void getPrivateDeclareFields() throws ClassNotFoundException {
        /**
         * Field[] getFields()：获取所有public的field（包括父类）
         */
        Field[] fields = getClassTwo().getDeclaredFields();
        for (Field f : fields){
            System.out.println(f);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        getFieldName();
    }
}
