package com.example.webservice;

public class HelloProxy implements com.example.webservice.Hello {
  private String _endpoint = null;
  private com.example.webservice.Hello hello = null;
  
  public HelloProxy() {
    _initHelloProxy();
  }
  
  public HelloProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloProxy();
  }
  
  private void _initHelloProxy() {
    try {
      hello = (new com.example.webservice.HelloServiceLocator()).getHello();
      if (hello != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hello)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hello)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hello != null)
      ((javax.xml.rpc.Stub)hello)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.webservice.Hello getHello() {
    if (hello == null)
      _initHelloProxy();
    return hello;
  }
  
  public java.lang.String sayPlainTextHello() throws java.rmi.RemoteException{
    if (hello == null)
      _initHelloProxy();
    return hello.sayPlainTextHello();
  }
  
  public java.lang.String sayHtmlHello() throws java.rmi.RemoteException{
    if (hello == null)
      _initHelloProxy();
    return hello.sayHtmlHello();
  }
  
  public java.lang.String sayXMLHello() throws java.rmi.RemoteException{
    if (hello == null)
      _initHelloProxy();
    return hello.sayXMLHello();
  }
  
  
}