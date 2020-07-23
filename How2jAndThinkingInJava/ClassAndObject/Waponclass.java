package ClassAndObject;


//继承Itenclass
public class Waponclass extends Itenclass {
    int ac;

    public static void main(String[] args) {
        Waponclass W = new Waponclass();
        //从Iten而来的属性
        W.name = "无招";
        W.price = 100;
        // 自身的属性
        W.ac = 10;

        Waponclass Wpc = new Waponclass();
        Wpc.name = "锁子甲";
        Wpc.price = 500;
        Wpc.ac = 14;

    }
}
