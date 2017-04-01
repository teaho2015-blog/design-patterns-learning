/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.simple;

import java.util.Objects;

public class TestMain {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Store store = new Store(simpleFactory);
        try {
            Product product1 = store.orderProduct("1");
            System.out.println(product1);
            Product product2 = store.orderProduct("2");
            System.out.println(product2);
            Product product3 = store.orderProduct("3");
            System.out.println(product3);
        } catch (NoTypeDeFoundException e) {
            e.printStackTrace(); //TODO
        }
    }

}
