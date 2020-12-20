package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20
 * @description: 懒汉式（静态内部类）
 */
public class type8 {
    public static void main(String[] args) {
        Singleton8 singleton8 = Singleton8.INSTANCE;
    }
}

enum Singleton8{
    INSTANCE;
}