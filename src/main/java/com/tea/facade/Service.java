/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.facade;

import java.util.List;

public class Service {
    private ADao aDao;
    private BDao bDao;
    private CDao cDao;
    private Scheculer scheculer;

    public Service(ADao daoA,BDao bDao, CDao cDao, Scheculer scheculer) {
        this.aDao = daoA;
        this.bDao = bDao;
        this.cDao = cDao;
        this.scheculer = scheculer;
    }

    public void runBusiness() {
        aDao.insert();
        bDao.getList().stream().forEach(s -> {
            System.out.println(s);
        });
        cDao.delete();
        scheculer.addCronJob("1 1 1 1 1 1 1");
    }

}
