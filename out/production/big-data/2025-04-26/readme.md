# File
1. listFiles 获取所有子文件和子目录
2. canExecute() 测试应用程序是不是一个可执行文件
3. canRead()
4. canWrite()
5. isDirectory()
6. isFile()
7. isHidden() 隐藏文件
8. 以can开头的方法 能不能做；以is开头 是不是； 以has 有没有
9. isAbsolute 判断是否是绝对路径

# IO流
    - 是java中一套用于数据传输的API。 IO-input output ---->输入输出流
    - 输入流是指从外部流向程序；输出流指数据从程序流向外部。
    - 根据数据的传输方向： 输入流、输出流
    - 根据数据的传输形式：字符流、字节流
                        字节流                      字符流
         输入流         InputStream(抽象类)         Reader
         输出流         OutputStream(抽象类)        Writer
    - 四个基本流都是抽象类，不能直接创建对象
    - 数据的来源/目的地：硬盘、内存、网络(套接字)、输入设备、
    - 向txt文件中写入一个字符串 --- 字符流、输出流 ---> 和文件相关的流 --> FileWriter

1. FileWriter
   - 将流对象放到try之外声明并且赋值为null，放到try之内创建
   - 关流之前需要判断流对象是否初始化成功
   
2. FileReader
   - 没有缓冲区，需要手动提供一个字符数组作为缓冲区来使用
   
3. BufferedReader
   - BufferedReader br = new BufferedReader(new FileReader("a.txt"))
   - 提供了缓冲区，能够换行读取
   - 利用FileReader来构建了BufferedReader，然后再BufferedReader来读取功能做了增强
   - 这种方式称之为装饰设计模式 --- 利用了同类对象构建自己对象本身，对 对象身上的功能做了增强或者改善
   - 