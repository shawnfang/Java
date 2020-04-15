package pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
//@Aspect 注解表示这是一个切面
//@Component 表示这是一个bean,由Spring进行管理
//@Around(value = "execution(* pojo.CategoryService.*(..))")
// 表示对pojo.CategoryService 这个类中的所有方法进行切面操作
@Aspect
@Component
public class LoggerAspectCategoryService {
    @Around(value = "execution(* pojo.CategoryService.*(..)) ")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log 1:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log 1:" + joinPoint.getSignature().getName());
        return object;
    }
}
