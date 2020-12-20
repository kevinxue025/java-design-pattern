package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20 14:06
 * @description: 饿汉式（静态常量）
 */
public class type1 {
    public static void main(String[] args) {

    }
}
class Singleton {
    // 构造方法私有
    private Singleton(){

    }
    // 本类内部创建对象实例
    private final static Singleton singleton = new Singleton();

    // 提供一个公有的静态方法实例，供外界获取
    public final static Singleton getInstance(){
        return singleton;
    }
}
