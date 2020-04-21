package ArraryRule;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 初始化二维数组
        // 有两个二位数组，每一个一维数组的长度是3
        int[][] a = new int[2][3];
        // 可以直接访问一维数组，因为已经分配了空间
        a[1][2] = 5;

        // 只分配二位数组
        // 有两个一维数组，每一个一维数组的长度暂未分配
        int[][] b = new int[2][];
        // 必须事先分配长度，才可以访问
        b[0] = new int[3];
        b[0][2] = 5;

        // 指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };

        int[][] d = new int[5][5];
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++){
                d[i][j] = (int) (Math.random() * 100);
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        int z = 0;
        String zz = null;
        for(int x = 0;x<5;x++){
            for(int y = 0;y<5;y++){
                if(d[x][y] > z){
                    z = d[x][y];
                    zz = "["+x+","+y+"]";
                }
            }
        }
        System.out.println("最大值是："+z);
        System.out.println("坐标是："+ zz);
    }
}
