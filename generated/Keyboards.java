//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element ref="{}HandOrientation" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceDesignStyle" minOccurs="0"/>
 *         &lt;element ref="{}KeyboardDescription" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
 *         &lt;element ref="{}WirelessInputDeviceProtocol" minOccurs="0"/>
 *         &lt;element ref="{}WirelessInputDeviceTechnology" minOccurs="0"/>
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
    "variationData",
    "handOrientation",
    "inputDeviceDesignStyle",
    "keyboardDescription",
    "modelNumber",
    "voltage",
    "wattage",
    "wirelessInputDeviceProtocol",
    "wirelessInputDeviceTechnology"
})
@XmlRootElement(name = "Keyboards")
public class Keyboards {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "HandOrientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String handOrientation;
    @XmlElement(name = "InputDeviceDesignStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inputDeviceDesignStyle;
    @XmlElement(name = "KeyboardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keyboardDescription;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modelNumber;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    protected BigInteger wattage;
    @XmlElement(name = "WirelessInputDeviceProtocol")
    protected String wirelessInputDeviceProtocol;
    @XmlElement(name = "WirelessInputDeviceTechnology")
    protected WirelessInputDeviceTechnologyTypeValues wirelessInputDeviceTechnology;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link VariationData }
     *     
     */
    public VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationData }
     *     
     */
    public void setVariationData(VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the handOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOrientation() {
        return handOrientation;
    }

    /**
     * Sets the value of the handOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOrientation(String value) {
        this.handOrientation = value;
    }

    /**
     * Gets the value of the inputDeviceDesignStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDeviceDesignStyle() {
        return inputDeviceDesignStyle;
    }

    /**
     * Sets the value of the inputDeviceDesignStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDeviceDesignStyle(String value) {
        this.inputDeviceDesignStyle = value;
    }

    /**
     * Gets the value of the keyboardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardDescription() {
        return keyboardDescription;
    }

    /**
     * Sets the value of the keyboardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardDescription(String value) {
        this.keyboardDescription = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWattage(BigInteger value) {
        this.wattage = value;
    }

    /**
     * Gets the value of the wirelessInputDeviceProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessInputDeviceProtocol() {
        return wirelessInputDeviceProtocol;
    }

    /**
     * Sets the value of the wirelessInputDeviceProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessInputDeviceProtocol(String value) {
        this.wirelessInputDeviceProtocol = value;
    }

    /**
     * Gets the value of the wirelessInputDeviceTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessInputDeviceTechnologyTypeValues }
     *     
     */
    public WirelessInputDeviceTechnologyTypeValues getWirelessInputDeviceTechnology() {
        return wirelessInputDeviceTechnology;
    }

    /**
     * Sets the value of the wirelessInputDeviceTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessInputDeviceTechnologyTypeValues }
     *     
     */
    public void setWirelessInputDeviceTechnology(WirelessInputDeviceTechnologyTypeValues value) {
        this.wirelessInputDeviceTechnology = value;
    }

}
