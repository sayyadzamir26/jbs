/**
 * CityServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tworks.controller;

public interface CityServiceImpl extends java.rmi.Remote {
    public boolean addCity(com.tworks.domain.City _city) throws java.rmi.RemoteException;
    public boolean deleteCity(int id) throws java.rmi.RemoteException;
    public com.tworks.domain.City getCity(int id) throws java.rmi.RemoteException;
    public com.tworks.domain.City[] getAllCity() throws java.rmi.RemoteException;
}
