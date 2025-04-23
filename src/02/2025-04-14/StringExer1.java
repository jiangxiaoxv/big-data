//package cn.tedu.string;
import java.util.Scanner;
public class StringExer1 {
    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        StringComputed sc = new StringComputed();
        
//        sc.comCounter(str);

//        sc.judgeHuiWen(str);
//        sc.computedNumSumInStr(str);
        sc.printAllIndex(str, "t");
    }

}

class  StringComputed {
    public void comCounter(String str) {
        // 记录字母的个数
        int letter = 0;
        int number = 0;
        int symbol = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 判断这个字符是数字、字母还是其他符号
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                letter++;
            } else if (c >= '0' && c <= '9'){
                number++;
            } else {
                symbol++;
            }
        }
        System.out.println("字母：" + letter);
        System.out.println("数字：" + number);
        System.out.println("其他字符：" + symbol);

    }

    // 判断是不是回文字符串
    public void judgeHuiWen(String str) {
        for (int i = 0, j = str.length() - 1; i < j ;i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("不是回文字符串");
                return;
            }
        }
        System.out.println("是回文字符串");
    }

    void computedNumSumInStr(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sum += (c - '0');
            }
        }
        System.out.println("所有数字和为：" + sum);
    }


    public void printAllIndex(String str, String sub) {
        // 记录下表
        int index = 0 ;
        while(index < str.length()) {
            index = str.indexOf(sub, index);
            if (index != -1) {
                System.out.println(sub + "出现的位置:"+ index);
                index++;
            } else {
                break;
            }
        }
    }

    protected void printContantCoolAddress(String str) {
        System.out.println(str + "字符串常量池地址：" + str.intern());
    }

}