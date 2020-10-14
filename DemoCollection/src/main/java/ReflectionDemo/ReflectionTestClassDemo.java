package ReflectionDemo;
import ReflectionDemo.ReflectionTestClass;

import java.lang.reflect.*;

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
        ReflectionTestClass reflectionTestClass = new ReflectionTestClass("xiaoming");
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

    public static Field getFieldType() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * getType()：返回字段类型，也是一个Class实例
         */
        Field f = getClassTwo().getDeclaredField("fakeName");
        System.out.println(f.getType());
        return f;
    }

    public static Field getFieldModifiers() throws ClassNotFoundException, NoSuchFieldException {
        /**
         * getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
         */
        Field f = getClassTwo().getDeclaredField("fakeName");
        System.out.println(Modifier.isPrivate(f.getModifiers()));
        return f;
    }

    public static void getAndSetFieldValue() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /**
         * 获取字段值:先获取Class实例，再获取Field实例，然后，用Field.get(Object)获取指定实例的指定字段的值。
         */
        Object r = new ReflectionTestClass("fangxiao");
        Class c = r.getClass();
        Field f = c.getDeclaredField("name");
        System.out.println(f);
        /**
         * 由于f 获取的字段是private，所以需要重新设置f 获取到的字段的修饰属性
         * 另外一种方法就是把字段设置为public
         */
        f.setAccessible(true);
        Object o = f.get(r);
        System.out.println(o);
        /**
         * 重新设置字段的值
         */
        f.set(r,"xiaoxiaofang");
        System.out.println(f.get(r));

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

    public static void getPublicMethod() throws ClassNotFoundException, NoSuchMethodException {
        /**
         * Method getMethod(name, Class…)：获取某个public的Method（包括父类）
         */
        /**
         * 无参
         */
        Method f = getClassTwo().getMethod("getType");
        System.out.println(f);
        /**
         * 带参
         */
        Method f1 = getClassTwo().getMethod("setType",int.class);
        System.out.println(f1);
    }

    public static Method getPrivateDeclaredMethod() throws ClassNotFoundException, NoSuchMethodException {
        /**
         * Method getDeclaredMethod(name, Class…)：获取当前类的某个Method（不包括父类）
         */
        Method f = getClassTwo().getDeclaredMethod("getName");
        System.out.println(f);
        return f;
    }

    public static void getPublicMethods() throws ClassNotFoundException {
        /**
         * Method[] getMethods()：获取所有public的Method（包括父类）
         */
        Method[] m = getClassTwo().getMethods();
        for (Method f : m){
            System.out.println(f);
        }
    }

    public static void getPrivateDeclareMethods() throws ClassNotFoundException {
        /**
         * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
         */
        Method[] f = getClassTwo().getDeclaredMethods();
        for (Method f1 : f){
            System.out.println(f1);
        }
    }

    public static void getMethodsNameWithReturnTyepWithParameterTypesWithModifiers() throws ClassNotFoundException {
        /**
         * getName()：返回方法名称，例如："getScore"；
         * getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
         * getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
         * getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。
         */
        Method[] f = getClassTwo().getDeclaredMethods();
        for (Method f1 : f){
            System.out.println(f1.getName());
            System.out.println(f1.getReturnType());
            System.out.println(f1.getParameterTypes());
            System.out.println(f1.getModifiers());
        }
    }

    public static void getInvokeMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /**
         * 调用方法
         */
        ReflectionTestClass o = new ReflectionTestClass("fangxiao");
        /**
         * 调用不带参方法
         */
        Method f = getClassTwo().getDeclaredMethod("getName");
        String r = (String)f.invoke(o);
        System.out.println(r);
        /**
         * 调用带参方法,并传参
         */
        Method f2 = getClassTwo().getDeclaredMethod("setName",String.class);
        f2.invoke(o,"xiaodada");
        System.out.println(o.getName());

        /**
         * 调用静态方法，并传参
         */
        Method f3 = getClassTwo().getMethod("setNewAge",int.class);
        f3.invoke(null,100);
        /**
         * 调用非public方法
         */
        Method f4 = getClassTwo().getDeclaredMethod("setNewAddress",String.class);
        f4.setAccessible(true);
        f4.invoke(o,"新华大厦");
        System.out.println(o.getAddress());
    }

    public static void getPublicConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         *
         * 通过Class实例获取Constructor的方法如下：
         * getConstructor(Class…)：获取某个public的Constructor；
         * getDeclaredConstructor(Class…)：获取某个Constructor；
         * getConstructors()：获取所有public的Constructor；
         * getDeclaredConstructors()：获取所有Constructor。
         */
        Class cls = getClassTwo();
        Constructor c = cls.getConstructor(String.class);
        /**
         * 创建一个实例
         */
        Object cls1 = c.newInstance("James");
        Method m = cls.getDeclaredMethod("getName");
        System.out.println(m.invoke(cls1));

    }

    public static void getSuperClass() throws ClassNotFoundException {
        /**
         * 获取父类的Class
         */
        Class c = getClassTwo().getSuperclass();
        System.out.println(c);
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        getSuperClass();
    }
}
