/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy.staticProxy;

import com.tea.proxy.protectProxy.User;
import com.tea.proxy.protectProxy.UserBuilder;
import com.tea.proxy.protectProxy.UserDAO;
import com.tea.proxy.protectProxy.UserDAOImpl;

public class TestMain {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        UserDAO userDAOProxy = new ProtectProxy(userDAO);
        User user = UserBuilder.create().defaultValue().build();

        userDAOProxy.save(user);
        userDAOProxy.delete();
    }
}
