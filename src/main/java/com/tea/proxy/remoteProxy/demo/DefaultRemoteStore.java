/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.remoteProxy.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DefaultRemoteStore extends UnicastRemoteObject implements RemoteStore {
    private static final long serialVersionUID = -6415918724751304895L;
    private int               count;
    private String            location;

    public DefaultRemoteStore(int count, String location) throws RemoteException {
        this.count = count;
        this.location = location;
    }

    @Override
    public String reportLocation() throws RemoteException {
        return location;
    }

    @Override
    public int reportCount() throws RemoteException {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Remote location is: ");
        sb.append(location);
        sb.append("\n");
        sb.append("Curret count is: ");
        sb.append(count);
        return sb.toString();
    }

}