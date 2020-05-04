package com.jdk7.functionInterface;

/**
 * @Description: 案列
 * @author: HuangJing
 * @date: 2020/02/13  18:52:00
 * @Version: 1.0
 **/
public class Demo {
    public static void main(String[] args) {
//        调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
//        show(new FuncitonImpl());
//        使用匿名内部类
       /* show(new FunctionInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类调用");
            }
        });*/
//       使用lambda表达式
        show(new FuncitonImpl());
//        show(() -> System.out.println("lanbda表达式"));
    }
    public static void show(FunctionInterface inter) {
        inter.method();
    }
}
