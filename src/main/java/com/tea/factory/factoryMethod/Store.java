/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.factoryMethod;

public abstract class Store {
    public Product orderProduct(String type) {
        Product product = createProduct(type);
        product.prepare();
        product.make();
        product.pack();
        return product;
    }

    protected abstract Product createProduct(String type);
}
