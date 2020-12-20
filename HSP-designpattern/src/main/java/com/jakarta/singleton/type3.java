package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20 14:32
 * @description:
 */
public class type3 {
    public static void main(String[] args) {

    }
}
class Singleton3{
    private Singleton3() {

    }
    private static Singleton3 singleton3;

    // 提供一个静态的公共方法，当使用到的时候再创建instace
    public static Singleton3 getInstace(){
        if (singleton3==null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}