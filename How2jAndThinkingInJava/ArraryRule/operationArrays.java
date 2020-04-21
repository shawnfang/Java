package ArraryRule;
import java.util.Arrays;


public class operationArrays {
    public static void main(String[] args) {
        // 数组拷贝
        //不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。
        // copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
         int[] a = new int[]{18,62,68,82,65,9};
         // 第一个参数表示源数组
         // 第二个参数表示开始位置(取得到)
         // 第三个参数表示结束位置(取不到)
         int[] b = Arrays.copyOfRange(a,0,3);
         for (int i = 0;i < b.length;i++){
             System.out.println(b[i]+"");
         }

         // 转换为字符串 toString方法
        int[] c = new int[]{18,33,88,91,98,9};
         System.out.println("转换之前打印："+c);
         String content = Arrays.toString(c);
         System.out.println("转换之后打印："+content);

         // 排序
        int[] d = new int[]{199,300,28,38,19,331,993,88};
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(d));
        // 搜索 查询元素出现的位置，搜索之前需要进行排序
        System.out.println("数字88出现的位置："+ Arrays.binarySearch(d,88));

        // 判断两个数组是否相同
        int[] e = new int[]{199,300,28,38,19,331,993,88};
        int[] f = new int[]{199,300,28,38,19,331,993,88};
        System.out.println(Arrays.equals(f,e));

        // 填充数组
        int[] g = new int[10];
        Arrays.fill(g,(int)(Math.random()*100));
        System.out.println(Arrays.toString(g));
    }
}
