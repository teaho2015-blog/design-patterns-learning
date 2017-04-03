/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.facade;

public class TestMain {
    public static void main(String[] args) {
        ADao aDao = new ADao();
        BDao bDao = new BDao();
        CDao cDao = new CDao();
        Scheculer s = new Scheculer();
        Service service = new Service(aDao, bDao, cDao, s);
        service.runBusiness();
    }
}
