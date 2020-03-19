package interfaceAndextends;

public class MagicPotion extends ItemPotion {
    @Override
    public void effect() {
        System.out.println("使用后加魔法");
    }
}
