package com.jdk8.reference.persion;

/**
 * @Description:
 * @author: HuangJing
 * @date: 2020/02/15  21:42:44
 * @Version: 1.0
 **/
public class Demo {
    private static void printName(String name,PersionBuilder pb){
        Persion persion = pb.builderPerison(name);
        System.out.println(persion.getName());
    }

    public static void main(String[] args) {
        printName("黄晶",name->{
            return new Persion(name);
        });
        printName("Jin",Persion::new);
    }
}
