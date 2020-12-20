package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20 15:52
 * @description:
 */
public class type5 {
    public static void main(String[] args) {

    }
}

class Singleton5{
    private Singleton5() {

    }
    private static Singleton5 singleton5;

    // 提供一个静态的公共方法，当使用到的时候再创建instance
    // synchronized对代码块进行同步处理，解决线程安全问题
    // 实际上没什么意义
    public static Singleton5 getInstace(){
        if (singleton5==null) {
            synchronized (Singleton5.class){
                singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}