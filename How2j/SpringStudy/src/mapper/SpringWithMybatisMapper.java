package mapper;
import java.util.List;

import org.springframework.stereotype.Component;
import pojo.SpringWithMybatisPojo;

public interface SpringWithMybatisMapper {
    public int add(SpringWithMybatisPojo springWithMybatisPojo);
    public void delete(int id);
    public SpringWithMybatisPojo get(int id);
    public int update(SpringWithMybatisPojo springWithMybatisPojo);
    public List<SpringWithMybatisMapper> list();
    public int count();
}
