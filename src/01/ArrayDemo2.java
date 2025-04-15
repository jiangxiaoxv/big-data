import java.util.Arrays;

public class ArrayDemo2 {
    public static  void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[5];
        arr[1] = new int[3];

        int[][] arr2 = new int[2][];
        arr2[0][0] = 10; // 空指针异常，不能这么玩

        int[][] arr3 = {{2, 4}, {6,6,6}}; //既定义了包含的一维数组的长短，又定义了初始化元素

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        for (int[] as : arr) {
            for (int i = 0; i < as.length; i++) {
                System.out.println(as[i])
            }
        }
    }
}