/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.templateMethod;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("primitiveOperation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("primitiveOperation2");
    }
}
