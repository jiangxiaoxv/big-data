# big-data
1. 学习路径
  https://www.bilibili.com/video/BV135411P7Ea?spm_id_from=333.788.player.switch&vd_source=5e17c856bfb7fe8e3c8387a111dcc329&p=2
2. JRE -- java Runtime（包含jvm + 核心类库）
3. JDK -- java Development Kit -- java开发工具包，开发工具 + JRE
4. JVM --jva virtual machine --java 虚拟机，是java能够跨平台的前提
5. java的技术结构
   JAVASE -- standard Edtion -- 标准版
   JAVAEE -- enterprise Edtion -- 企业版
   JAVAME -- Micro Edition -- 微型版
6. javac + 编译的java文件
7. java + 编译后的字节码文件
8. public 公共类必须和文件名一致
9. package 文件夹表示包
   java page.DemoClass page表示包
   javac -d E:\\Demo.java
   javac -d 表示在编译的时候需要将包生成对应的文件夹
10. java 中有53个关键字 --2个保留字  goto,const
    所有关键字都是小写的
11. 标识符 可以使用字母（常见语言的基本字符）、数字、_、$，但是要尽量减少使用
   不能使用关键字、数字不能开头、可以使用中文、区分大小写、驼峰命名发
   类名/接口名：
   变量/方法
   常量：HELLO_WORLD
   包: 都小写用.隔开
   main是标识符，不是关键字
12. javadoc + java文件 生成方法使用文档（/**   */）
13. 字面量
    整数常量： 所有的整数
    小数常量： 所有的小数
    字符常量：将一个字母、数字、符号用'' 标识起来 'a'
    字符串常量：将一个或者多个字符用“”标识起来 "abc"
    布尔常量： true、false
    空常量： null
14. 进制
    计数方式
    二进制: 从JDK1.7开始，允许在程序中定义二进制数字---以0b/0B作为开头 0b000111
    八进制: 要求以0作为开头
    十进制: 
    十六进制: 要求以0x/0X开头；0-9，a-f；
15. 进制转化
    十进制转化二进制：不断除以2；余数倒着排列
    二进制转化为十进制：从低位次开始，按位次乘以2的位次次幂，然后求和 1101 = 1 * 2^0 + 0 * 2^1 +  1 * 2^2 + 1 * 2^3
    十进制向其他进制转化：除以对应的进制，然后取余数倒排
    其他进制向十进制转化：从低位次开始，按位次乘以进制的位次次幂，然后求和
    二进制向八进制转化：从低位次开始，每三位二进制划分为一组，产生一个八进制数字，不足三位用零补充
    八进制向二进制转化：一变三，每一位八进制都会产生三位二进制数字，不足三位补0
    二进制向十六进制转化：四变一
    十六进制向二进制转化：一变四
16. 小数进制转化
    整数位单独算
17. 数据类型
    在计算机中，是以二进制形式来存储数据，每一位二进制在内存中称之为是一“位”（bit， 简写为b），8位 = 1 字节（byte，简写B ），1024B= 1KB ->MB  ->GB  ->TB
    byte b1 表示的数字范围为-128 ～ 127

    基本数据类型
     - 数值型
        * 整数型
          byte  -- 1个字节型 表示的数字范围为-128 ～ 127
          short -- 短整形 2个字节，16位二进制，-2^15 ~ 2^15-1  -> -32768 - 32767
          int   -- 整形 4个字节，  -2^31 - 2^31 - 1;在java中整数默认为int类型; System.out.println(5)
          long  -- 长整型 8个字节， -2^63 - 2^63 - 1, 需要在结尾添加l/L作为标识
     - 浮点型
        * float   单精度 --- 4 个字节 ；-10^38 - 10^38 ,需要在结尾中添加f/F作为标识
        * double  双精度 --- 8 个字节 ；-10^308 - 10^308，在java中小数默认位double
    引用数据类型
     - 数组
     - 