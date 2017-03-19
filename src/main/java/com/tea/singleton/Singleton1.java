/**
 * @author teaho2015@gmail.com
 * since 2017/3/19
 */
package com.tea.singleton;

public class Singleton1 {
    private static volatile Singleton1 instance = new Singleton1();

    private Singleton1() {
    }
}
