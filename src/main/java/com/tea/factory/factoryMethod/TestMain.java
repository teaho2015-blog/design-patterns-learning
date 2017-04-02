/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.factoryMethod;

public class TestMain {
    public static void main(String[] args) {
        Store store1 = new Store1();
        Product product1 = store1.orderProduct("1");
        System.out.println(product1);
        Product product2 = store1.orderProduct("2");
        System.out.println(product2);

        Store store2 = new Store2();
        Product product3 = store2.orderProduct("3");
        System.out.println(product3);
        Product product4 = store2.orderProduct("4");
        System.out.println(product4);

    }

}
