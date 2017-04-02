/**
 * @author teaho2015@gmail.com
 * since 2017/4/3
 */
package com.tea.factory.abstractFactory;

public class ProductFactory1 implements ProductFactory {
    @Override
    public AbstractProductA craeteProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB craeteProductB() {
        return new ProductB1();
    }
}
