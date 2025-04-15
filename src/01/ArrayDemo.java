import java.util.Arrays;

public class ArrayDemo {
    public static  void main(String[] args){

        /**
         * 数组的声明
         */
        int[] arr = new int[3]; // 动态初始化
        arr[2] = 10;

        int[] arr1 = new int[]{2, 3, 9}; // 静态初始化
        System.out.println(arr[3]);

        int[] arr2 = {1, 2, 3} // // 静态初始化

        int[] arr3;
        arr3 = new int[3];

        /*// 这种方式的声明和初始化不能分开
        int[] arr4;
        arr4 = {2, 8, 9}*/


        /**
         * 数组的使用
         */
        System.out.println(arr.length);
        // 数组的遍历
        // 下标
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // int i；增强for循环,只能遍历数组，不能改变数组中的元素
        for (int i : arr) {
            System.out.println(i);
        }
        // 字符串
        String str = Arrays.toString(arr); // [1,2,4]
        System.out.println(str);

        /**
         * 获取数组中最大值, 排序; 冒泡
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr.length  - i - 1 ; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 选择排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length ;j++) {
                if(arr[i - 1] > arr[j]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 只能进行升序排序
        Array.sort(arr);// 快速排序 + 归并排序； 时间复杂度O(nlogn)
        // 反转数组
        for(int i = 0, j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 有序数组，二分法
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        int num = 9;

        while(arr[mid] != num){
            if (num > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (min > max) {
                mid = -1;
                break;
            }
            mid = (min + max) / 2;
        }

        // 复制数组
        System.arraycopy(arr, 3, arr2, 1, 3);


        // 二维数组

    }


}