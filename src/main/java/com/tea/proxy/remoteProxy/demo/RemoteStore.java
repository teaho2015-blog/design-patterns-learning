/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.remoteProxy.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteStore extends Remote {
    public String reportLocation() throws RemoteException;

    public int reportCount() throws RemoteException;
}