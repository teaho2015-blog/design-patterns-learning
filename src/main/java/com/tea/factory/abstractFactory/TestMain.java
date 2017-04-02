/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.abstractFactory;

public class TestMain {
    public static void main(String[] args) {
        ProductFactory creator = new ProductFactory1();
        AbstractProductA productA = creator.craeteProductA();
        AbstractProductB productB = creator.craeteProductB();

        System.out.println(productA);
        System.out.println(productB);

        creator = new ProductFactory2();
        productA = creator.craeteProductA();
        productB = creator.craeteProductB();
        System.out.println(productA);
        System.out.println(productB);

    }

}
