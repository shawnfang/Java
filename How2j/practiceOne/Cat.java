package practiceOne;

public class Cat extends Animal implements pet{
    String name;

    @Override
    public void eat() {
        System.out.println("cat eating");
    }

    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat playing");
    }


}
