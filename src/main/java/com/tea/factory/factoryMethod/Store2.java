/**
 * @author teaho2015@gmail.com
 * since 2017/4/2
 */
package com.tea.factory.factoryMethod;

public class Store2 extends Store {
    @Override
    protected Product createProduct(String type) {
        Product p = null;
        switch (type) {
            case "3": p = new Product3();break;
            case "4": p = new Product4();break;
            default: break;
        }
        return p;
    }
}
