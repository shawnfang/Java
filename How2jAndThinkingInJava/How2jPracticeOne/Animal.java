package How2jPracticeOne;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(int legs) {
        System.out.println("使用" + legs + "走路");
    }
}
