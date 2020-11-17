package com.jdk8.reference.supermf;

/**
 * @Description: 子类
 * @author: HuangJing
 * @date: 2020/02/15  21:09:41
 * @Version: 1.0
 **/
public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello,我是Man");
    }
    public void method(Greetable g){
        g.greet();
    }
    public void shou(){
        /*method(()->{
            Human human = new Human();
            human.sayHello();
        });*/
//        method(()->super.sayHello());//因为有继承关系，super代表父类，可以直接用super调用父类的成员方法
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().shou();
    }
}
