package com.tworks.controller;

import java.rmi.RemoteException;

public class test {
	public static void main(String a[]) throws RemoteException{
	CityServiceImplProxy c=new CityServiceImplProxy();
	System.out.println(c.getCity(1).getCity_name());
	
	}
}
