public class IntegerDemo {
    public strictfp static void main(String[] args) {
        /**
         * Integer
         */
        int i = 1;

        Integer in2 = new Integer(2);
        Integer in = Integer.valueOf(i);
        Integer in3 = 3;

//        System.out.println(in2);
//        System.out.println(in);
//        System.out.println(in3);

        // 将引用类型的对象直接赋值给了对应的基本类型的变量 --- 自动拆箱
        int ii = in2;
        int ii2 = in2.intValue();
//        System.out.println(ii);
//        System.out.println(ii2);



        Boolean bo1 = new Boolean("s");
//        System.out.println(bo1);
        int ip = Integer.parseInt("12");
        Integer ip2  = Integer.parseInt("12");
//        System.out.println(ip2);

        System.out.println(in2.hashCode());

        Double d1 = Double.NaN;
//        System.out.println(bo1.hashCode());
//        System.out.println(Double.NaN == Double.NaN);
//        System.out.println(Double.isNaN(0.0 / 0.0));
//        System.out.println(Double.isNaN(1 / 0.0));

//        System.out.println(Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY);

//        System.out.println(d1);


        int is = 200;
        Integer ins = 200;
        System.out.println(is == ins); // true
    }

}