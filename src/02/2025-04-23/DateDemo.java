import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {
    public static void main(String[] args) throws  Exception{
        // 在1900-01的基础上进行累加
        Date date = new Date(2000, 12, 17);

        Date date2 = new Date(2000 - 1900, 12-1, 17);
//        System.out.println(date);
//        System.out.println(date2);

        String str = "2025-02-01 15:09:05";
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3 = sdf.parse(str);
        System.out.println(date3);

        String s = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(date3);
        System.out.println(s);
    }
}