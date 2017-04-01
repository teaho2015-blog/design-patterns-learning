/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.simple;


public class Store {
    SimpleFactory simpleFactory;

    public Store(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Product orderProduct(String type) throws NoTypeDeFoundException {
        Product product = simpleFactory.createProduct(type);
        product.prepare();
        product.make();
        product.pack();
        return product;
    }
}
