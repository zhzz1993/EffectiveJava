
package com.WebService.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "myWebServiceImpl", targetNamespace = "http://impl.service.test.zhuzz.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://impl.service.test.zhuzz.com/", className = "com.zhuzz.test.service.impl.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://impl.service.test.zhuzz.com/", className = "com.zhuzz.test.service.impl.SayHelloResponse")
    @Action(input = "http://impl.service.test.zhuzz.com/myWebServiceImpl/sayHelloRequest", output = "http://impl.service.test.zhuzz.com/myWebServiceImpl/sayHelloResponse")
    public String sayHello(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

}
