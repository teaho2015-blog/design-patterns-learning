/**
 * @author teaho2015@gmail.com
 * since 2017/5/25
 */
package com.tea.singleton;

public class Singleton4 {
    private Singleton4(){}

    public static Singleton4 getInstance(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{
        static Singleton4 instance = new Singleton4();
    }
}
