/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.remoteProxy.demo;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StoreTestDriver {

    private static Registry registry;
    public static void main(String[] args) {
        DefaultRemoteStore store = null;
        /*try {
            registry = LocateRegistry.createRegistry(11111);
        } catch (RemoteException e) {
            e.printStackTrace();
        }*/

        System.setProperty("java.rmi.server.hostname","localhost");
        int count;
        if (args.length < 2) {
            System.out.println("...");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            store = new DefaultRemoteStore(count, args[0]);
            Naming.rebind("//" + args[0] + "/store", store);
//            registry.rebind("//" + args[0] + "/store", store);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
