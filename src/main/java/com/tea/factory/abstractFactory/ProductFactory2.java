/**
 * @author teaho2015@gmail.com
 * since 2017/4/3
 */
package com.tea.factory.abstractFactory;

public class ProductFactory2 implements ProductFactory {
    @Override
    public AbstractProductA craeteProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB craeteProductB() {
        return new ProductB2();
    }
}
