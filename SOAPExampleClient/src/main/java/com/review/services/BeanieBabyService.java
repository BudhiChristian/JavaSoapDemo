
package com.review.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BeanieBabyService", targetNamespace = "http://services.review.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BeanieBabyService {


    /**
     * 
     * @return
     *     returns java.util.List<com.review.services.BeanieBaby>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBeanieBabies", targetNamespace = "http://services.review.com/", className = "com.review.services.GetAllBeanieBabies")
    @ResponseWrapper(localName = "getAllBeanieBabiesResponse", targetNamespace = "http://services.review.com/", className = "com.review.services.GetAllBeanieBabiesResponse")
    public List<BeanieBaby> getAllBeanieBabies();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NoPoemException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBeanieBaby", targetNamespace = "http://services.review.com/", className = "com.review.services.AddBeanieBaby")
    @ResponseWrapper(localName = "addBeanieBabyResponse", targetNamespace = "http://services.review.com/", className = "com.review.services.AddBeanieBabyResponse")
    public String addBeanieBaby(
        @WebParam(name = "arg0", targetNamespace = "")
        BeanieBaby arg0)
        throws NoPoemException_Exception
    ;

}