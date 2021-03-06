
package com.example.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWorldServiceImplService", targetNamespace = "http://service.example.com/", wsdlLocation = "http://localhost:8080/ws/hello?wsdl")
public class HelloWorldServiceImplService
    extends Service
{

    private final static URL HELLOWORLDSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVICEIMPLSERVICE_QNAME = new QName("http://service.example.com/", "HelloWorldServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HELLOWORLDSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HelloWorldServiceImplService() {
        super(__getWsdlLocation(), HELLOWORLDSERVICEIMPLSERVICE_QNAME);
    }

    public HelloWorldServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVICEIMPLSERVICE_QNAME);
    }

    public HelloWorldServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public IHelloWorld getHelloWorldServiceImplPort() {
        return super.getPort(new QName("http://service.example.com/", "HelloWorldServiceImplPort"), IHelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public IHelloWorld getHelloWorldServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.example.com/", "HelloWorldServiceImplPort"), IHelloWorld.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
