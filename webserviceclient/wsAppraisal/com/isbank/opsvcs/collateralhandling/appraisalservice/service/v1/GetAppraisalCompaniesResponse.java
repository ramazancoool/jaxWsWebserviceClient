
package com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAppraisalCompaniesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppraisalCompaniesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAppraisalCompaniesResponseDTO" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appraisalCompanies" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAppraisalCompaniesResponse", propOrder = {
    "getAppraisalCompaniesResponseDTO"
})
public class GetAppraisalCompaniesResponse {

    @XmlElement(required = true)
    protected GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO getAppraisalCompaniesResponseDTO;

    /**
     * Gets the value of the getAppraisalCompaniesResponseDTO property.
     * 
     * @return
     *     possible object is
     *     {@link GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO }
     *     
     */
    public GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO getGetAppraisalCompaniesResponseDTO() {
        return getAppraisalCompaniesResponseDTO;
    }

    /**
     * Sets the value of the getAppraisalCompaniesResponseDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO }
     *     
     */
    public void setGetAppraisalCompaniesResponseDTO(GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO value) {
        this.getAppraisalCompaniesResponseDTO = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="appraisalCompanies" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appraisalCompanies"
    })
    public static class GetAppraisalCompaniesResponseDTO {

        @XmlElement(nillable = true)
        protected List<String> appraisalCompanies;

        /**
         * Gets the value of the appraisalCompanies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appraisalCompanies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppraisalCompanies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAppraisalCompanies() {
            if (appraisalCompanies == null) {
                appraisalCompanies = new ArrayList<String>();
            }
            return this.appraisalCompanies;
        }

    }

}
