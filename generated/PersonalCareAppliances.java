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
 *                         &lt;enumeration value="Count"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element ref="{}ColorMap" minOccurs="0"/>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indications" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="HairType" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SkinType" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SkinTone" maxOccurs="5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="Dark"/>
 *               &lt;enumeration value="Fair"/>
 *               &lt;enumeration value="Medium"/>
 *               &lt;enumeration value="MediumDark"/>
 *               &lt;enumeration value="VeryDark"/>
 *               &lt;enumeration value="VeryFair"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaterialType" type="{}LongStringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="Directions" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemForm" type="{}String" minOccurs="0"/>
 *         &lt;element name="Flavor" type="{}String" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{}String" minOccurs="0"/>
 *         &lt;element name="FinishType" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ItemSpecialty" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TargetGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="male"/>
 *               &lt;enumeration value="female"/>
 *               &lt;enumeration value="unisex"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="IsACAdapterIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
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
    "indications",
    "hairType",
    "skinType",
    "skinTone",
    "materialType",
    "directions",
    "warnings",
    "itemForm",
    "flavor",
    "coverage",
    "finishType",
    "itemSpecialty",
    "isAdultProduct",
    "targetGender",
    "powerSource",
    "isACAdapterIncluded",
    "battery"
})
@XmlRootElement(name = "PersonalCareAppliances")
public class PersonalCareAppliances {

    @XmlElement(name = "VariationData")
    protected PersonalCareAppliances.VariationData variationData;
    @XmlElement(name = "Indications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indications;
    @XmlElement(name = "HairType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> hairType;
    @XmlElement(name = "SkinType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> skinType;
    @XmlElement(name = "SkinTone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> skinTone;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> materialType;
    @XmlElement(name = "Directions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String directions;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String warnings;
    @XmlElement(name = "ItemForm")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemForm;
    @XmlElement(name = "Flavor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flavor;
    @XmlElement(name = "Coverage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String coverage;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> finishType;
    @XmlElement(name = "ItemSpecialty")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> itemSpecialty;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "TargetGender")
    protected String targetGender;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerSource;
    @XmlElement(name = "IsACAdapterIncluded")
    protected Boolean isACAdapterIncluded;
    @XmlElement(name = "Battery")
    protected Battery battery;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalCareAppliances.VariationData }
     *     
     */
    public PersonalCareAppliances.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalCareAppliances.VariationData }
     *     
     */
    public void setVariationData(PersonalCareAppliances.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the indications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndications() {
        return indications;
    }

    /**
     * Sets the value of the indications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndications(String value) {
        this.indications = value;
    }

    /**
     * Gets the value of the hairType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hairType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHairType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHairType() {
        if (hairType == null) {
            hairType = new ArrayList<String>();
        }
        return this.hairType;
    }

    /**
     * Gets the value of the skinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSkinType() {
        if (skinType == null) {
            skinType = new ArrayList<String>();
        }
        return this.skinType;
    }

    /**
     * Gets the value of the skinTone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skinTone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkinTone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSkinTone() {
        if (skinTone == null) {
            skinTone = new ArrayList<String>();
        }
        return this.skinTone;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaterialType() {
        if (materialType == null) {
            materialType = new ArrayList<String>();
        }
        return this.materialType;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnings(String value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the itemForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemForm() {
        return itemForm;
    }

    /**
     * Sets the value of the itemForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemForm(String value) {
        this.itemForm = value;
    }

    /**
     * Gets the value of the flavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the value of the flavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavor(String value) {
        this.flavor = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the finishType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finishType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinishType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinishType() {
        if (finishType == null) {
            finishType = new ArrayList<String>();
        }
        return this.finishType;
    }

    /**
     * Gets the value of the itemSpecialty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecialty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecialty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemSpecialty() {
        if (itemSpecialty == null) {
            itemSpecialty = new ArrayList<String>();
        }
        return this.itemSpecialty;
    }

    /**
     * Gets the value of the isAdultProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdultProduct() {
        return isAdultProduct;
    }

    /**
     * Sets the value of the isAdultProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdultProduct(Boolean value) {
        this.isAdultProduct = value;
    }

    /**
     * Gets the value of the targetGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGender() {
        return targetGender;
    }

    /**
     * Sets the value of the targetGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGender(String value) {
        this.targetGender = value;
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
     * Gets the value of the isACAdapterIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsACAdapterIncluded() {
        return isACAdapterIncluded;
    }

    /**
     * Sets the value of the isACAdapterIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsACAdapterIncluded(Boolean value) {
        this.isACAdapterIncluded = value;
    }

    /**
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link Battery }
     *     
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Battery }
     *     
     */
    public void setBattery(Battery value) {
        this.battery = value;
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
     *               &lt;enumeration value="Count"/>
     *               &lt;enumeration value="Size-Color"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element ref="{}ColorMap" minOccurs="0"/>
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
        "variationTheme",
        "size",
        "color",
        "colorMap",
        "count"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String size;
        @XmlElement(name = "Color")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String color;
        @XmlElement(name = "ColorMap")
        protected String colorMap;
        @XmlElement(name = "Count")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger count;

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
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

    }

}
