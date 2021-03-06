//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ForUseWith" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="film-cameras"/>
 *               &lt;enumeration value="digital-cameras"/>
 *               &lt;enumeration value="camcorders"/>
 *               &lt;enumeration value="telescopes"/>
 *               &lt;enumeration value="microscopes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccessoryType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="c-mounts"/>
 *               &lt;enumeration value="lens-scope-converters"/>
 *               &lt;enumeration value="lens-to-camera-adapters"/>
 *               &lt;enumeration value="remote-lens-controllers"/>
 *               &lt;enumeration value="extenders"/>
 *               &lt;enumeration value="series-vii-adapters"/>
 *               &lt;enumeration value="t-mounts"/>
 *               &lt;enumeration value="tripod-adapters"/>
 *               &lt;enumeration value="lens-boards"/>
 *               &lt;enumeration value="bayonets"/>
 *               &lt;enumeration value="lens-hoods"/>
 *               &lt;enumeration value="lens-supports"/>
 *               &lt;enumeration value="rapid-focusing-levers"/>
 *               &lt;enumeration value="shutters"/>
 *               &lt;enumeration value="diopters"/>
 *               &lt;enumeration value="mirror-scopes"/>
 *               &lt;enumeration value="lens-caps-general"/>
 *               &lt;enumeration value="lens-caps-up-to-48mm"/>
 *               &lt;enumeration value="lens-caps-49mm"/>
 *               &lt;enumeration value="lens-caps-52mm"/>
 *               &lt;enumeration value="lens-caps-55mm"/>
 *               &lt;enumeration value="lens-caps-58mm"/>
 *               &lt;enumeration value="lens-caps-62mm"/>
 *               &lt;enumeration value="lens-caps-67mm"/>
 *               &lt;enumeration value="lens-caps-72mm"/>
 *               &lt;enumeration value="lens-caps-77mm"/>
 *               &lt;enumeration value="lens-caps-82mm"/>
 *               &lt;enumeration value="lens-caps-86mm"/>
 *               &lt;enumeration value="lens-caps-95mm"/>
 *               &lt;enumeration value="lens-caps-other-sizes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "", propOrder = {
    "forUseWith",
    "accessoryType"
})
@XmlRootElement(name = "LensAccessory")
public class LensAccessory {

    @XmlElement(name = "ForUseWith")
    protected String forUseWith;
    @XmlElement(name = "AccessoryType")
    protected String accessoryType;

    /**
     * Gets the value of the forUseWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForUseWith() {
        return forUseWith;
    }

    /**
     * Sets the value of the forUseWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForUseWith(String value) {
        this.forUseWith = value;
    }

    /**
     * Gets the value of the accessoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryType() {
        return accessoryType;
    }

    /**
     * Sets the value of the accessoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryType(String value) {
        this.accessoryType = value;
    }

}
