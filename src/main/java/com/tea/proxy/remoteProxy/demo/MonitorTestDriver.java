/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.remoteProxy.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MonitorTestDriver {

    public static void main(String[] args) throws MalformedURLException, RemoteException,
            NotBoundException {
        String[] locations = { "rmi://localhost/store" };
        StoreMonitor[] monitor = new StoreMonitor[locations.length];
        for (int i = 0; i < locations.length; i++) {
            RemoteStore reporter = (RemoteStore) Naming.lookup(locations[i]);
            monitor[i] = new StoreMonitor(reporter);
            System.out.println(monitor[i]);
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}