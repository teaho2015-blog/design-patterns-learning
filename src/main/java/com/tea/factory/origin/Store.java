/**
 * @author teaho2015@gmail.com
 * since 2017/4/2
 */
package com.tea.factory.origin;

public class Store {
    public Product orderProduct(String type) {

        Product product = null;
        switch (type) {
            case "1":
                product = new Product1();
                break;
            case "2":
                product = new Product2();
                break;
            default:
                break;
        }
        product.prepare();
        product.make();
        product.pack();
        return product;
    }
}
