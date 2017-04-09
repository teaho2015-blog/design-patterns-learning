/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy.dynamicProxy;

import com.tea.proxy.protectProxy.User;
import com.tea.proxy.protectProxy.UserBuilder;
import com.tea.proxy.protectProxy.UserDAO;
import com.tea.proxy.protectProxy.UserDAOImpl;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        ProtectedProxy pp = new ProtectedProxy();
        pp.setTarget(userDAO);

        UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), pp);

        User user = UserBuilder.create().build();
        userDAOProxy.save(user);
        userDAOProxy.delete();
    }
}
