/**
 * @author teaho2015@gmail.com
 * since 2017/3/26
 */
package com.tea.observer.customImpl;

/**
 * 社区机构展示
 */
public class CommunityAgency implements Observer {
    private Subject subject;

    public CommunityAgency(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void notify(RealEstateDataModel dataModel) {
        System.out.println( "Comunity " + this + " is doing somethings!!" + dataModel);
    }
}
