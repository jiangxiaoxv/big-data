import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegxDemo {
    public static void main(String[] args) {

        String str = "ajsass";
//        System.out.println(str.equals("abc"));

        // 产生正则对象
//        Pattern p = Pattern.compile("abc");
//        // 匹配器，将正则对象和实际对象进行匹配
//        Matcher m = p.matcher(str);
//        // 进行判断
//        boolean b = m.matches();
//        System.out.println(b);
//        String pat = "^[abc][lmn][hijk]";
        String pat = "[a-zA-Z]{5}";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
//        System.out.println(str.matches("[abc][lmn][hijk]"));

        System.out.println(str.matches("[a-zA-Z]{5}"));
        // 替换叠字
        String patter3 = str.replaceAll("(.)\\1+", "$1");

        splitApplication();
    }

    static public void judgeStrIsNum() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str.matches("0\\.\\d+") || str.matches("[1-9]\\d*\\.\\d+]"));
    }

    // 判断小写字母/大写/数字 至少出现两次
    public static boolean judgePassword(String  pwd) {
        if (!pwd.matches("[a-zA-Z0-9]{8,12}")) {
            return false;
        }

        // 记录次数
        int count = 0;
        if (pwd.matches(".*[A-Z].*")) {
            count++;
        }
        if (pwd.matches(".*[a-z].*")) {
            count++;
        }
        if (pwd.matches(".*[0-9].*")) {
            count++;
        }
        if (pwd.matches(".* .*")) {
            count++;
        }
        return count >= 2;
    }


    public static boolean matchEmail(String email) {
        String pattern = "[0-9a-zA-Z]{5,32}@[0-9a-zA-Z]+(\\.com)";
        String patter2 = "[0-9a-zA-Z]{5,32}@[0-9a-zA-Z]+(\\.com)?(\\.cn)";

        boolean result = email.matches(pattern);
        return false;
    }


    // 碎片
    public  static  double suipian(String str2) {
        String str = "aaacccddac";
        double len = str.length();
        str = str.replaceAll("(.)\\1+", "$1");
        return len / str.length();
    }


    public static void splitApplication() {
        String str = "12asd956dks3sol0gn17bsl12414212";
        // 以数字作为边界符，将这个字符串切分
        // 如果多个便姐夫相邻，则中间切割出
        // 如果边界符在最后，则直接切割掉
        String[] arr = str.split("\\d");

        System.out.println(Arrays.toString(arr));
    }

}