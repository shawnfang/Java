package designDemo.D3_01;

public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    public SingleObject(){
        System.out.println("你好~~");
    }

    public static SingleObject getInstance() {
        return singleObject;
    }
    public void showMessage(){
        System.out.println("我要来啦~~~~");
    }
}
