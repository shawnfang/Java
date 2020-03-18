package classAndObject;

public class LazySingletonHero {
    private LazySingletonHero(){

    }

    private static LazySingletonHero instance;

    public static LazySingletonHero getInstance(){
        if(null == instance){
            instance = new LazySingletonHero();
        }
        return instance;
    }
}
