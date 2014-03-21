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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amperage" type="{}AmperageDimension" minOccurs="0"/>
 *         &lt;element ref="{}ColorSpecification" minOccurs="0"/>
 *         &lt;element name="Diameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="ItemShape" type="{}String" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Viscosity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Volume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
    "amperage",
    "colorSpecification",
    "diameter",
    "itemPackageQuantity",
    "numberOfItems",
    "displayLength",
    "displayWeight",
    "displayVolume",
    "itemShape",
    "material",
    "size",
    "viscosity",
    "volume",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "AutoAccessoryMisc")
public class AutoAccessoryMisc {

    @XmlElement(name = "VariationData")
    protected AutoAccessoryMisc.VariationData variationData;
    @XmlElement(name = "Amperage")
    protected AmperageDimension amperage;
    @XmlElement(name = "ColorSpecification")
    protected ColorSpecification colorSpecification;
    @XmlElement(name = "Diameter")
    protected LengthDimension diameter;
    @XmlElement(name = "ItemPackageQuantity", defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "ItemShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemShape;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String material;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String size;
    @XmlElement(name = "Viscosity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String viscosity;
    @XmlElement(name = "Volume")
    protected VolumeDimension volume;
    @XmlElement(name = "Voltage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link AutoAccessoryMisc.VariationData }
     *     
     */
    public AutoAccessoryMisc.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoAccessoryMisc.VariationData }
     *     
     */
    public void setVariationData(AutoAccessoryMisc.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the amperage property.
     * 
     * @return
     *     possible object is
     *     {@link AmperageDimension }
     *     
     */
    public AmperageDimension getAmperage() {
        return amperage;
    }

    /**
     * Sets the value of the amperage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmperageDimension }
     *     
     */
    public void setAmperage(AmperageDimension value) {
        this.amperage = value;
    }

    /**
     * Gets the value of the colorSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ColorSpecification }
     *     
     */
    public ColorSpecification getColorSpecification() {
        return colorSpecification;
    }

    /**
     * Sets the value of the colorSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorSpecification }
     *     
     */
    public void setColorSpecification(ColorSpecification value) {
        this.colorSpecification = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDiameter(LengthDimension value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the itemPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemPackageQuantity() {
        return itemPackageQuantity;
    }

    /**
     * Sets the value of the itemPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemPackageQuantity(BigInteger value) {
        this.itemPackageQuantity = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the displayLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayLength() {
        return displayLength;
    }

    /**
     * Sets the value of the displayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayLength(LengthDimension value) {
        this.displayLength = value;
    }

    /**
     * Gets the value of the displayWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getDisplayWeight() {
        return displayWeight;
    }

    /**
     * Sets the value of the displayWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setDisplayWeight(WeightDimension value) {
        this.displayWeight = value;
    }

    /**
     * Gets the value of the displayVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getDisplayVolume() {
        return displayVolume;
    }

    /**
     * Sets the value of the displayVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setDisplayVolume(VolumeDimension value) {
        this.displayVolume = value;
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
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the viscosity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViscosity() {
        return viscosity;
    }

    /**
     * Sets the value of the viscosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViscosity(String value) {
        this.viscosity = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setVolume(VolumeDimension value) {
        this.volume = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoltage(BigInteger value) {
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
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Size-Color"/>
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