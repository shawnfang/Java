package interfaceAndextends;

public class LifePotion  extends ItemPotion{
    @Override
    public void effect() {
        System.out.println("使用后加血功能");
    }
}
