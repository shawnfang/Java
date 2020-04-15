package arraryRule;

public class createArray {
    public static void main(String[] args) {
        // 声明数组
        int[] a;

        // 创建数组，b引用指向数组
        // 分配长度为3的数组
        int[] b = new int[3];

        // 访问数组，给数组赋值，数组下标从0开始
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        // 数组长度
        System.out.println(b.length);

        // 分配空间，同时赋值
        //  一
        int[] x = new int[]{1,2,3,4,5};
        // 二
        int[] y = {100,101,102,103,104};
        // 三  同时分配空间和指定内容
        int[] z = new int[]{111,2222,333};
        // 增强型for循环
        for(int each:x){
            System.out.println("这是增强型for循环打印");
            System.out.println(each);
        }

        // 查找数组最小值
        int[] c = new  int[3];
        c[0] = (int)(Math.random()*100);
        c[1] = (int)(Math.random()*100);
        c[2] = (int)(Math.random()*100);
        System.out.println("数组中各个随机数是：");
        for (int i = 0;i<c.length;i++) {
            System.out.println("这是常规性for循环打印");
            System.out.println(c[i]);
        }
        int min = 100;
        for (int i = 0;i<c.length;i++) {
            if (c[i] < min) {
                min = c[i];
            }
        }
        System.out.println("找出最小值是"+ min);
        }


    }

