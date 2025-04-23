import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
public class CalendarDemo {
    public static void main(String[] args) throws  Exception {
        Calendar c = Calendar.getInstance();

//        System.out.println(c);


//        LocalDate date = new LocalDate();

        LocalDate date = LocalDate.now();
//        System.out.println(date);

        LocalDate date2 = LocalDate.of(2024, 10, 5);
//        System.out.println(date2);
//
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date.isLeapYear()); // 闰年
//        System.out.println(date.plus(3, ChronoUnit.DAYS));

        LocalTime time = LocalTime.now();

        LocalTime time2 = LocalTime.of(19, 52, 37,2371);

        System.out.println(time);
        System.out.println(time2);
    }


}