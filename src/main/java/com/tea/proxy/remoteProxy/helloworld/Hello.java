/**
 * @author teaho2015@gmail.com
 * since 2017/4/10
 */
package com.tea.proxy.remoteProxy.helloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}