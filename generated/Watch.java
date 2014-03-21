//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

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
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parentage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parent"/>
 *                         &lt;enumeration value="child"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="BandColor"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BandColor" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="BandMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BandLength" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BandWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ClaspType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CaseMaterial" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="CaseSizeThickness" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CaseSizeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MetalStamp" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DialColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BezelMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BezelFunction" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GemType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Crystal" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MovementType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CalendarType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WaterResistantDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ResaleType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EstatePeriod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ItemShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DisplayType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumWaterPressure" type="{}PressureDimension" minOccurs="0"/>
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
    "bandColor",
    "bandMaterial",
    "bandLength",
    "bandWidth",
    "claspType",
    "caseMaterial",
    "caseSizeThickness",
    "caseSizeDiameter",
    "metalStamp",
    "dialColor",
    "bezelMaterial",
    "bezelFunction",
    "gemType",
    "crystal",
    "movementType",
    "calendarType",
    "waterResistantDepth",
    "resaleType",
    "warrantyType",
    "sellerWarrantyDescription",
    "estatePeriod",
    "countryOfOrigin",
    "itemShape",
    "specialFeatures",
    "displayType",
    "maximumWaterPressure"
})
@XmlRootElement(name = "Watch")
public class Watch {

    @XmlElement(name = "VariationData")
    protected Watch.VariationData variationData;
    @XmlElement(name = "BandColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bandColor;
    @XmlElement(name = "BandMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bandMaterial;
    @XmlElement(name = "BandLength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bandLength;
    @XmlElement(name = "BandWidth")
    protected LengthDimension bandWidth;
    @XmlElement(name = "ClaspType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String claspType;
    @XmlElement(name = "CaseMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> caseMaterial;
    @XmlElement(name = "CaseSizeThickness")
    protected LengthDimension caseSizeThickness;
    @XmlElement(name = "CaseSizeDiameter")
    protected LengthDimension caseSizeDiameter;
    @XmlElement(name = "MetalStamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String metalStamp;
    @XmlElement(name = "DialColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dialColor;
    @XmlElement(name = "BezelMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bezelMaterial;
    @XmlElement(name = "BezelFunction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bezelFunction;
    @XmlElement(name = "GemType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gemType;
    @XmlElement(name = "Crystal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String crystal;
    @XmlElement(name = "MovementType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String movementType;
    @XmlElement(name = "CalendarType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String calendarType;
    @XmlElement(name = "WaterResistantDepth")
    protected LengthDimension waterResistantDepth;
    @XmlElement(name = "ResaleType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resaleType;
    @XmlElement(name = "WarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String warrantyType;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sellerWarrantyDescription;
    @XmlElement(name = "EstatePeriod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String estatePeriod;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "ItemShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemShape;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> specialFeatures;
    @XmlElement(name = "DisplayType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String displayType;
    @XmlElement(name = "MaximumWaterPressure")
    protected PressureDimension maximumWaterPressure;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link Watch.VariationData }
     *     
     */
    public Watch.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Watch.VariationData }
     *     
     */
    public void setVariationData(Watch.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the bandColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandColor() {
        return bandColor;
    }

    /**
     * Sets the value of the bandColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandColor(String value) {
        this.bandColor = value;
    }

    /**
     * Gets the value of the bandMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandMaterial() {
        return bandMaterial;
    }

    /**
     * Sets the value of the bandMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandMaterial(String value) {
        this.bandMaterial = value;
    }

    /**
     * Gets the value of the bandLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandLength() {
        return bandLength;
    }

    /**
     * Sets the value of the bandLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandLength(String value) {
        this.bandLength = value;
    }

    /**
     * Gets the value of the bandWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBandWidth() {
        return bandWidth;
    }

    /**
     * Sets the value of the bandWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBandWidth(LengthDimension value) {
        this.bandWidth = value;
    }

    /**
     * Gets the value of the claspType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaspType() {
        return claspType;
    }

    /**
     * Sets the value of the claspType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaspType(String value) {
        this.claspType = value;
    }

    /**
     * Gets the value of the caseMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCaseMaterial() {
        if (caseMaterial == null) {
            caseMaterial = new ArrayList<String>();
        }
        return this.caseMaterial;
    }

    /**
     * Gets the value of the caseSizeThickness property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCaseSizeThickness() {
        return caseSizeThickness;
    }

    /**
     * Sets the value of the caseSizeThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCaseSizeThickness(LengthDimension value) {
        this.caseSizeThickness = value;
    }

    /**
     * Gets the value of the caseSizeDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCaseSizeDiameter() {
        return caseSizeDiameter;
    }

    /**
     * Sets the value of the caseSizeDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCaseSizeDiameter(LengthDimension value) {
        this.caseSizeDiameter = value;
    }

    /**
     * Gets the value of the metalStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalStamp() {
        return metalStamp;
    }

    /**
     * Sets the value of the metalStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalStamp(String value) {
        this.metalStamp = value;
    }

    /**
     * Gets the value of the dialColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialColor() {
        return dialColor;
    }

    /**
     * Sets the value of the dialColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialColor(String value) {
        this.dialColor = value;
    }

    /**
     * Gets the value of the bezelMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezelMaterial() {
        return bezelMaterial;
    }

    /**
     * Sets the value of the bezelMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezelMaterial(String value) {
        this.bezelMaterial = value;
    }

    /**
     * Gets the value of the bezelFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezelFunction() {
        return bezelFunction;
    }

    /**
     * Sets the value of the bezelFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezelFunction(String value) {
        this.bezelFunction = value;
    }

    /**
     * Gets the value of the gemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemType() {
        return gemType;
    }

    /**
     * Sets the value of the gemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemType(String value) {
        this.gemType = value;
    }

    /**
     * Gets the value of the crystal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrystal() {
        return crystal;
    }

    /**
     * Sets the value of the crystal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrystal(String value) {
        this.crystal = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the calendarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarType() {
        return calendarType;
    }

    /**
     * Sets the value of the calendarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarType(String value) {
        this.calendarType = value;
    }

    /**
     * Gets the value of the waterResistantDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWaterResistantDepth() {
        return waterResistantDepth;
    }

    /**
     * Sets the value of the waterResistantDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWaterResistantDepth(LengthDimension value) {
        this.waterResistantDepth = value;
    }

    /**
     * Gets the value of the resaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResaleType() {
        return resaleType;
    }

    /**
     * Sets the value of the resaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResaleType(String value) {
        this.resaleType = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the sellerWarrantyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerWarrantyDescription() {
        return sellerWarrantyDescription;
    }

    /**
     * Sets the value of the sellerWarrantyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerWarrantyDescription(String value) {
        this.sellerWarrantyDescription = value;
    }

    /**
     * Gets the value of the estatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatePeriod() {
        return estatePeriod;
    }

    /**
     * Sets the value of the estatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatePeriod(String value) {
        this.estatePeriod = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the itemShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShape() {
        return itemShape;
    }

    /**
     * Sets the value of the itemShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShape(String value) {
        this.itemShape = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialFeatures() {
        if (specialFeatures == null) {
            specialFeatures = new ArrayList<String>();
        }
        return this.specialFeatures;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the maximumWaterPressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureDimension }
     *     
     */
    public PressureDimension getMaximumWaterPressure() {
        return maximumWaterPressure;
    }

    /**
     * Sets the value of the maximumWaterPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureDimension }
     *     
     */
    public void setMaximumWaterPressure(PressureDimension value) {
        this.maximumWaterPressure = value;
    }


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
     *         &lt;element name="Parentage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="parent"/>
     *               &lt;enumeration value="child"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="BandColor"/>
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
        "parentage",
        "variationTheme"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;

        /**
         * Gets the value of the parentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentage() {
            return parentage;
        }

        /**
         * Sets the value of the parentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentage(String value) {
            this.parentage = value;
        }

        /**
         * Gets the value of the variationTheme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariationTheme() {
            return variationTheme;
        }

        /**
         * Sets the value of the variationTheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariationTheme(String value) {
            this.variationTheme = value;
        }

    }

}
