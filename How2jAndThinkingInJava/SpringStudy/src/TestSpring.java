import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.*;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Category c = (Category)context.getBean("c");
        System.out.println(c.getName());
        System.out.println(c.getId());

        Product p = (Product)context.getBean("p");
        System.out.println(p.getId());
        System.out.println(p.getProductName());
        System.out.println(p.getCategory().getName());

        CategoryOther co = (CategoryOther)context.getBean("co");
        System.out.println(co.getName());
        System.out.println(co.getCategory().getName());
        System.out.println("Resource 注解");
        System.out.println(co.getProduct().getProductName());

        HeroSpring h = (HeroSpring)context.getBean("h");
        System.out.println(h.getName());

        ProductService ps = (ProductService)context.getBean("ps");
        ps.doSomeService();

        CategoryService cs = (CategoryService) context.getBean("cs");
        cs.doSomeService();
    }
}
/*
<!---->
    <!--通过注解的方式进行配置-->
    <context:annotation-config />
    <!--通过关键字c即可获取Category对象，该对象获取的时候，即被注入了字符串"category 1“到name属性中-->
    <bean name="c" class="pojo.Category">
        <property name="name" value="category 1" />
        <property name="id" value="1"  />
    </bean>
    <bean name="p" class="pojo.Product">
        <property name="productName" value="chanpin 1 hao" />
        <property name="id" value="1000"/>
        <!--在创建Product的时候注入一个Category对象
            注意，这里要使用ref来注入另一个对象-->
        <property name="category" ref="c"/>
    </bean>
    <bean name="co" class="pojo.CategoryOther">
        <property name="name" value="other category"/>
    </bean>
*/