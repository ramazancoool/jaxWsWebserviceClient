
package com.isbank.financialmgmt.treasury.schema.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxVoucherTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxVoucherTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAB"/>
 *     &lt;enumeration value="DSB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxVoucherTypeType")
@XmlEnum
public enum FxVoucherTypeType {

    DAB,
    DSB;

    public String value() {
        return name();
    }

    public static FxVoucherTypeType fromValue(String v) {
        return valueOf(v);
    }

}
