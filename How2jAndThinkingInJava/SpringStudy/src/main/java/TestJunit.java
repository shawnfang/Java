import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pojo.Category;
import pojo.HeroSpring;

//表示这是一个Spring的测试类
@RunWith(SpringJUnit4ClassRunner.class)
//定位Spring的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJunit {
    //给这个测试类装配Category对象
    @Autowired
    Category c;

    @Autowired
    HeroSpring h;

    //测试逻辑，打印c对象的名称
    @Test
    public void testCategory(){
        System.out.println(c.getName());
    }

    @Test
    public void testHeroSpring(){
        System.out.println(h.getName());
    }
}
