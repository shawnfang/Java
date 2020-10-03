package ReflectionDemo;

public class ReflectionTestClass extends ReflectionTestClassBig {
    private String name;
    private int age;
    private String address;
    public String fakeName;

    public ReflectionTestClass(){

    }

    public ReflectionTestClass(String name){
        this.name = name;
    }

    public ReflectionTestClass(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getFakeName() {
        return fakeName;
    }

    public void setFakeName(String fakeName) {
        this.fakeName = fakeName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ReflectionTestClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ReflectionTestClass reflectionTestClass = new ReflectionTestClass();
        reflectionTestClass.age = 10;
        reflectionTestClass.name = "fangxiao";
        System.out.println(reflectionTestClass.getAge());
        System.out.println(reflectionTestClass.getName());
        reflectionTestClass.setAddress("新华大厦");
        reflectionTestClass.setName("willian");
        System.out.println(reflectionTestClass.getAge());
        System.out.println(reflectionTestClass.getName());
        System.out.println(reflectionTestClass.getAddress());

        ReflectionTestClass reflectionTestClass1 = new ReflectionTestClass("xiaoming",100);
        System.out.println(reflectionTestClass1.getName());
        System.out.println(reflectionTestClass1.getAge());

    }
}
