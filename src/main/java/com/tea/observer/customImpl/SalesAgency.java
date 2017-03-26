/**
 * @author teaho2015@gmail.com
 * since 2017/3/26
 */
package com.tea.observer.customImpl;

/**
 * 销售中介
 */
public class SalesAgency implements Observer {
    private Subject subject;

    public SalesAgency(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void notify(RealEstateDataModel dataModel) {
        System.out.println("SalesAgency" + this + "is doing somethings!!" + dataModel);
    }
}
