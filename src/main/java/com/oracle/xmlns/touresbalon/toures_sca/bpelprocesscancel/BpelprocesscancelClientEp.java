package com.oracle.xmlns.touresbalon.toures_sca.bpelprocesscancel;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2018-11-06T19:30:41.862-05:00
 * Generated source version: 3.1.0
 * 
 */
@WebServiceClient(name = "bpelprocesscancel_client_ep", 
                  wsdlLocation = "/bpelprocesscancel_client_ep.wsdl",
                  targetNamespace = "http://xmlns.oracle.com/TouresBalon/toures_sca/BPELProcessCancel") 
public class BpelprocesscancelClientEp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/TouresBalon/toures_sca/BPELProcessCancel", "bpelprocesscancel_client_ep");
    public final static QName BPELProcessCancelPt = new QName("http://xmlns.oracle.com/TouresBalon/toures_sca/BPELProcessCancel", "BPELProcessCancel_pt");
    static {
        URL url = BpelprocesscancelClientEp.class.getResource("/bpelprocesscancel_client_ep.wsdl");
        if (url == null) {
            url = BpelprocesscancelClientEp.class.getClassLoader().getResource("/bpelprocesscancel_client_ep.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(BpelprocesscancelClientEp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/bpelprocesscancel_client_ep.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public BpelprocesscancelClientEp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BpelprocesscancelClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelprocesscancelClientEp() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BpelprocesscancelClientEp(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BpelprocesscancelClientEp(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BpelprocesscancelClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BPELProcessCancel
     */
    @WebEndpoint(name = "BPELProcessCancel_pt")
    public BPELProcessCancel getBPELProcessCancelPt() {
        return super.getPort(BPELProcessCancelPt, BPELProcessCancel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELProcessCancel
     */
    @WebEndpoint(name = "BPELProcessCancel_pt")
    public BPELProcessCancel getBPELProcessCancelPt(WebServiceFeature... features) {
        return super.getPort(BPELProcessCancelPt, BPELProcessCancel.class, features);
    }

}