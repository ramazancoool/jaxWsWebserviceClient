
package com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.isbank.financialmgmt.treasury.schema.v1.MoneyType;
import com.isbank.technical.ea.refdata.schema.v1.ReferenceDataType;


/**
 * <p>Java class for getAppraisalInfoByRefNoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppraisalInfoByRefNoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAppraisalInfoByRefNoResponseDTO" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="completionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *                   &lt;element name="permissionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="appraisalCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="expertFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="appraisaltrxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *                   &lt;element name="expertReportRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="appraisalAmount" type="{http://isbank.com/FinancialMgmt/Treasury/Schema/V1}MoneyType" minOccurs="0" form="qualified"/>
 *                   &lt;element name="appraisalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *                   &lt;element name="landState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="landTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="qualification" type="{http://isbank.com/Technical/EA/RefData/Schema/V1}ReferenceDataType" minOccurs="0" form="qualified"/>
 *                   &lt;element name="plot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="parcel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="blockOrFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="encLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="independentDivisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="acreage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *                   &lt;element name="ownershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="emergencySaleValue" type="{http://isbank.com/FinancialMgmt/Treasury/Schema/V1}MoneyType" minOccurs="0" form="qualified"/>
 *                   &lt;element name="ownerNameSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="shareRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
@XmlType(name = "getAppraisalInfoByRefNoResponse", propOrder = {
    "getAppraisalInfoByRefNoResponseDTO"
})
public class GetAppraisalInfoByRefNoResponse {

    @XmlElement(required = true)
    protected GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO getAppraisalInfoByRefNoResponseDTO;

    /**
     * Gets the value of the getAppraisalInfoByRefNoResponseDTO property.
     * 
     * @return
     *     possible object is
     *     {@link GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO }
     *     
     */
    public GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO getGetAppraisalInfoByRefNoResponseDTO() {
        return getAppraisalInfoByRefNoResponseDTO;
    }

    /**
     * Sets the value of the getAppraisalInfoByRefNoResponseDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO }
     *     
     */
    public void setGetAppraisalInfoByRefNoResponseDTO(GetAppraisalInfoByRefNoResponse.GetAppraisalInfoByRefNoResponseDTO value) {
        this.getAppraisalInfoByRefNoResponseDTO = value;
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
     *         &lt;element name="completionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
     *         &lt;element name="permissionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="appraisalCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="expertFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="appraisaltrxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
     *         &lt;element name="expertReportRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="appraisalAmount" type="{http://isbank.com/FinancialMgmt/Treasury/Schema/V1}MoneyType" minOccurs="0" form="qualified"/>
     *         &lt;element name="appraisalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
     *         &lt;element name="landState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="landTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="qualification" type="{http://isbank.com/Technical/EA/RefData/Schema/V1}ReferenceDataType" minOccurs="0" form="qualified"/>
     *         &lt;element name="plot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="parcel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="blockOrFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="encLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="independentDivisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="acreage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
     *         &lt;element name="ownershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="emergencySaleValue" type="{http://isbank.com/FinancialMgmt/Treasury/Schema/V1}MoneyType" minOccurs="0" form="qualified"/>
     *         &lt;element name="ownerNameSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="shareRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
        "completionRate",
        "permissionStatus",
        "appraisalCompany",
        "expertFullName",
        "appraisaltrxId",
        "expertReportRefNo",
        "appraisalAmount",
        "appraisalDate",
        "landState",
        "landTown",
        "owner",
        "qualification",
        "plot",
        "parcel",
        "block",
        "blockOrFloor",
        "district",
        "village",
        "street",
        "encLocation",
        "independentDivisionNo",
        "acreage",
        "ownershipStatus",
        "emergencySaleValue",
        "ownerNameSurname",
        "shareRate"
    })
    public static class GetAppraisalInfoByRefNoResponseDTO {

        @XmlElementRef(name = "completionRate", namespace = "http://isbank.com/OpSvcs/CollateralHandling/AppraisalService/Service/V1", type = JAXBElement.class)
        protected JAXBElement<BigDecimal> completionRate;
        protected String permissionStatus;
        protected String appraisalCompany;
        protected String expertFullName;
        protected Integer appraisaltrxId;
        protected String expertReportRefNo;
        protected MoneyType appraisalAmount;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar appraisalDate;
        protected String landState;
        protected String landTown;
        protected String owner;
        protected ReferenceDataType qualification;
        protected String plot;
        protected String parcel;
        protected String block;
        protected String blockOrFloor;
        protected String district;
        protected String village;
        protected String street;
        protected String encLocation;
        protected String independentDivisionNo;
        protected BigDecimal acreage;
        protected String ownershipStatus;
        protected MoneyType emergencySaleValue;
        protected String ownerNameSurname;
        protected String shareRate;

        /**
         * Gets the value of the completionRate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getCompletionRate() {
            return completionRate;
        }

        /**
         * Sets the value of the completionRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setCompletionRate(JAXBElement<BigDecimal> value) {
            this.completionRate = value;
        }

        /**
         * Gets the value of the permissionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPermissionStatus() {
            return permissionStatus;
        }

        /**
         * Sets the value of the permissionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermissionStatus(String value) {
            this.permissionStatus = value;
        }

        /**
         * Gets the value of the appraisalCompany property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppraisalCompany() {
            return appraisalCompany;
        }

        /**
         * Sets the value of the appraisalCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppraisalCompany(String value) {
            this.appraisalCompany = value;
        }

        /**
         * Gets the value of the expertFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpertFullName() {
            return expertFullName;
        }

        /**
         * Sets the value of the expertFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpertFullName(String value) {
            this.expertFullName = value;
        }

        /**
         * Gets the value of the appraisaltrxId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAppraisaltrxId() {
            return appraisaltrxId;
        }

        /**
         * Sets the value of the appraisaltrxId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAppraisaltrxId(Integer value) {
            this.appraisaltrxId = value;
        }

        /**
         * Gets the value of the expertReportRefNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpertReportRefNo() {
            return expertReportRefNo;
        }

        /**
         * Sets the value of the expertReportRefNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpertReportRefNo(String value) {
            this.expertReportRefNo = value;
        }

        /**
         * Gets the value of the appraisalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link MoneyType }
         *     
         */
        public MoneyType getAppraisalAmount() {
            return appraisalAmount;
        }

        /**
         * Sets the value of the appraisalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link MoneyType }
         *     
         */
        public void setAppraisalAmount(MoneyType value) {
            this.appraisalAmount = value;
        }

        /**
         * Gets the value of the appraisalDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAppraisalDate() {
            return appraisalDate;
        }

        /**
         * Sets the value of the appraisalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAppraisalDate(XMLGregorianCalendar value) {
            this.appraisalDate = value;
        }

        /**
         * Gets the value of the landState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLandState() {
            return landState;
        }

        /**
         * Sets the value of the landState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLandState(String value) {
            this.landState = value;
        }

        /**
         * Gets the value of the landTown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLandTown() {
            return landTown;
        }

        /**
         * Sets the value of the landTown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLandTown(String value) {
            this.landTown = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Gets the value of the qualification property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceDataType }
         *     
         */
        public ReferenceDataType getQualification() {
            return qualification;
        }

        /**
         * Sets the value of the qualification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceDataType }
         *     
         */
        public void setQualification(ReferenceDataType value) {
            this.qualification = value;
        }

        /**
         * Gets the value of the plot property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlot() {
            return plot;
        }

        /**
         * Sets the value of the plot property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlot(String value) {
            this.plot = value;
        }

        /**
         * Gets the value of the parcel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParcel() {
            return parcel;
        }

        /**
         * Sets the value of the parcel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParcel(String value) {
            this.parcel = value;
        }

        /**
         * Gets the value of the block property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlock() {
            return block;
        }

        /**
         * Sets the value of the block property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlock(String value) {
            this.block = value;
        }

        /**
         * Gets the value of the blockOrFloor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlockOrFloor() {
            return blockOrFloor;
        }

        /**
         * Sets the value of the blockOrFloor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlockOrFloor(String value) {
            this.blockOrFloor = value;
        }

        /**
         * Gets the value of the district property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrict() {
            return district;
        }

        /**
         * Sets the value of the district property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrict(String value) {
            this.district = value;
        }

        /**
         * Gets the value of the village property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVillage() {
            return village;
        }

        /**
         * Sets the value of the village property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVillage(String value) {
            this.village = value;
        }

        /**
         * Gets the value of the street property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreet() {
            return street;
        }

        /**
         * Sets the value of the street property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreet(String value) {
            this.street = value;
        }

        /**
         * Gets the value of the encLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncLocation() {
            return encLocation;
        }

        /**
         * Sets the value of the encLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncLocation(String value) {
            this.encLocation = value;
        }

        /**
         * Gets the value of the independentDivisionNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndependentDivisionNo() {
            return independentDivisionNo;
        }

        /**
         * Sets the value of the independentDivisionNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndependentDivisionNo(String value) {
            this.independentDivisionNo = value;
        }

        /**
         * Gets the value of the acreage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAcreage() {
            return acreage;
        }

        /**
         * Sets the value of the acreage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAcreage(BigDecimal value) {
            this.acreage = value;
        }

        /**
         * Gets the value of the ownershipStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnershipStatus() {
            return ownershipStatus;
        }

        /**
         * Sets the value of the ownershipStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnershipStatus(String value) {
            this.ownershipStatus = value;
        }

        /**
         * Gets the value of the emergencySaleValue property.
         * 
         * @return
         *     possible object is
         *     {@link MoneyType }
         *     
         */
        public MoneyType getEmergencySaleValue() {
            return emergencySaleValue;
        }

        /**
         * Sets the value of the emergencySaleValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link MoneyType }
         *     
         */
        public void setEmergencySaleValue(MoneyType value) {
            this.emergencySaleValue = value;
        }

        /**
         * Gets the value of the ownerNameSurname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerNameSurname() {
            return ownerNameSurname;
        }

        /**
         * Sets the value of the ownerNameSurname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerNameSurname(String value) {
            this.ownerNameSurname = value;
        }

        /**
         * Gets the value of the shareRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareRate() {
            return shareRate;
        }

        /**
         * Sets the value of the shareRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareRate(String value) {
            this.shareRate = value;
        }

    }

}
