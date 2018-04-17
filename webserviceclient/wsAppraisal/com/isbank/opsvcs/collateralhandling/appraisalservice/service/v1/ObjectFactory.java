
package com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.isbank.technical.ea.fault.schema.v1.BusinessFaultType;
import com.isbank.technical.ea.fault.schema.v1.SystemFaultType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SystemFault_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "SystemFault");
    private final static QName _GetAppraisalInfoByRefNo_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "getAppraisalInfoByRefNo");
    private final static QName _GetAppraisalInfoByRefNoResponse_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "getAppraisalInfoByRefNoResponse");
    private final static QName _BusinessFault_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "BusinessFault");
    private final static QName _GetAppraisalCompaniesResponse_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "getAppraisalCompaniesResponse");
    private final static QName _GetAppraisalCompanies_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "getAppraisalCompanies");
    private final static QName _GetAppraisalInfoByRefNoResponseGetAppraisalInfoByRefNoResponseDTOCompletionRate_QNAME = new QName("http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", "completionRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAppraisalInfoByRefNoResponse }
     * 
     */
    public GetAppraisalInfoByRefNoResponse createGetAppraisalInfoByRefNoResponse() {
        return new GetAppraisalInfoByRefNoResponse();
    }

    /**
     * Create an instance of {@link GetAppraisalCompaniesResponse }
     * 
     */
    public GetAppraisalCompaniesResponse createGetAppraisalCompaniesResponse() {
        return new GetAppraisalCompaniesResponse();
    }

    /**
     * Create an instance of {@link GetAppraisalCompanies }
     * 
     */
    public GetAppraisalCompanies createGetAppraisalCompanies() {
        return new GetAppraisalCompanies();
    }

    /**
     * Create an instance of {@link GetAppraisalInfoByRefNo }
     * 
     */
    public GetAppraisalInfoByRefNo createGetAppraisalInfoByRefNo() {
        return new GetAppraisalInfoByRefNo();
    }

    /**
     * Create an instance of {@link GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO }
     * 
     */
    public GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO createGetAppraisalInfoByRefNoResponseGetAppraisalInfoByRefNoResponseDTO() {
        return new GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO();
    }

    /**
     * Create an instance of {@link GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO }
     * 
     */
    public GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO createGetAppraisalCompaniesResponseGetAppraisalCompaniesResponseDTO() {
        return new GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "SystemFault")
    public JAXBElement<SystemFaultType> createSystemFault(SystemFaultType value) {
        return new JAXBElement<SystemFaultType>(_SystemFault_QNAME, SystemFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppraisalInfoByRefNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "getAppraisalInfoByRefNo")
    public JAXBElement<GetAppraisalInfoByRefNo> createGetAppraisalInfoByRefNo(GetAppraisalInfoByRefNo value) {
        return new JAXBElement<GetAppraisalInfoByRefNo>(_GetAppraisalInfoByRefNo_QNAME, GetAppraisalInfoByRefNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppraisalInfoByRefNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "getAppraisalInfoByRefNoResponse")
    public JAXBElement<GetAppraisalInfoByRefNoResponse> createGetAppraisalInfoByRefNoResponse(GetAppraisalInfoByRefNoResponse value) {
        return new JAXBElement<GetAppraisalInfoByRefNoResponse>(_GetAppraisalInfoByRefNoResponse_QNAME, GetAppraisalInfoByRefNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "BusinessFault")
    public JAXBElement<BusinessFaultType> createBusinessFault(BusinessFaultType value) {
        return new JAXBElement<BusinessFaultType>(_BusinessFault_QNAME, BusinessFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppraisalCompaniesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "getAppraisalCompaniesResponse")
    public JAXBElement<GetAppraisalCompaniesResponse> createGetAppraisalCompaniesResponse(GetAppraisalCompaniesResponse value) {
        return new JAXBElement<GetAppraisalCompaniesResponse>(_GetAppraisalCompaniesResponse_QNAME, GetAppraisalCompaniesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppraisalCompanies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "getAppraisalCompanies")
    public JAXBElement<GetAppraisalCompanies> createGetAppraisalCompanies(GetAppraisalCompanies value) {
        return new JAXBElement<GetAppraisalCompanies>(_GetAppraisalCompanies_QNAME, GetAppraisalCompanies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", name = "completionRate", scope = GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO.class)
    public JAXBElement<BigDecimal> createGetAppraisalInfoByRefNoResponseGetAppraisalInfoByRefNoResponseDTOCompletionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetAppraisalInfoByRefNoResponseGetAppraisalInfoByRefNoResponseDTOCompletionRate_QNAME, BigDecimal.class, GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO.class, value);
    }

}
