/**
 * @author teaho2015@gmail.com
 * since 2017/4/2
 */
package com.tea.factory.origin;


public class TestMain {
    public static void main(String[] args) {
        Store s = new Store();
        Product p = s.orderProduct("1");
        System.out.println(p);

        Product p2 = s.orderProduct("2");
        System.out.println(p2);
    }
}
