package practiceOne;

public class Fish extends Animal implements pet {
    private String name;
    public Fish(){
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("fish playing");
    }

    @Override
    public void eat() {
        System.out.println("fish eating");
    }

    @Override
    public void walk(int legs) {
        System.out.println("fish cann't walk");
    }



}
