/**
 * @author teaho2015@gmail.com
 * since 2017/3/26
 */
package com.tea.observer.jdkImpl;


import java.util.Observable;
import java.util.Observer;

/**
 * 销售中介
 */
public class SalesAgency implements Observer {
    Observable observable;


    public SalesAgency(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        //judge o
        /*if () {

        }*/
        if (arg instanceof RealEstateDataModel) {
            System.out.println("SalesAgency " + this + " is doing somethings!!" + (RealEstateDataModel)arg);
        }

    }
}
