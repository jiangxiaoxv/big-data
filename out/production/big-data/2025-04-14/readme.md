1. API
   - Application Programming Interfaces --- 应用程序接口
2. Object 类
   - 顶级父类 -- 任何一个类都直接或者间接继承Object,任何一个类的对象都可以赋值给Object对象
   - Object o = new Person()
   - 唯一一个没有父类的类
   -  一个类所产生的对象要想被克隆，那么这个类必须要实现Cloneable接口
   - clone（）
   - finalize()
   - getClass()
   - hashCode() 
   - toString()
   - equals()
3. 进制缩写
   - Bin --- 二进制
   - Oct --- 八进制
   - Dec --- 十进制
   - Hex --- 十六进制
   
4. String 类
   - final 类，继承了Object
   - java中所有字符串字面值都作为此类的实例实现
   - 字符串常量不可变；字符串缓冲区你吃可变的字符串。因为String对象是不可变的，所以可以共享。
   - 字符串在底层是以字符数组存储的
   - 方法区可以存放：静态常量池、存储类信息、运行时常量池（常量池）；
   - toCharArray
   - chatAt
   - compareTo
   - compareToIgnoreCase
   - 对象 instanceof 类/接口 -- 判断对象和类的关系；表示判断对象是否指定类/接口及其父类/父接口的对象
   - 字符串提供了一系列的操作而不改变原字符串的方法，会产生一个新的字符串； s = s.toUpperCase(), s.toLowerCase();
   - concat
   - contains str.contains("g")
   - endsWith()
   - startsWith()
   - getBytes()
   - hashCode() // 同一个字符串的哈希码在任何条件下都是相通的
   - indexOf()
   - lastIndexOf('a', 5) //从指定位置向前找
   - substring （startIndex, endIndex）
   - trim()
   - valueOf // 实际上是调用了这个对象的toString
5. StringBuilder 类
   - StringBuilder和StringBuffer中的方法签名一样。StringBuilder是线程不安全的类，StringBuffer是线程安全的