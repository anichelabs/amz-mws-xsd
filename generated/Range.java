//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="AirflowDisplacement" type="{}AirflowDisplacementDimension" minOccurs="0"/>
 *         &lt;element name="BurnerType" type="{}String" minOccurs="0"/>
 *         &lt;element name="ChamberVolume" type="{}WaterConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="ControlsType" type="{}String" minOccurs="0"/>
 *         &lt;element name="CooktopMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DrawerType" type="{}String" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="EnergyConsumptionConvection" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="EnergyConsumptionStandard" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="FuelType" type="{}String" minOccurs="0"/>
 *         &lt;element name="HeatingElements" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="HeatingMode" type="{}String" minOccurs="0"/>
 *         &lt;element name="HoodDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightingMethod" type="{}String" minOccurs="0"/>
 *         &lt;element name="MaxEnergyOutput" type="{}MaxEnergyOutputDimension" minOccurs="0"/>
 *         &lt;element name="Racks" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RecommendedProductUses" type="{}String" minOccurs="0"/>
 *         &lt;element name="ShelfType" type="{}String" minOccurs="0"/>
 *         &lt;element name="TopStyle" type="{}String" minOccurs="0"/>
 *         &lt;element name="TrayType" type="{}String" minOccurs="0"/>
 *         &lt;element name="VolumeCapacityName" type="{}StringNotNull" minOccurs="0"/>
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
    "airflowDisplacement",
    "burnerType",
    "chamberVolume",
    "controlsType",
    "cooktopMaterialType",
    "drawerType",
    "energyConsumptionConvection",
    "energyConsumptionStandard",
    "fuelType",
    "heatingElements",
    "heatingMode",
    "hoodDescription",
    "lightingMethod",
    "maxEnergyOutput",
    "racks",
    "recommendedProductUses",
    "shelfType",
    "topStyle",
    "trayType",
    "volumeCapacityName"
})
@XmlRootElement(name = "Range")
public class Range {

    @XmlElement(name = "AirflowDisplacement")
    protected AirflowDisplacementDimension airflowDisplacement;
    @XmlElement(name = "BurnerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String burnerType;
    @XmlElement(name = "ChamberVolume")
    protected WaterConsumptionDimension chamberVolume;
    @XmlElement(name = "ControlsType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String controlsType;
    @XmlElement(name = "CooktopMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cooktopMaterialType;
    @XmlElement(name = "DrawerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> drawerType;
    @XmlElement(name = "EnergyConsumptionConvection")
    protected EnergyConsumptionDimension energyConsumptionConvection;
    @XmlElement(name = "EnergyConsumptionStandard")
    protected EnergyConsumptionDimension energyConsumptionStandard;
    @XmlElement(name = "FuelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fuelType;
    @XmlElement(name = "HeatingElements")
    protected BigInteger heatingElements;
    @XmlElement(name = "HeatingMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String heatingMode;
    @XmlElement(name = "HoodDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hoodDescription;
    @XmlElement(name = "LightingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lightingMethod;
    @XmlElement(name = "MaxEnergyOutput")
    protected MaxEnergyOutputDimension maxEnergyOutput;
    @XmlElement(name = "Racks")
    protected BigInteger racks;
    @XmlElement(name = "RecommendedProductUses")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recommendedProductUses;
    @XmlElement(name = "ShelfType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shelfType;
    @XmlElement(name = "TopStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String topStyle;
    @XmlElement(name = "TrayType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String trayType;
    @XmlElement(name = "VolumeCapacityName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String volumeCapacityName;

    /**
     * Gets the value of the airflowDisplacement property.
     * 
     * @return
     *     possible object is
     *     {@link AirflowDisplacementDimension }
     *     
     */
    public AirflowDisplacementDimension getAirflowDisplacement() {
        return airflowDisplacement;
    }

    /**
     * Sets the value of the airflowDisplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirflowDisplacementDimension }
     *     
     */
    public void setAirflowDisplacement(AirflowDisplacementDimension value) {
        this.airflowDisplacement = value;
    }

    /**
     * Gets the value of the burnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurnerType() {
        return burnerType;
    }

    /**
     * Sets the value of the burnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurnerType(String value) {
        this.burnerType = value;
    }

    /**
     * Gets the value of the chamberVolume property.
     * 
     * @return
     *     possible object is
     *     {@link WaterConsumptionDimension }
     *     
     */
    public WaterConsumptionDimension getChamberVolume() {
        return chamberVolume;
    }

    /**
     * Sets the value of the chamberVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterConsumptionDimension }
     *     
     */
    public void setChamberVolume(WaterConsumptionDimension value) {
        this.chamberVolume = value;
    }

    /**
     * Gets the value of the controlsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlsType() {
        return controlsType;
    }

    /**
     * Sets the value of the controlsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlsType(String value) {
        this.controlsType = value;
    }

    /**
     * Gets the value of the cooktopMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCooktopMaterialType() {
        return cooktopMaterialType;
    }

    /**
     * Sets the value of the cooktopMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCooktopMaterialType(String value) {
        this.cooktopMaterialType = value;
    }

    /**
     * Gets the value of the drawerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDrawerType() {
        if (drawerType == null) {
            drawerType = new ArrayList<String>();
        }
        return this.drawerType;
    }

    /**
     * Gets the value of the energyConsumptionConvection property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getEnergyConsumptionConvection() {
        return energyConsumptionConvection;
    }

    /**
     * Sets the value of the energyConsumptionConvection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setEnergyConsumptionConvection(EnergyConsumptionDimension value) {
        this.energyConsumptionConvection = value;
    }

    /**
     * Gets the value of the energyConsumptionStandard property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getEnergyConsumptionStandard() {
        return energyConsumptionStandard;
    }

    /**
     * Sets the value of the energyConsumptionStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setEnergyConsumptionStandard(EnergyConsumptionDimension value) {
        this.energyConsumptionStandard = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the heatingElements property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeatingElements() {
        return heatingElements;
    }

    /**
     * Sets the value of the heatingElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeatingElements(BigInteger value) {
        this.heatingElements = value;
    }

    /**
     * Gets the value of the heatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingMode() {
        return heatingMode;
    }

    /**
     * Sets the value of the heatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingMode(String value) {
        this.heatingMode = value;
    }

    /**
     * Gets the value of the hoodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoodDescription() {
        return hoodDescription;
    }

    /**
     * Sets the value of the hoodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoodDescription(String value) {
        this.hoodDescription = value;
    }

    /**
     * Gets the value of the lightingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightingMethod() {
        return lightingMethod;
    }

    /**
     * Sets the value of the lightingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightingMethod(String value) {
        this.lightingMethod = value;
    }

    /**
     * Gets the value of the maxEnergyOutput property.
     * 
     * @return
     *     possible object is
     *     {@link MaxEnergyOutputDimension }
     *     
     */
    public MaxEnergyOutputDimension getMaxEnergyOutput() {
        return maxEnergyOutput;
    }

    /**
     * Sets the value of the maxEnergyOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxEnergyOutputDimension }
     *     
     */
    public void setMaxEnergyOutput(MaxEnergyOutputDimension value) {
        this.maxEnergyOutput = value;
    }

    /**
     * Gets the value of the racks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRacks() {
        return racks;
    }

    /**
     * Sets the value of the racks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRacks(BigInteger value) {
        this.racks = value;
    }

    /**
     * Gets the value of the recommendedProductUses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedProductUses() {
        return recommendedProductUses;
    }

    /**
     * Sets the value of the recommendedProductUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedProductUses(String value) {
        this.recommendedProductUses = value;
    }

    /**
     * Gets the value of the shelfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfType() {
        return shelfType;
    }

    /**
     * Sets the value of the shelfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfType(String value) {
        this.shelfType = value;
    }

    /**
     * Gets the value of the topStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopStyle() {
        return topStyle;
    }

    /**
     * Sets the value of the topStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopStyle(String value) {
        this.topStyle = value;
    }

    /**
     * Gets the value of the trayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrayType() {
        return trayType;
    }

    /**
     * Sets the value of the trayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrayType(String value) {
        this.trayType = value;
    }

    /**
     * Gets the value of the volumeCapacityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeCapacityName() {
        return volumeCapacityName;
    }

    /**
     * Sets the value of the volumeCapacityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeCapacityName(String value) {
        this.volumeCapacityName = value;
    }

}
