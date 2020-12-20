package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20
 * @description: 懒汉式（静态内部类）
 */
public class type7 {
    public static void main(String[] args) {

    }
}

class Singleton7{
    private Singleton7() {

    }
    // 静态内部类.类中有静态属性。
    // 静态内部类只有在使用到时才会进行加载
    private static class SingletonInstace{
        private  static final Singleton7 SINGLETON_7 = new Singleton7();
    }

    // 直接返回 SingletonInstace.SINGLETON_7
    public static Singleton7 getInstace(){
        return SingletonInstace.SINGLETON_7;
    }
}