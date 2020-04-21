package GenericsStudy;
import java.util.LinkedList;

import InterfaceAndExtends.AMHero;
import InterfaceAndExtends.APHero;
import InterfaceAndExtends.HeroBoss;
import InterfaceAndExtends.ItemPotion;


//设计一个支持泛型的栈GenericsStack
//设计这个类的时候，在类的声明上，加上一个<T>，表示该类支持泛型。
//T是type的缩写，也可以使用任何其他的合法的变量，比如A,B,X都可以，但是一般约定成俗使用T，代表类型。
public class GenericsStack<T> {
    LinkedList<T> values = new LinkedList<T>();
    public void push(T t){
        values.addLast(t);
    }
    public T pull(){
        return values.removeLast();
    }

    public T peek(){
        return values.getLast();
    }

    public static void main(String[] args) {
        GenericsStack<HeroBoss> heroboss = new GenericsStack<>();
        heroboss.push(new HeroBoss());
        // 可以放子类
        heroboss.push(new APHero());
        System.out.println(heroboss.values);
        // 不能放ItemPotion
        //heroboss.push(new ItemPotion());
        GenericsStack<ItemPotion> ItemStack = new GenericsStack<>();
        ItemStack.push(new ItemPotion());
        //不能放HeroBoss
        //ItemStack.push(new HeroBoss());

        // 可以放子类
        GenericsStack<AMHero> am = new GenericsStack<>();
        am.push(new AMHero());

    }
}
