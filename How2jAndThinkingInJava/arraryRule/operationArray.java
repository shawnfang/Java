package arraryRule;

import java.util.Random;

public class operationArray {
    public static void main(String[] args) {
        // 复制数组
        int a [] = {1,2,3,4,5,6,7};
        int b[] = new int[8];
        int c[] = new int[5];
        // 常规复制

        for (int i = 0; i<a.length;i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }

        // 使用arraycopy
        System.arraycopy(a,0,c,0,2);
        for (int i = 0;i<c.length;i++){
            System.out.println(c[i]+"");

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // 合并数组
        //取一个5~10之间的随机数作为数组的长度
        int min = 5;
        int max = 10;
        Random random = new Random();
        int[] x = new int[(int)(random.nextInt(max-min+1)+min)];
        System.out.println(x.length);
        for (int i = 0; i<x.length;i++){
            x[i] = (int)(Math.random()*100);
        }
        int[] y = new int[(int)(random.nextInt(max-min+1)+min)];
        System.out.println(y.length);
        for (int i = 0; i<y.length;i++){
            y[i] = (int)(Math.random()*100);
        }
        int[] z = new int[x.length+y.length];
        System.out.println(z.length);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.arraycopy(x,0,z,0,x.length);
        System.arraycopy(y,0,z,x.length,y.length);
        for (int each:z) {
            System.out.println(each);
        }

    }
}
