import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Category;
import pojo.CategoryOther;
import pojo.Product;

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
    }
}
