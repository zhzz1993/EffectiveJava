
package com.WebService.client;

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
@WebServiceClient(name = "myWebServiceImplService", targetNamespace = "http://impl.service.test.zhuzz.com/", wsdlLocation = "http://172.16.171.54:8221/webService?wsdl")
public class MyWebServiceImplService
    extends Service
{

    private final static URL MYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MYWEBSERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.test.zhuzz.com/", "myWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.16.171.54:8221/webService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MYWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MyWebServiceImplService() {
        super(__getWsdlLocation(), MYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public MyWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public MyWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public MyWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public MyWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyWebServiceImpl
     */
    @WebEndpoint(name = "myWebServiceImplPort")
    public MyWebServiceImpl getMyWebServiceImplPort() {
        return super.getPort(new QName("http://impl.service.test.zhuzz.com/", "myWebServiceImplPort"), MyWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyWebServiceImpl
     */
    @WebEndpoint(name = "myWebServiceImplPort")
    public MyWebServiceImpl getMyWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.test.zhuzz.com/", "myWebServiceImplPort"), MyWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MYWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
