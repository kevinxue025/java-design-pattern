package com.jakarta.singleton;

/**
 * @author Kevin Xue
 * @create 2020-12-20
 * @description: 懒汉式（双重检查）
 */
public class type6 {
    public static void main(String[] args) {

    }
}

class Singleton6{
    private Singleton6() {

    }
    private static volatile Singleton6 singleton6;

    //即解决线程安全问题，又解决懒加载问题
    public static Singleton6 getInstace(){
        if (singleton6==null){
            synchronized (Singleton6.class){
                if (singleton6==null){
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}