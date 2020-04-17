package ReflectionDemo;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjecToJson {
    public  static String ObjListToJson(ArrayList<?> list){
        StringBuilder build=new StringBuilder();
        //迭代器
        Iterator<?> iterator=list.iterator();
        build.append("[");
        String separate="";
        while(iterator.hasNext()){
            build.append(separate);
            //object转json字符串
            String str=ObjToJson(iterator.next());
            build.append(str);
            separate=",";
        }
        build.append("]");
        return build.toString();
    }

    @SuppressWarnings("unchecked")
    public  static String ObjToJson(Object obj){
        StringBuilder build=new StringBuilder();
        build.append("{");
        @SuppressWarnings("rawtypes")
        Class cla=null;
        try {
            //反射加载类
            cla=Class.forName(obj.getClass().getName());
        } catch (ClassNotFoundException e) {
            System.out.println(obj.getClass().toString().concat(" 未找到这个类"));
            e.printStackTrace();
            return null;
        }

        StringBuffer methodname=new StringBuffer();
        //获取java类的变量
        Field[] fields=cla.getDeclaredFields();
        String separate="";
        for(Field temp:fields){
            System.out.println("打印temp "+temp);
            System.out.println("打印tempName+ "+temp.getName());
            System.out.println("打印tempType+ "+temp.getType());
            build.append(separate);
            build.append("\"");
            build.append(temp.getName());
            build.append("\":");

            methodname.append("get");
            methodname.append(temp.getName().substring(0,1).toUpperCase());
            methodname.append(temp.getName().substring(1));
            System.out.println("打印"+methodname);
            build.append("\"");
            Method method=null;
            try {
                //获取java的get方法
                method=cla.getMethod(methodname.toString());
            } catch (NoSuchMethodException | SecurityException e) {
                methodname.setLength(0);
                System.out.println("打印2"+methodname);
                e.printStackTrace();
            }

            try {
                //执行get方法，获取变量参数的直。
                build.append(method.invoke(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            build.append("\"");
            methodname.setLength(0);
            separate=",";
        }

        build.append("}");
        return build.toString();
    }
}
