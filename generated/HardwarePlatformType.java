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
 * <p>Java class for HardwarePlatformType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardwarePlatformType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linux"/>
 *     &lt;enumeration value="mac"/>
 *     &lt;enumeration value="windows"/>
 *     &lt;enumeration value="unix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardwarePlatformType")
@XmlEnum
public enum HardwarePlatformType {

    @XmlEnumValue("linux")
    LINUX("linux"),
    @XmlEnumValue("mac")
    MAC("mac"),
    @XmlEnumValue("windows")
    WINDOWS("windows"),
    @XmlEnumValue("unix")
    UNIX("unix");
    private final String value;

    HardwarePlatformType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardwarePlatformType fromValue(String v) {
        for (HardwarePlatformType c: HardwarePlatformType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
