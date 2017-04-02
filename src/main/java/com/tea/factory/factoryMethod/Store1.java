/**
 * @author teaho2015@gmail.com
 * since 2017/4/2
 */
package com.tea.factory.factoryMethod;

public class Store1 extends Store {
    @Override
    protected Product createProduct(String type) {
        Product p = null;
        switch (type) {
            case "1": p = new Product1();break;
            case "2": p = new Product2();break;
            default: break;
        }
        return p;
    }
}
