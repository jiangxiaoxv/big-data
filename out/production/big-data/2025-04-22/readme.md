# 数学类
1. Math 提供基本的数学运算 --- 只针对基本类型
    - 最终类
    - 
2. BigDecimal 不可变的有符号十进制数，提供任意精度
   - 用于精确存储和运算小数的类，要求参数以字符串形式传递；BigDecimal bd1 = new BigDecimal("3.24");
3. BigInteger  能存储和运算任意大小的整数----要求参数以字符串形式传递
   - BigInteger bi1 = new BigInteger("235239591357023515012935123512835831258132582135123053372937512635912350132");

# 包装类
1. 由于基本类型身上没有方法和属性，所以为了快捷的操作这些数据，针对每一种基本类型提供了对应的类形式 --- 包装类
2. 基本类型和包装类
      基本类型   byte     short   int       long   float   double   char       boolean    void
      包装类     Byte     Short   Integer   Long   Float   Double   Character  Boolean    Void

3. Void是一个不可实例化的类；它持有堆表示java关键字void的class对象的引用，最终类
   public static Void m2() {
      System.out.println("m2~~~~~~");
      return null;
   }
4. 自动装箱/自动封S箱 
    - 将基本类型的变量直接赋值给了对应的应用类型的对象 --- 自动装箱
    - 底层调用的是valueOf方法
5. 自动解箱
    - 将引用类型的对象直接赋值给了对应的基本类型的变量 --- 自动拆箱
    - 当进行自动拆箱的时候，底层会默认调用对应对象身上的***value()进行拆箱
    - int i = in.intValue()
6. Integer
   - 当数值范围在-128 ～ 127之间的时候，返回了Integer.cache数组中对应下标上的值。
   - 当不在该范围时 是 new Integer(i)
   - Integer i1 = 5; Integer i2 = 5; i1 == i2; 当如果超过上述范围，就不相等。
7. 对于四种整数行类型而言，都有范围判断 --- -128～127
8. Boolean
   - Boolean b = new Boolean("s"); 参数只要不是true，结果就是false
   
9. hashcode
   - 整数类型的hashcode是其本身。
   - hashcode 是2的32次方取值，所以long的类型，超过这个范围，就会生成hashcode，不再是其本身。
   - Boolean 的hashcode固定的
   - 对于八种包装类型对应的hashcode都是固定的，不随系统改变而改变
   - Double.NaN.hashcode 是固定的
   
10. NaN是与任何值都不相等，包括本身； Double.NaN == Double.NaN
11. 包装类型与基本类型进行运算的时候，会自动拆箱
    int is = 200;
    Integer ins = 200;
    System.out.println(is == ins); // true

12. 字面量的哈希码是固定不变的
13. null的哈希码规定为0；
14. 所有的字面量都是存储在运行时常量池的
    - int i = 5; i = 6;是i的地址发生了变化
15. 常量池
   - 常量池一般指运行时常量池；常量池存储的字面量以及自定义常量

