import mapper.SpringWithMybatisMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.SpringWithMybatisPojo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private SpringWithMybatisMapper springWithMybatisMapper;

    @Test
    public void testAdd(){
        SpringWithMybatisPojo springWithMybatisPojo = new SpringWithMybatisPojo();
        springWithMybatisPojo.setName("new 1");
        springWithMybatisMapper.add(springWithMybatisPojo);
    }
}
