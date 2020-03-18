package classAndObject;

public class HungrySingletonHero {
    private HungrySingletonHero(){

    }

    private static HungrySingletonHero instance = new HungrySingletonHero();

    public static HungrySingletonHero getInstance(){
        return instance;
    }
}
