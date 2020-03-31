package DesignPatternDemo;

public class LazySingletonHeroTest {
    public static void main(String[] args) {
        LazySingletonHero L1 = LazySingletonHero.getInstance();
        LazySingletonHero L2 = LazySingletonHero.getInstance();
        LazySingletonHero L3 = LazySingletonHero.getInstance();

        System.out.println(L1 == L2);
        System.out.println(L2==L3);
    }
}
