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
 * <p>Java class for WaterConsumptionUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WaterConsumptionUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="GallonsPerMinute"/>
 *     &lt;enumeration value="GallonsPerHour"/>
 *     &lt;enumeration value="GallonsPerFlush"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaterConsumptionUnitOfMeasure")
@XmlEnum
public enum WaterConsumptionUnitOfMeasure {

    @XmlEnumValue("GallonsPerMinute")
    GALLONS_PER_MINUTE("GallonsPerMinute"),
    @XmlEnumValue("GallonsPerHour")
    GALLONS_PER_HOUR("GallonsPerHour"),
    @XmlEnumValue("GallonsPerFlush")
    GALLONS_PER_FLUSH("GallonsPerFlush");
    private final String value;

    WaterConsumptionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterConsumptionUnitOfMeasure fromValue(String v) {
        for (WaterConsumptionUnitOfMeasure c: WaterConsumptionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
