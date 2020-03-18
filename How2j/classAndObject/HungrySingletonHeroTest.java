package classAndObject;

public class HungrySingletonHeroTest {
    public static void main(String[] args) {
        HungrySingletonHero H1 = HungrySingletonHero.getInstance();
        HungrySingletonHero H2 = HungrySingletonHero.getInstance();
        HungrySingletonHero H3 = HungrySingletonHero.getInstance();

        System.out.println(H1==H2);
        System.out.println(H2==H3);
    }
}
