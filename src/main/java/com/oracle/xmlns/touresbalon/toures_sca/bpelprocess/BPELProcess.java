package com.oracle.xmlns.touresbalon.toures_sca.bpelprocess;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2018-11-05T10:57:50.513-05:00
 * Generated source version: 3.1.0
 * 
 */
@WebService(targetNamespace = "http://xmlns.oracle.com/touresBalon/toures_sca/BPELProcess", name = "BPELProcess")
@XmlSeeAlso({co.com.touresbalon.model.canonical._1_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BPELProcess {

    @WebMethod
    @WebResult(name = "CreateSalesOrderResponse", targetNamespace = "http://touresbalon.com.co/model/canonical/1.0.0", partName = "payload")
    public co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse process(
        @WebParam(partName = "payload", name = "CreateSalesOrderRequest", targetNamespace = "http://touresbalon.com.co/model/canonical/1.0.0")
        co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest payload
    );
}
