package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {
        public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            String path = "Reflection.ReflectionHero";

            //获取反射中的Class对象
            Class clazz = Class.forName(path);

            // 获取类名
            String strName01 = clazz.getName();// 获取完整类名com.estone.erp.erp_usermgt_n.biz.hr.request.dto.EmployeeDTO
            System.out.println(strName01);
            String strName02 = clazz.getSimpleName();// 直接获取类名EmployeeDTO
            System.out.println(strName02);

            // 获取属性
            Field[] field01 = clazz.getFields(); // 返回属性为public的字段
            for (Field field:field01){
                System.out.println("返回属性为public的字段"+field.getName());
                System.out.println("返回字段类型"+field.getType());
            }
            Field[] field02 = clazz.getDeclaredFields(); // 返回所有的字段属性
            for (Field field:field02){
                System.out.println("返回所有的字段属性"+field.getName());
                System.out.println("返回字段类型"+field.getType());
            }
            Field field03 = clazz.getDeclaredField("name"); // 获取属性为id的字段
            System.out.println("mcodes"+field03);

            // 获取普通方法
            Method[] Method01 = clazz.getDeclaredMethods(); // 返回所有public方法
            for (Method method:Method01){
                System.out.println("返回public方法"+method.getName());
                System.out.println("返回public方法的返回类型"+method.getReturnType());
            }
            // 返回getEmployeeNo这个方法，如果没有参数，就默认为null
            Method method = clazz.getDeclaredMethod("getName");
            System.out.println("返回getName这个方法，如果没有参数，就默认为null,"+method);



            List<String> list = new ArrayList<>();
            Method setMethod = clazz.getDeclaredMethod("setName", String.class);
            //通过反射创建类对象
            Object ej = clazz.newInstance();
            setMethod.invoke(ej,"shawnfang");
            Method getMethod = clazz.getMethod("getName");
            System.out.println(getMethod.invoke(ej));



        }
    }

