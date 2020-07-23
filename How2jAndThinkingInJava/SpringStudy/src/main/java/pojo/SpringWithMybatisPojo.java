package pojo;

public class SpringWithMybatisPojo {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SpringWithMybatisPojo [ id = " + id + ", name=" + name + "]";
    }
}
