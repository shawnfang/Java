package CollectionFramework;
import interfaceAndExtends.HeroBoss;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.util.Iterator;

import CollectionFramework.ArraryListHero;
public class HashMapclass {
    //对于HashMap而言，key是唯一的，不可以重复的。
    //所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
    //不过，同一个对象可以作为值插入到map中，只要对应的key不一样
    public static void main(String[] args) {
        HashMap<String,String>  dictionary = new HashMap<>();
        dictionary.put("abc","物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t","坦克");
        System.out.println(dictionary.get("t"));
        System.out.println(dictionary);

        // 后插入的元素覆盖前面插入的元素
        HashMap<String, HeroBoss> d = new HashMap<String, HeroBoss>();
        d.put("gareen",new HeroBoss("gareen1"));
        d.put("gareen",new HeroBoss("gareen2"));
        System.out.println(d);


        //准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
        //hero-3229
        //hero-6232
        //hero-9365
        //...
        //
        //因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
        //要求使用两种办法来寻找
        //1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
        //2. 借助HashMap，找出结果，并统计花费的时间
        // 方法1
        HashMap<String,ArraryListHero>  dictionaryHero = new HashMap<String, ArraryListHero>();
        for(int i =0;i< 3000000;i++){
            dictionaryHero.put(Integer.toString(i),new ArraryListHero("hero"+"-"+(int)(Math.random()*8900+1000)));
        }
        // 没写完
        long start1 =System.currentTimeMillis();
        for(Iterator<Map.Entry<String,ArraryListHero>> it = dictionaryHero.entrySet().iterator();it.hasNext();){
            Map.Entry<String,ArraryListHero> item = it.next();
            String key = item.getKey();
            ArraryListHero val = item.getValue();
            if(dictionaryHero.get(key).name.equals("hero-5555")){
                it.remove();
            }
        }
        long end1 =System.currentTimeMillis();
        System.out.printf("消耗时长:%d毫秒 %n",end1-start1);



        //方法2

        ArrayList<HeroBoss> h = new ArrayList<>();
        for(int i = 0; i<3000000;i++){
            h.add(new HeroBoss("hero"+"-"+(int)(Math.random()*8900+1000)));
        }
        long start2 =System.currentTimeMillis();
        for(int i=0;i<h.size();i++){
            //System.out.println(h.get(i).name);
            String hero55 = "hero-5555";
            if(h.get(i).name.equals(hero55)){
                h.remove(h.indexOf(h.get(i)));
            }else{
            }
        }
        long end2 =System.currentTimeMillis();
        System.out.printf("消耗时长:%d毫秒 %n",end2-start2);
    }
}
