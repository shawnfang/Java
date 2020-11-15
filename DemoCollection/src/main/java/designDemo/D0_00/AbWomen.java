package designDemo.D0_00;

public class AbWomen extends AbstractorAnimal {
    public AbWomen(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("女人吃饭长大后的身高，体重");
        System.out.println("身高："+getHeight());
        System.out.println("体重："+getWeight());
    }
}
