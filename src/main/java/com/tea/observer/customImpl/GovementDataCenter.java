/**
 * @author teaho2015@gmail.com
 * since 2017/3/27
 */
package com.tea.observer.customImpl;

import java.util.ArrayList;
import java.util.List;

public class GovementDataCenter implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private RealEstateDataModel realEstateDataModel = new RealEstateDataModel();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.notify(realEstateDataModel);
        }
    }

    public void setData(int averagePrice, int monthlyPurchaseAmount) {
        realEstateDataModel.setAveragePrice(averagePrice);
        realEstateDataModel.setMonthlyPurchaseAmount(monthlyPurchaseAmount);
        notifyObservers();
    }



}
