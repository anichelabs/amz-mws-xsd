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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}EnergyEfficiencyRating" minOccurs="0"/>
 *         &lt;element ref="{}MainPowerConnector" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}Modular" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSATAPowerConnectors" minOccurs="0"/>
 *         &lt;element ref="{}PCIExpressConnectorConfiguration" minOccurs="0"/>
 *         &lt;element ref="{}PowerFactorCorrection" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyFormFactor" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyMaxOutput" minOccurs="0"/>
 *         &lt;element ref="{}SLICertification" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "energyEfficiencyRating",
    "mainPowerConnector",
    "modelNumber",
    "modular",
    "numberOfSATAPowerConnectors",
    "pciExpressConnectorConfiguration",
    "powerFactorCorrection",
    "powerSupplyFormFactor",
    "powerSupplyMaxOutput",
    "sliCertification",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "SystemPowerDevice")
public class SystemPowerDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String additionalFeatures;
    @XmlElement(name = "EnergyEfficiencyRating")
    protected String energyEfficiencyRating;
    @XmlElement(name = "MainPowerConnector")
    protected String mainPowerConnector;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modelNumber;
    @XmlElement(name = "Modular")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modular;
    @XmlElement(name = "NumberOfSATAPowerConnectors")
    protected BigInteger numberOfSATAPowerConnectors;
    @XmlElement(name = "PCIExpressConnectorConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pciExpressConnectorConfiguration;
    @XmlElement(name = "PowerFactorCorrection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerFactorCorrection;
    @XmlElement(name = "PowerSupplyFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerSupplyFormFactor;
    @XmlElement(name = "PowerSupplyMaxOutput")
    protected PowerSixDigitDimension powerSupplyMaxOutput;
    @XmlElement(name = "SLICertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sliCertification;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    protected BigInteger wattage;

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
     * Gets the value of the energyEfficiencyRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyEfficiencyRating() {
        return energyEfficiencyRating;
    }

    /**
     * Sets the value of the energyEfficiencyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyEfficiencyRating(String value) {
        this.energyEfficiencyRating = value;
    }

    /**
     * Gets the value of the mainPowerConnector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPowerConnector() {
        return mainPowerConnector;
    }

    /**
     * Sets the value of the mainPowerConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPowerConnector(String value) {
        this.mainPowerConnector = value;
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
     * Gets the value of the modular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModular() {
        return modular;
    }

    /**
     * Sets the value of the modular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModular(String value) {
        this.modular = value;
    }

    /**
     * Gets the value of the numberOfSATAPowerConnectors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSATAPowerConnectors() {
        return numberOfSATAPowerConnectors;
    }

    /**
     * Sets the value of the numberOfSATAPowerConnectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSATAPowerConnectors(BigInteger value) {
        this.numberOfSATAPowerConnectors = value;
    }

    /**
     * Gets the value of the pciExpressConnectorConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCIExpressConnectorConfiguration() {
        return pciExpressConnectorConfiguration;
    }

    /**
     * Sets the value of the pciExpressConnectorConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCIExpressConnectorConfiguration(String value) {
        this.pciExpressConnectorConfiguration = value;
    }

    /**
     * Gets the value of the powerFactorCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerFactorCorrection() {
        return powerFactorCorrection;
    }

    /**
     * Sets the value of the powerFactorCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerFactorCorrection(String value) {
        this.powerFactorCorrection = value;
    }

    /**
     * Gets the value of the powerSupplyFormFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupplyFormFactor() {
        return powerSupplyFormFactor;
    }

    /**
     * Sets the value of the powerSupplyFormFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupplyFormFactor(String value) {
        this.powerSupplyFormFactor = value;
    }

    /**
     * Gets the value of the powerSupplyMaxOutput property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSixDigitDimension }
     *     
     */
    public PowerSixDigitDimension getPowerSupplyMaxOutput() {
        return powerSupplyMaxOutput;
    }

    /**
     * Sets the value of the powerSupplyMaxOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSixDigitDimension }
     *     
     */
    public void setPowerSupplyMaxOutput(PowerSixDigitDimension value) {
        this.powerSupplyMaxOutput = value;
    }

    /**
     * Gets the value of the sliCertification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLICertification() {
        return sliCertification;
    }

    /**
     * Sets the value of the sliCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLICertification(String value) {
        this.sliCertification = value;
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

}
