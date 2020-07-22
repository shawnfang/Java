package pojo;

import org.springframework.stereotype.Component;

//为HeroSpring类加上@Component注解，即表明此类是bean
@Component("h")
public class HeroSpring {
    private String name = "hero 2";
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
