/**
 * CityServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tworks.controller;

public class CityServiceImplServiceLocator extends org.apache.axis.client.Service implements com.tworks.controller.CityServiceImplService {

    public CityServiceImplServiceLocator() {
    }


    public CityServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CityServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CityServiceImpl
    private java.lang.String CityServiceImpl_address = "http://localhost:8080/JobNotifiySOAP/services/CityServiceImpl";

    public java.lang.String getCityServiceImplAddress() {
        return CityServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CityServiceImplWSDDServiceName = "CityServiceImpl";

    public java.lang.String getCityServiceImplWSDDServiceName() {
        return CityServiceImplWSDDServiceName;
    }

    public void setCityServiceImplWSDDServiceName(java.lang.String name) {
        CityServiceImplWSDDServiceName = name;
    }

    public com.tworks.controller.CityServiceImpl getCityServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CityServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCityServiceImpl(endpoint);
    }

    public com.tworks.controller.CityServiceImpl getCityServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tworks.controller.CityServiceImplSoapBindingStub _stub = new com.tworks.controller.CityServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCityServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCityServiceImplEndpointAddress(java.lang.String address) {
        CityServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tworks.controller.CityServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tworks.controller.CityServiceImplSoapBindingStub _stub = new com.tworks.controller.CityServiceImplSoapBindingStub(new java.net.URL(CityServiceImpl_address), this);
                _stub.setPortName(getCityServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CityServiceImpl".equals(inputPortName)) {
            return getCityServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.tworks.com", "CityServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.tworks.com", "CityServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CityServiceImpl".equals(portName)) {
            setCityServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
