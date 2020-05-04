package com.jin01;

/**
 * @Description: Scanner
 * @author: HuangJing
 * @date: 2019/12/5  20:25:48
 * @Version: 1.0
 **/
public class Scanner {
    /**
     *
     * @Description:Scanner 类的功能：可以实现键盘输入数据，到程序中
     * 引用类型一般的使用步骤
     * 1.导包
     * import 包路径
     * 如果需要使用目标类，和当前类位于同一包下，则可以省略包语句不写
     * 只有 java.lang 包下的内容不需要导包，其他的包都需要import语句
     *
     * 2、创建
     * 类名称 对象名 = new 类名称();
     *
     * 3.使用
     * 对象名.成员方法名()
     *
     *
     * @param
     * @return:
     *
     *
     */

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入的数为" + num);

        String Str = scanner.next();
        System.out.println("输入的字符串为：" + Str);

        //匿名对象
        int i = new java.util.Scanner(System.in).nextInt();
        System.out.println("输入的数字为" + i);

    }
}
