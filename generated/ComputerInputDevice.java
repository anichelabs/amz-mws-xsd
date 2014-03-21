//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMicrophone" minOccurs="0"/>
 *         &lt;element ref="{}DeviceHardwareCompatability" minOccurs="0"/>
 *         &lt;element ref="{}DeviceSoftwareCompatability" minOccurs="0"/>
 *         &lt;element ref="{}HeadphoneStyle" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceDesignStyle" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceInterfaceTechnology" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NoiseCanceling" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfButtons" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteLaserColor" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteMemory" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteOperatingDistance" minOccurs="0"/>
 *         &lt;element ref="{}PrimaryHeadphoneUse" minOccurs="0"/>
 *         &lt;element ref="{}TrackingMethod" minOccurs="0"/>
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
    "additionalFeatures",
    "builtInMicrophone",
    "deviceHardwareCompatability",
    "deviceSoftwareCompatability",
    "headphoneStyle",
    "inputDeviceDesignStyle",
    "inputDeviceInterfaceTechnology",
    "modelNumber",
    "noiseCanceling",
    "numberOfButtons",
    "presentationRemoteLaserColor",
    "presentationRemoteMemory",
    "presentationRemoteOperatingDistance",
    "primaryHeadphoneUse",
    "trackingMethod"
})
@XmlRootElement(name = "ComputerInputDevice")
public class ComputerInputDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String additionalFeatures;
    @XmlElement(name = "BuiltInMicrophone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String builtInMicrophone;
    @XmlElement(name = "DeviceHardwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deviceHardwareCompatability;
    @XmlElement(name = "DeviceSoftwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deviceSoftwareCompatability;
    @XmlElement(name = "HeadphoneStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String headphoneStyle;
    @XmlElement(name = "InputDeviceDesignStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inputDeviceDesignStyle;
    @XmlElement(name = "InputDeviceInterfaceTechnology")
    protected String inputDeviceInterfaceTechnology;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modelNumber;
    @XmlElement(name = "NoiseCanceling")
    protected String noiseCanceling;
    @XmlElement(name = "NumberOfButtons")
    protected BigInteger numberOfButtons;
    @XmlElement(name = "PresentationRemoteLaserColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String presentationRemoteLaserColor;
    @XmlElement(name = "PresentationRemoteMemory")
    protected MemorySizeFiveDigitDimension presentationRemoteMemory;
    @XmlElement(name = "PresentationRemoteOperatingDistance")
    protected LengthFiveDigitDimension presentationRemoteOperatingDistance;
    @XmlElement(name = "PrimaryHeadphoneUse")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String primaryHeadphoneUse;
    @XmlElement(name = "TrackingMethod")
    protected String trackingMethod;

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
     * Gets the value of the additionalFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    /**
     * Sets the value of the additionalFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFeatures(String value) {
        this.additionalFeatures = value;
    }

    /**
     * Gets the value of the builtInMicrophone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltInMicrophone() {
        return builtInMicrophone;
    }

    /**
     * Sets the value of the builtInMicrophone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltInMicrophone(String value) {
        this.builtInMicrophone = value;
    }

    /**
     * Gets the value of the deviceHardwareCompatability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceHardwareCompatability() {
        return deviceHardwareCompatability;
    }

    /**
     * Sets the value of the deviceHardwareCompatability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceHardwareCompatability(String value) {
        this.deviceHardwareCompatability = value;
    }

    /**
     * Gets the value of the deviceSoftwareCompatability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSoftwareCompatability() {
        return deviceSoftwareCompatability;
    }

    /**
     * Sets the value of the deviceSoftwareCompatability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSoftwareCompatability(String value) {
        this.deviceSoftwareCompatability = value;
    }

    /**
     * Gets the value of the headphoneStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphoneStyle() {
        return headphoneStyle;
    }

    /**
     * Sets the value of the headphoneStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphoneStyle(String value) {
        this.headphoneStyle = value;
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
     * Gets the value of the inputDeviceInterfaceTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDeviceInterfaceTechnology() {
        return inputDeviceInterfaceTechnology;
    }

    /**
     * Sets the value of the inputDeviceInterfaceTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDeviceInterfaceTechnology(String value) {
        this.inputDeviceInterfaceTechnology = value;
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
     * Gets the value of the noiseCanceling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoiseCanceling() {
        return noiseCanceling;
    }

    /**
     * Sets the value of the noiseCanceling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoiseCanceling(String value) {
        this.noiseCanceling = value;
    }

    /**
     * Gets the value of the numberOfButtons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfButtons() {
        return numberOfButtons;
    }

    /**
     * Sets the value of the numberOfButtons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfButtons(BigInteger value) {
        this.numberOfButtons = value;
    }

    /**
     * Gets the value of the presentationRemoteLaserColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationRemoteLaserColor() {
        return presentationRemoteLaserColor;
    }

    /**
     * Sets the value of the presentationRemoteLaserColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationRemoteLaserColor(String value) {
        this.presentationRemoteLaserColor = value;
    }

    /**
     * Gets the value of the presentationRemoteMemory property.
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeFiveDigitDimension }
     *     
     */
    public MemorySizeFiveDigitDimension getPresentationRemoteMemory() {
        return presentationRemoteMemory;
    }

    /**
     * Sets the value of the presentationRemoteMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeFiveDigitDimension }
     *     
     */
    public void setPresentationRemoteMemory(MemorySizeFiveDigitDimension value) {
        this.presentationRemoteMemory = value;
    }

    /**
     * Gets the value of the presentationRemoteOperatingDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public LengthFiveDigitDimension getPresentationRemoteOperatingDistance() {
        return presentationRemoteOperatingDistance;
    }

    /**
     * Sets the value of the presentationRemoteOperatingDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public void setPresentationRemoteOperatingDistance(LengthFiveDigitDimension value) {
        this.presentationRemoteOperatingDistance = value;
    }

    /**
     * Gets the value of the primaryHeadphoneUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryHeadphoneUse() {
        return primaryHeadphoneUse;
    }

    /**
     * Sets the value of the primaryHeadphoneUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryHeadphoneUse(String value) {
        this.primaryHeadphoneUse = value;
    }

    /**
     * Gets the value of the trackingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingMethod() {
        return trackingMethod;
    }

    /**
     * Sets the value of the trackingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingMethod(String value) {
        this.trackingMethod = value;
    }

}
