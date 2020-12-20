package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20 14:06
 * @description: 饿汉式（静态代码块）
 */
public class type2 {
    public static void main(String[] args) {
        
    }
}

class Singleton2 {
    // 构造方法私有
    private Singleton2(){

    }
    // 本类内部创建对象实例
    private final static Singleton2 singleton2;
    // 在静态代码块中完成初始化
    static {
        singleton2 = new Singleton2();
    }

    // 提供一个公有的静态方法实例，供外界获取
    public final static Singleton2 getInstance(){
        return singleton2;
    }
}
