package com.tworks.controller;

public class CityServiceImplProxy implements com.tworks.controller.CityServiceImpl {
  private String _endpoint = null;
  private com.tworks.controller.CityServiceImpl cityServiceImpl = null;
  
  public CityServiceImplProxy() {
    _initCityServiceImplProxy();
  }
  
  public CityServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCityServiceImplProxy();
  }
  
  private void _initCityServiceImplProxy() {
    try {
      cityServiceImpl = (new com.tworks.controller.CityServiceImplServiceLocator()).getCityServiceImpl();
      if (cityServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cityServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cityServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cityServiceImpl != null)
      ((javax.xml.rpc.Stub)cityServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tworks.controller.CityServiceImpl getCityServiceImpl() {
    if (cityServiceImpl == null)
      _initCityServiceImplProxy();
    return cityServiceImpl;
  }
  
  public boolean addCity(com.tworks.domain.City _city) throws java.rmi.RemoteException{
    if (cityServiceImpl == null)
      _initCityServiceImplProxy();
    return cityServiceImpl.addCity(_city);
  }
  
  public boolean deleteCity(int id) throws java.rmi.RemoteException{
    if (cityServiceImpl == null)
      _initCityServiceImplProxy();
    return cityServiceImpl.deleteCity(id);
  }
  
  public com.tworks.domain.City getCity(int id) throws java.rmi.RemoteException{
    if (cityServiceImpl == null)
      _initCityServiceImplProxy();
    return cityServiceImpl.getCity(id);
  }
  
  public com.tworks.domain.City[] getAllCity() throws java.rmi.RemoteException{
    if (cityServiceImpl == null)
      _initCityServiceImplProxy();
    return cityServiceImpl.getAllCity();
  }
  
  
}