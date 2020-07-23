package AnnotationStudy;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target 表示这个注解能放在什么位置上
@Target({METHOD, TYPE})
//@Retention 表示生命周期
@Retention(RetentionPolicy.RUNTIME)
//@Inherited 表示该注解具有继承性
@Inherited

@Documented
public @interface JDBCConfig {
    String ip();

    int port() default 3306;

    String database();

    String encoding();

    String loginName();

    String password();
}
