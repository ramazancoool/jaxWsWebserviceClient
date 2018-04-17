
package com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1;

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
@WebServiceClient(name = "AppraisalServiceV1x5", targetNamespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", wsdlLocation = "http://eaesbgatewayuat.gm.isbank.com.tr/OpSvcs/CollateralHandling/AppraisalServiceV1?wsdl")
public class AppraisalServiceV1X5_Service
    extends Service
{

    private final static URL APPRAISALSERVICEV1X5_WSDL_LOCATION;
    private final static WebServiceException APPRAISALSERVICEV1X5_EXCEPTION;
    private final static QName APPRAISALSERVICEV1X5_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "AppraisalServiceV1x5");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://eaesbgatewayuat.gm.isbank.com.tr/OpSvcs/CollateralHandling/AppraisalServiceV1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPRAISALSERVICEV1X5_WSDL_LOCATION = url;
        APPRAISALSERVICEV1X5_EXCEPTION = e;
    }

    public AppraisalServiceV1X5_Service() {
        super(__getWsdlLocation(), APPRAISALSERVICEV1X5_QNAME);
    }

    public AppraisalServiceV1X5_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AppraisalServiceV1X5
     */
    @WebEndpoint(name = "AppraisalServiceV1x5_UAT_Provider_WebService_Port1")
    public AppraisalServiceV1X5 getAppraisalServiceV1X5UATProviderWebServicePort1() {
        return super.getPort(new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "AppraisalServiceV1x5_UAT_Provider_WebService_Port1"), AppraisalServiceV1X5.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppraisalServiceV1X5
     */
    @WebEndpoint(name = "AppraisalServiceV1x5_UAT_Provider_WebService_Port1")
    public AppraisalServiceV1X5 getAppraisalServiceV1X5UATProviderWebServicePort1(WebServiceFeature... features) {
        return super.getPort(new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "AppraisalServiceV1x5_UAT_Provider_WebService_Port1"), AppraisalServiceV1X5.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPRAISALSERVICEV1X5_EXCEPTION!= null) {
            throw APPRAISALSERVICEV1X5_EXCEPTION;
        }
        return APPRAISALSERVICEV1X5_WSDL_LOCATION;
    }

}