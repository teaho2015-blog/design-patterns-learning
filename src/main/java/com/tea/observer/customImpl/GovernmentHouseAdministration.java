/**
 * @author teaho2015@gmail.com
 * since 2017/3/26
 */
package com.tea.observer.customImpl;

public class GovernmentHouseAdministration {
    public static void main(String[] args) {
        GovementDataCenter govementDataCenter = new GovementDataCenter();
        Observer o1 = new CommunityAgency(govementDataCenter);
        Observer o2 = new SalesAgency(govementDataCenter);

        govementDataCenter.setData(111, 222);
        govementDataCenter.setData(333, 444);

    }
}
