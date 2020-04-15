package demo;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class getFieldClass {
    /**
     * 获取field的类型，636f70797a686964616f31333337616537如果是复合对象，获取的是泛型的类型
     *
     * @param field
     * @return
     */
    private static Class getFieldClass(Field field) {
        Class fieldClazz = field.getType();

        if (fieldClazz.isAssignableFrom(List.class)) {
            Type fc = field.getGenericType(); // 关键的地方，如果是List类型，得到其Generic的类型

            if (fc instanceof ParameterizedType) // 如果是泛型参数的类型
            {
                ParameterizedType pt = (ParameterizedType) fc;

                fieldClazz = (Class) pt.getActualTypeArguments()[0]; //得到泛型里的class类型对象。
            }
        }
        return fieldClazz;
    }
}
