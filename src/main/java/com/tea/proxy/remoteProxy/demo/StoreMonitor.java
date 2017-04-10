/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.remoteProxy.demo;


import java.rmi.RemoteException;

public class StoreMonitor {
    RemoteStore store;

    public StoreMonitor(RemoteStore store) {
        this.store = store;
    }

    public void report() throws RemoteException {
        System.out.println("Store location: " + store.reportLocation());
        System.out.println("Store count: " + store.reportCount());
    }
}