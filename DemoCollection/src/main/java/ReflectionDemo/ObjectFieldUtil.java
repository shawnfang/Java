package ReflectionDemo;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 实体属性操作工具类
 *
 * @author shawnfang
 * @date 2020年4月10日下午5:56:59
 */
public class ObjectFieldUtil {
    private static Logger log = LoggerFactory.getLogger(ObjectFieldUtil.class);
    private static String v = "";
    private static List t = new ArrayList();
    private static Map<String,Object> tempMap = new HashMap<>();
    /**
     * 根据属性名获取属性值
     *
     * @param fieldName  字段名
     * @param o 实体
     * @return
     */
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 获取属性名数组
     *
     * @param o 实体
     * @return
     */
    public static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getType());
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     *
     * @param o 实体
     * @return
     */
    public static List<Map<String, Object>> getFiledsInfo(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> infoMap = null;
        for (int i = 0; i < fields.length; i++) {
            infoMap = new HashMap<String, Object>();
            infoMap.put("type", fields[i].getType().toString());
            infoMap.put("name", fields[i].getName());
            infoMap.put("fieldName",fields[i]);
            // 由于部分实体对象中包含了静态变量，导致get值的时候出现异常，所以暂时先注释
            //infoMap.put("value", getFieldValueByName(fields[i].getName(), o));
            list.add(infoMap);
        }
        return list;
    }

    /**
     * 获取对象的所有属性值，返回一个对象数组
     *
     * @param o  实体
     * @return
     */
    public static Object[] getFiledValues(Object o) {
        String[] fieldNames = getFiledName(o);
        Object[] value = new Object[fieldNames.length];
        for (int i = 0; i < fieldNames.length; i++) {
            value[i] = getFieldValueByName(fieldNames[i], o);
        }
        return value;
    }

    /**
     * 根据对象属性名设置属性值
     *
     * @param fieldName 字段名
     * @param value 字段值
     * @param o 实体
     * @return
     */
    public static void setFieldValueByName(String fieldName, Object o,Object value) {
        try {
            BeanInfo obj =Introspector.getBeanInfo(o.getClass(), Object.class);
            PropertyDescriptor[] pds = obj.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                if(pd.getName().equals(fieldName)){
                    pd.getWriteMethod().invoke(o, value);
                    break;
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    /**
     * 获取field的类型，如果是复合对象，获取的是泛型的类型
     *
     * @param field
     * @return
     */
    private static Class getFieldClass(Field field) {
        Class fieldClazz = field.getType();

        if (fieldClazz.isAssignableFrom(List.class)) {
            // 关键的地方，如果是List类型，得到其Generic的类型
            Type fc = field.getGenericType();
            // 如果是泛型参数的类型
            if (fc instanceof ParameterizedType)
            {
                ParameterizedType pt = (ParameterizedType) fc;
                //得到泛型里的class类型对象。
                fieldClazz = (Class) pt.getActualTypeArguments()[0];
            }
        }

        return fieldClazz;
    }

    public static Class getObj(Object obj){
        Class cla=null;
        try {
            //反射加载类
            cla=Class.forName(obj.getClass().getName());
        } catch (ClassNotFoundException e) {
            System.out.println(obj.getClass().toString().concat(" 未找到这个类"));
            e.printStackTrace();
            return null;
        }
        return cla;
    }

    public static List<?> getFieldInfoList(Object FieldObject) throws IllegalAccessException, InstantiationException {
        List templist= new ArrayList();
        @SuppressWarnings("rawtypes")
        Class cla= ObjectFieldUtil.getFieldClass((Field) FieldObject);
        Object clazz = cla.newInstance();
        List<Map<String,Object>> filedsInfoSubs = ObjectFieldUtil.getFiledsInfo(clazz);
        for (Map<String,Object> filedsInfoSub:filedsInfoSubs) {
            if(filedsInfoSub.get("type").equals("interface java.util.List")){
                tempMap.put(filedsInfoSub.get("name").toString(),t);
            } else {
                tempMap.put(filedsInfoSub.get("name").toString(), v);
            }
        }
        JSONObject jsonObject = new JSONObject(tempMap);
        templist.add(jsonObject);
        return templist;
    }

    public static Map<?,?> getFieldInfoMap(Object FieldObject) throws IllegalAccessException, InstantiationException {
        @SuppressWarnings("rawtypes")
        Class cla= ObjectFieldUtil.getFieldClass((Field) FieldObject);
        Object clazz = cla.newInstance();
        List<Map<String,Object>> filedsInfoSubs = ObjectFieldUtil.getFiledsInfo(clazz);
        for (Map<String,Object> filedsInfoSub:filedsInfoSubs) {
            if(filedsInfoSub.get("type").equals("interface java.util.List")){
                tempMap.put(filedsInfoSub.get("name").toString(),t);
            } else {
                tempMap.put(filedsInfoSub.get("name").toString(), v);
            }
        }
        JSONObject jsonObject = new JSONObject(tempMap);
        return jsonObject;
    }


    @SuppressWarnings("unchecked")
    public  static String ObjToJson(Object obj) throws IllegalAccessException, InstantiationException {
        List<Map<String,Object>> filedsInfos = ObjectFieldUtil.getFiledsInfo(obj);
        Map<String,Object> jsonMap = new HashMap<>();
        for (Map<String,Object> fieldInfo:filedsInfos){
            if(ObjectFieldUtil.getFieldClass((Field) fieldInfo.get("fieldName")).getClassLoader() != null && fieldInfo.get("type").equals("interface java.util.List")){
                List fieldList = ObjectFieldUtil.getFieldInfoList(fieldInfo.get("fieldName"));
                jsonMap.put(fieldInfo.get("name").toString(), fieldList);
            }else if((ObjectFieldUtil.getFieldClass((Field) fieldInfo.get("fieldName")).getClassLoader() != null)){
                Map<?,?> fieldMap = ObjectFieldUtil.getFieldInfoMap(fieldInfo.get("fieldName"));
                jsonMap.put(fieldInfo.get("name").toString(), fieldMap);
            }else if(fieldInfo.get("type").equals("interface java.util.List")){
                jsonMap.put(fieldInfo.get("name").toString(),t);
            } else {
                jsonMap.put(fieldInfo.get("name").toString(), v);
            }
        }
        JSONObject jsonObject = new JSONObject(jsonMap);
        return jsonObject.toString();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("hello,world");

    }
}
