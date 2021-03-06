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
 * <p>Java class for GiftCardsFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GiftCardsFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="email_gift_cards"/>
 *     &lt;enumeration value="plastic_gift_cards"/>
 *     &lt;enumeration value="print_at_home"/>
 *     &lt;enumeration value="multi_pack"/>
 *     &lt;enumeration value="facebook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GiftCardsFormatType")
@XmlEnum
public enum GiftCardsFormatType {

    @XmlEnumValue("email_gift_cards")
    EMAIL_GIFT_CARDS("email_gift_cards"),
    @XmlEnumValue("plastic_gift_cards")
    PLASTIC_GIFT_CARDS("plastic_gift_cards"),
    @XmlEnumValue("print_at_home")
    PRINT_AT_HOME("print_at_home"),
    @XmlEnumValue("multi_pack")
    MULTI_PACK("multi_pack"),
    @XmlEnumValue("facebook")
    FACEBOOK("facebook");
    private final String value;

    GiftCardsFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GiftCardsFormatType fromValue(String v) {
        for (GiftCardsFormatType c: GiftCardsFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
