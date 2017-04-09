/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProtectedProxy implements InvocationHandler {

    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public void beforeMethod(Method m) {

        System.out.println(m.getName() + " start");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(method);//对特定方法做一些类似事务，验证等的操作
        method.invoke(target, args);
        return null;
    }
}
