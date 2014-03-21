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
 *         &lt;element name="CameraType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="film-camera"/>
 *               &lt;enumeration value="digital-camera"/>
 *               &lt;enumeration value="camcorder"/>
 *               &lt;enumeration value="universal"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MeterType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ambient"/>
 *               &lt;enumeration value="flash"/>
 *               &lt;enumeration value="ambient-and-flash"/>
 *               &lt;enumeration value="spot"/>
 *               &lt;enumeration value="color"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MeterDisplay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="analog"/>
 *               &lt;enumeration value="digital"/>
 *               &lt;enumeration value="led"/>
 *               &lt;enumeration value="match-needle"/>
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
    "cameraType",
    "meterType",
    "meterDisplay"
})
@XmlRootElement(name = "LightMeter")
public class LightMeter {

    @XmlElement(name = "CameraType")
    protected String cameraType;
    @XmlElement(name = "MeterType")
    protected String meterType;
    @XmlElement(name = "MeterDisplay")
    protected String meterDisplay;

    /**
     * Gets the value of the cameraType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraType() {
        return cameraType;
    }

    /**
     * Sets the value of the cameraType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraType(String value) {
        this.cameraType = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the meterDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterDisplay() {
        return meterDisplay;
    }

    /**
     * Sets the value of the meterDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterDisplay(String value) {
        this.meterDisplay = value;
    }

}