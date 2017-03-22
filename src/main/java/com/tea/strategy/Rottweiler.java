/**
 * @author teaho2015@gmail.com
 * since 2017/3/22
 */
package com.tea.strategy;

public class Rottweiler implements Dog {
    protected BarkBehavior barkBehavior;

    protected DroofBehavior droofBehavior;

    public void setBarkBehavior(BarkBehavior bb) {
        barkBehavior = bb;
    }

    public void setDroofBehavior(DroofBehavior db) {
        droofBehavior = db;
    }

    public void bark() {
        barkBehavior.bark();
    }

    public void droof() {
        droofBehavior.droof();
    }

}
