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
 *                         &lt;enumeration value="ItemWeight"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Style"/>
 *                         &lt;enumeration value="PATTERN"/>
 *                         &lt;enumeration value="CustomerPackageType"/>
 *                         &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumEfficiencyReportingValue" type="{}MERVType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryCapacity" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyDescription" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
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
    "size",
    "color",
    "colorMap",
    "material",
    "minimumEfficiencyReportingValue",
    "powerSource",
    "voltage",
    "wattage",
    "batteryCapacity",
    "manufacturerWarrantyDescription",
    "sellerWarrantyDescription",
    "customerPackageType"
})
@XmlRootElement(name = "MajorHomeAppliances")
public class MajorHomeAppliances {

    @XmlElement(name = "VariationData")
    protected MajorHomeAppliances.VariationData variationData;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String size;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colorMap;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String material;
    @XmlElement(name = "MinimumEfficiencyReportingValue")
    protected Integer minimumEfficiencyReportingValue;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerSource;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "BatteryCapacity")
    protected BigDecimal batteryCapacity;
    @XmlElement(name = "ManufacturerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerWarrantyDescription;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sellerWarrantyDescription;
    @XmlElement(name = "CustomerPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customerPackageType;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link MajorHomeAppliances.VariationData }
     *     
     */
    public MajorHomeAppliances.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MajorHomeAppliances.VariationData }
     *     
     */
    public void setVariationData(MajorHomeAppliances.VariationData value) {
        this.variationData = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the colorMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorMap() {
        return colorMap;
    }

    /**
     * Sets the value of the colorMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMap(String value) {
        this.colorMap = value;
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
     * Gets the value of the minimumEfficiencyReportingValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumEfficiencyReportingValue() {
        return minimumEfficiencyReportingValue;
    }

    /**
     * Sets the value of the minimumEfficiencyReportingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumEfficiencyReportingValue(Integer value) {
        this.minimumEfficiencyReportingValue = value;
    }

    /**
     * Gets the value of the powerSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
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
     * Gets the value of the batteryCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Sets the value of the batteryCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryCapacity(BigDecimal value) {
        this.batteryCapacity = value;
    }

    /**
     * Gets the value of the manufacturerWarrantyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerWarrantyDescription() {
        return manufacturerWarrantyDescription;
    }

    /**
     * Sets the value of the manufacturerWarrantyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerWarrantyDescription(String value) {
        this.manufacturerWarrantyDescription = value;
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
     * Gets the value of the customerPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPackageType() {
        return customerPackageType;
    }

    /**
     * Sets the value of the customerPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPackageType(String value) {
        this.customerPackageType = value;
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
     *               &lt;enumeration value="ItemWeight"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Style"/>
     *               &lt;enumeration value="PATTERN"/>
     *               &lt;enumeration value="CustomerPackageType"/>
     *               &lt;enumeration value="ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
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
