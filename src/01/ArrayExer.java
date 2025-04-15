
import java.util.Scanner;
public class ArrayExer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 获取行数
        int n = s.nextInt();

        //定义二维数组存储杨辉三角
        int[][] arr = new int[n][];

        for(int i = 0; i < n; i++) {
            //初始化每一行的一维数组
            arr[i] = new int[i + 1];
            for(int j = 0; j <= i; j++) {
                // 每一行的开头和结尾位置上都是1
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}