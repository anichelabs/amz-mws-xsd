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
 * <p>Java class for ThicknessUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThicknessUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="gauge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThicknessUnitOfMeasure")
@XmlEnum
public enum ThicknessUnitOfMeasure {

    IN("IN"),
    CM("CM"),
    MM("MM"),
    @XmlEnumValue("gauge")
    GAUGE("gauge");
    private final String value;

    ThicknessUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThicknessUnitOfMeasure fromValue(String v) {
        for (ThicknessUnitOfMeasure c: ThicknessUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}