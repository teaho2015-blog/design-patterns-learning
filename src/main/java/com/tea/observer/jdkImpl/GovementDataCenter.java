/**
 * @author teaho2015@gmail.com
 * since 2017/3/27
 */
package com.tea.observer.jdkImpl;

import com.tea.observer.customImpl.Observer;
import com.tea.observer.customImpl.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GovementDataCenter extends Observable {

    private RealEstateDataModel realEstateDataModel = new RealEstateDataModel();

    public void somethingChanged() {
        setChanged();
        notifyObservers(realEstateDataModel);
    }

    public void setData(int averagePrice, int monthlyPurchaseAmount) {
        realEstateDataModel.setAveragePrice(averagePrice);
        realEstateDataModel.setMonthlyPurchaseAmount(monthlyPurchaseAmount);
        somethingChanged();
    }
}
