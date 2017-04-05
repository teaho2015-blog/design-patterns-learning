/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.templateMethod;

public abstract class AbstractClass {
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
