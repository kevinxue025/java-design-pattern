package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20
 * @description: 懒汉式（线程安全，同步方法）
 */
public class type4 {
    public static void main(String[] args) {

    }
}

class Singleton4{
    private Singleton4() {

    }
    private static Singleton4 singleton4;

    // 提供一个静态的公共方法，当使用到的时候再创建instance
    // 加入了同步处理的synchronized，解决线程安全问题
    public static synchronized Singleton4 getInstace(){
        if (singleton4==null) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}