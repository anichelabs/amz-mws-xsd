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
 *         &lt;element name="AreBatteriesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatteriesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClosureType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FitType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IncludesRechargableBattery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InnerMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="InsoleMaterialType" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MaterialComposition" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="OuterMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Seasons" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TargetAudience" type="{}StringNotNull" minOccurs="0"/>
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
    "areBatteriesIncluded",
    "batteriesRequired",
    "closureType",
    "fitType",
    "includesRechargableBattery",
    "innerMaterialType",
    "insoleMaterialType",
    "materialComposition",
    "outerMaterialType",
    "seasons",
    "targetAudience"
})
@XmlRootElement(name = "Gloves")
public class Gloves {

    @XmlElement(name = "AreBatteriesIncluded")
    protected Boolean areBatteriesIncluded;
    @XmlElement(name = "BatteriesRequired")
    protected Boolean batteriesRequired;
    @XmlElement(name = "ClosureType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String closureType;
    @XmlElement(name = "FitType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fitType;
    @XmlElement(name = "IncludesRechargableBattery")
    protected Boolean includesRechargableBattery;
    @XmlElement(name = "InnerMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String innerMaterialType;
    @XmlElement(name = "InsoleMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String insoleMaterialType;
    @XmlElement(name = "MaterialComposition")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String materialComposition;
    @XmlElement(name = "OuterMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String outerMaterialType;
    @XmlElement(name = "Seasons")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String seasons;
    @XmlElement(name = "TargetAudience")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetAudience;

    /**
     * Gets the value of the areBatteriesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesIncluded() {
        return areBatteriesIncluded;
    }

    /**
     * Sets the value of the areBatteriesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesIncluded(Boolean value) {
        this.areBatteriesIncluded = value;
    }

    /**
     * Gets the value of the batteriesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatteriesRequired() {
        return batteriesRequired;
    }

    /**
     * Sets the value of the batteriesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatteriesRequired(Boolean value) {
        this.batteriesRequired = value;
    }

    /**
     * Gets the value of the closureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureType() {
        return closureType;
    }

    /**
     * Sets the value of the closureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureType(String value) {
        this.closureType = value;
    }

    /**
     * Gets the value of the fitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFitType() {
        return fitType;
    }

    /**
     * Sets the value of the fitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFitType(String value) {
        this.fitType = value;
    }

    /**
     * Gets the value of the includesRechargableBattery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesRechargableBattery() {
        return includesRechargableBattery;
    }

    /**
     * Sets the value of the includesRechargableBattery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesRechargableBattery(Boolean value) {
        this.includesRechargableBattery = value;
    }

    /**
     * Gets the value of the innerMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnerMaterialType() {
        return innerMaterialType;
    }

    /**
     * Sets the value of the innerMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnerMaterialType(String value) {
        this.innerMaterialType = value;
    }

    /**
     * Gets the value of the insoleMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsoleMaterialType() {
        return insoleMaterialType;
    }

    /**
     * Sets the value of the insoleMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsoleMaterialType(String value) {
        this.insoleMaterialType = value;
    }

    /**
     * Gets the value of the materialComposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialComposition() {
        return materialComposition;
    }

    /**
     * Sets the value of the materialComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialComposition(String value) {
        this.materialComposition = value;
    }

    /**
     * Gets the value of the outerMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterMaterialType() {
        return outerMaterialType;
    }

    /**
     * Sets the value of the outerMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterMaterialType(String value) {
        this.outerMaterialType = value;
    }

    /**
     * Gets the value of the seasons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasons() {
        return seasons;
    }

    /**
     * Sets the value of the seasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasons(String value) {
        this.seasons = value;
    }

    /**
     * Gets the value of the targetAudience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAudience() {
        return targetAudience;
    }

    /**
     * Sets the value of the targetAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAudience(String value) {
        this.targetAudience = value;
    }

}
