/**
 * Hello.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice;


public interface Hello extends java.rmi.Remote {
    public java.lang.String sayPlainTextHello() throws java.rmi.RemoteException;
    public java.lang.String sayHtmlHello() throws java.rmi.RemoteException;
    public java.lang.String sayXMLHello() throws java.rmi.RemoteException;
}
