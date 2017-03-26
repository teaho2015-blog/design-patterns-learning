/**
 * @author teaho2015@gmail.com
 * since 2017/3/26
 */
package com.tea.observer.jdkImpl;

public class RealEstateDataModel {
    private int averagePrice;
    private int monthlyPurchaseAmount;

    public int getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int getMonthlyPurchaseAmount() {
        return monthlyPurchaseAmount;
    }

    public void setMonthlyPurchaseAmount(int monthlyPurchaseAmount) {
        this.monthlyPurchaseAmount = monthlyPurchaseAmount;
    }

    @Override
    public String toString() {
        return new StringBuffer().append(averagePrice).append(", ").append(monthlyPurchaseAmount).toString();
    }
}
