/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.templateMethod;

public class TestMain {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();
        c.templateMethod();
    }
}
