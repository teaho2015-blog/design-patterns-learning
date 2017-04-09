/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy;

public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved!!");
    }

    @Override
    public void delete() {
        System.out.println("user deleted!!!");
    }
}
