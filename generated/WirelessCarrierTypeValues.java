//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WirelessCarrierTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessCarrierTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="att "/>
 *     &lt;enumeration value="sprintpcs"/>
 *     &lt;enumeration value="t_mobile"/>
 *     &lt;enumeration value="verizon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WirelessCarrierTypeValues")
@XmlEnum
public enum WirelessCarrierTypeValues {

    @XmlEnumValue("att ")
    ATT("att "),
    @XmlEnumValue("sprintpcs")
    SPRINTPCS("sprintpcs"),
    @XmlEnumValue("t_mobile")
    T_MOBILE("t_mobile"),
    @XmlEnumValue("verizon")
    VERIZON("verizon");
    private final String value;

    WirelessCarrierTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessCarrierTypeValues fromValue(String v) {
        for (WirelessCarrierTypeValues c: WirelessCarrierTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}