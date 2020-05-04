package com.jdk7.reference.persion;

/**
 * @Description: 函数式接口
 * @author: HuangJing
 * @date: 2020/02/15  21:40:35
 * @Version: 1.0
 **/
@FunctionalInterface
public interface PersionBuilder {
    Persion builderPerison(String name);
}
