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
 * <p>Java class for MaxEnergyOutputUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaxEnergyOutputUnitOfMeasure">
 *   &lt;restriction base="{}String">
 *     &lt;enumeration value="btus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaxEnergyOutputUnitOfMeasure")
@XmlEnum
public enum MaxEnergyOutputUnitOfMeasure {

    @XmlEnumValue("btus")
    BTUS("btus");
    private final String value;

    MaxEnergyOutputUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaxEnergyOutputUnitOfMeasure fromValue(String v) {
        for (MaxEnergyOutputUnitOfMeasure c: MaxEnergyOutputUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
