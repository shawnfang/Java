package ReflectionDemo;

public class ReflectionTestClassBig {
    private String name;
    private int type;
    public int with;
    public int heigh;
    public static int length = 100;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeigh() {
        return heigh;
    }

    public int getType() {
        return type;
    }

    public int getWith() {
        return with;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setWith(int with) {
        this.with = with;
    }

    @Override
    public String toString() {
        return "ReflectionTestClassBig{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", with=" + with +
                ", heigh=" + heigh +
                '}';
    }
}
