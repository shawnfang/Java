package designDemo.D4_01;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float f = 0;
        for (Item ite:items){
            f += ite.price();
        }
        return f;
    }

    public void showItems(){
        for (Item i:items) {
            System.out.println(i.name());
            System.out.println(i.price());
            System.out.println(i.packing().packing());
        }
    }
}
