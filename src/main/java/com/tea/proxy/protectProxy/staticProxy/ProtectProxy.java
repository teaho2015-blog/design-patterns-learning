/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy.staticProxy;

import com.tea.proxy.protectProxy.User;
import com.tea.proxy.protectProxy.UserDAO;

public class ProtectProxy implements UserDAO {
    private UserDAO userDAO;

    public ProtectProxy(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user) {
        System.out.println("before saving user!some Operation!");
        userDAO.save(user);
    }

    @Override
    public void delete() {
        System.out.println("before deletion!some Operation!");
        userDAO.delete();
    }
}
