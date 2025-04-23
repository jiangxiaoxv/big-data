# 异常 在java中用于问题的反馈和处理的机制
异常的父类是Throwable，顶级父类
- ArithmeticException 算数异常 12 / 0；
- ArrayIndexOutOfBoundException 
- NullPointerException 
- ClassCastException 
- CloneNotSupportedException 
- StackOverflowError 
- PatternSyntaxException 
- NumberFormatException 
- ParseException
1. Error
    - 是Throwable的子类，用于合理的应用程序，不应该试图捕获的严重问题
    - 一旦出现不能处理
    - 堆内存溢出、栈内存溢出
    - VirtualMachineError: stackOverflowError、OutOfMemoryError
2. Exception 异常
    - 异常出现之后，处理方式有两种：一种是捕获，一种是继续抛出
    - 分为编译时异常、运行是异常
    - 运行时异常：运行的时候才出现，可以处理，可以不处理
    - 编译时异常需要处理

3. 自定义异常
    - 当继承了Exception活着是其他的异常，那么定义了一个编译时异常
    - 继承了RuntimeException或者是其子类，就是运行时异常
4. 异常处理
    - 多个catch
    - 一个Exception
    - 分组处理
5. 异常的栈轨迹 e.printStackTrance(); 倒着看
6. 一旦抛出异常对象，后续代码停止执行
7. 重写的时候，子类抛出的编译时异常不能超过父类编译时异常
8. 子类不能抛出比父类更多的异常 --- 指的是：范围不能更大，编译时异常
9. 重载只喝方法签名有关，和修饰符、返回值类型、异常都没有关系；重载本身是一种编译时多态
10. 重写指的是父子类中存在方法签名相同的非静态方法。在构成重写的时候，子类方法的权限修饰符要比父类权限修饰符的范围大，或者保持一致。
    子类在重写父类方法的时候，如果父类返回值类型是基本类型或者void，那么子类方法的返回值类型要一致。如果父类方法返回值类型是引用类型，那么
    子类方法返回值类型要和父类一致或者是父类方法返回值类型的子类；子类在重写方法的时候所抛出的编译时异常不能超过父类编译时异常的范围。重写
    重写本身是一种运行时多态。
11. 重载和重写都是行为的多态
12. finally --- 之前无论出现异常与否，都会执行一次
13. 