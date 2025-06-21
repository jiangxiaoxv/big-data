import java.lang.annotation.*;

// 如果注解中的属性是一维数组，并且在赋值的时候，一维数组中只有一个值
// 可以直接将这个值赋值给对应属性
@Time(year = 2025, month = 6, day = 22)
@SAnno("value")
public class AnnotationDemo {
    public static void main(String[] args) {

    }
}

@interface Time {
    // 如果在注解中直接定一个属性，纳米这个属性默认是一个静态产量
    // public static final int year = 10;
//    int year = 10;

    // 注解中的属性
    int year();
    int[] month();
    int day() default 21;
    double time() default 1.0;
    boolean am() default false;

//    Object o(); // 注解中的属性只能是基本类型、枚举、String、Class、其他注解类型以及他们所对应的一维数组
    String name()  default "jxx";
}
// 表示注解在那个地方使用
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface SAnno {
    // 如果注解中只有一个属性并且名字为value
    // 那么在使用这个注解的的时候可以省略属性名不写
    String value();
}
