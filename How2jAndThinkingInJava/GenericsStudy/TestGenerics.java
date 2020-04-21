package GenericsStudy;

import InterfaceAndExtends.AMHero;
import InterfaceAndExtends.APHero;
import InterfaceAndExtends.HeroBoss;

import java.util.ArrayList;

public class TestGenerics {
    public static void iterate(ArrayList<? extends HeroBoss> list){
        for (HeroBoss h:list){
            System.out.println(h.name);
        }
    }

    public static void main(String[] args) {
        ArrayList<HeroBoss> h = new ArrayList<>();
        h.add(new HeroBoss("fangxiao"));
        ArrayList<APHero> ap = new ArrayList<>();
        ap.add(new APHero("xiaoxiaofang"));
        ArrayList<AMHero> am = new ArrayList<>();
        iterate(h);
        iterate(ap);
        iterate(am);
    }
}
