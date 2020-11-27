/**
 * ScarServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class ScarServiceServiceLocator extends org.apache.axis.client.Service implements pt.victoria.hub.b2c.ScarService.ScarServiceService {

    public ScarServiceServiceLocator() {
    }


    public ScarServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScarServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScarServicePort
    private java.lang.String ScarServicePort_address = "http://192.168.189.11:9090/v1/scarService";

    public java.lang.String getScarServicePortAddress() {
        return ScarServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScarServicePortWSDDServiceName = "ScarServicePort";

    public java.lang.String getScarServicePortWSDDServiceName() {
        return ScarServicePortWSDDServiceName;
    }

    public void setScarServicePortWSDDServiceName(java.lang.String name) {
        ScarServicePortWSDDServiceName = name;
    }

    public pt.victoria.hub.b2c.ScarService.ScarService getScarServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScarServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScarServicePort(endpoint);
    }

    public pt.victoria.hub.b2c.ScarService.ScarService getScarServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pt.victoria.hub.b2c.ScarService.ScarServiceServiceSoapBindingStub _stub = new pt.victoria.hub.b2c.ScarService.ScarServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getScarServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScarServicePortEndpointAddress(java.lang.String address) {
        ScarServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pt.victoria.hub.b2c.ScarService.ScarService.class.isAssignableFrom(serviceEndpointInterface)) {
                pt.victoria.hub.b2c.ScarService.ScarServiceServiceSoapBindingStub _stub = new pt.victoria.hub.b2c.ScarService.ScarServiceServiceSoapBindingStub(new java.net.URL(ScarServicePort_address), this);
                _stub.setPortName(getScarServicePortWSDDServiceName());
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
        if ("ScarServicePort".equals(inputPortName)) {
            return getScarServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", "ScarServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", "ScarServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScarServicePort".equals(portName)) {
            setScarServicePortEndpointAddress(address);
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
