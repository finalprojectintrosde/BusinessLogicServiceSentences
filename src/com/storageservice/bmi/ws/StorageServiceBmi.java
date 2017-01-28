
package com.storageservice.bmi.ws;

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
@WebServiceClient(name = "storageServiceBmi", targetNamespace = "http://ws.bmi.storageservice.com/", wsdlLocation = "https://storageservicebmi.herokuapp.com/ws/storageServiceBmi?wsdl")
public class StorageServiceBmi
    extends Service
{

    private final static URL STORAGESERVICEBMI_WSDL_LOCATION;
    private final static WebServiceException STORAGESERVICEBMI_EXCEPTION;
    private final static QName STORAGESERVICEBMI_QNAME = new QName("http://ws.bmi.storageservice.com/", "storageServiceBmi");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://storageservicebmi.herokuapp.com/ws/storageServiceBmi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STORAGESERVICEBMI_WSDL_LOCATION = url;
        STORAGESERVICEBMI_EXCEPTION = e;
    }

    public StorageServiceBmi() {
        super(__getWsdlLocation(), STORAGESERVICEBMI_QNAME);
    }

    public StorageServiceBmi(WebServiceFeature... features) {
        super(__getWsdlLocation(), STORAGESERVICEBMI_QNAME, features);
    }

    public StorageServiceBmi(URL wsdlLocation) {
        super(wsdlLocation, STORAGESERVICEBMI_QNAME);
    }

    public StorageServiceBmi(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STORAGESERVICEBMI_QNAME, features);
    }

    public StorageServiceBmi(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StorageServiceBmi(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BmiApi
     */
    @WebEndpoint(name = "BmiApiImplPort")
    public BmiApi getBmiApiImplPort() {
        return super.getPort(new QName("http://ws.bmi.storageservice.com/", "BmiApiImplPort"), BmiApi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BmiApi
     */
    @WebEndpoint(name = "BmiApiImplPort")
    public BmiApi getBmiApiImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.bmi.storageservice.com/", "BmiApiImplPort"), BmiApi.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STORAGESERVICEBMI_EXCEPTION!= null) {
            throw STORAGESERVICEBMI_EXCEPTION;
        }
        return STORAGESERVICEBMI_WSDL_LOCATION;
    }

}
