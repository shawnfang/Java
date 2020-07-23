package pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class CategoryOther {
    private int id;
    private String name;
    //除了前面的 在属性前加上@Autowired 这种方式外，也可以在setCategory方法前加上@Autowired，这样来达到相同的效果
    @Autowired
    private Category category;

    @Resource(name = "p")
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
