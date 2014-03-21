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
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Scent"/>
 *                         &lt;enumeration value="Size-Scent"/>
 *                         &lt;enumeration value="PatternName"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="SkinType" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SkinTone" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HairType" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Ingredients" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="1500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaterialType" type="{}LongStringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="Indications" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Directions" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemForm" type="{}String" minOccurs="0"/>
 *         &lt;element name="Flavor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{}String" minOccurs="0"/>
 *         &lt;element name="FinishType" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ItemSpecialty" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PatternName" type="{}String" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TargetGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="male"/>
 *               &lt;enumeration value="female"/>
 *               &lt;enumeration value="unisex"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryOfOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
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
    "variationData",
    "count",
    "numberOfItems",
    "displayLength",
    "displayWeight",
    "displayVolume",
    "skinType",
    "skinTone",
    "hairType",
    "ingredients",
    "materialType",
    "indications",
    "directions",
    "warnings",
    "itemForm",
    "flavor",
    "coverage",
    "finishType",
    "itemSpecialty",
    "patternName",
    "isAdultProduct",
    "targetGender",
    "countryOfOrigin"
})
@XmlRootElement(name = "BeautyMisc")
public class BeautyMisc {

    @XmlElement(name = "VariationData")
    protected BeautyMisc.VariationData variationData;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "SkinType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> skinType;
    @XmlElement(name = "SkinTone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> skinTone;
    @XmlElement(name = "HairType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> hairType;
    @XmlElement(name = "Ingredients")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ingredients;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> materialType;
    @XmlElement(name = "Indications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indications;
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
    @XmlElement(name = "PatternName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String patternName;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "TargetGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetGender;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link BeautyMisc.VariationData }
     *     
     */
    public BeautyMisc.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeautyMisc.VariationData }
     *     
     */
    public void setVariationData(BeautyMisc.VariationData value) {
        this.variationData = value;
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
     * Gets the value of the ingredients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredients(String value) {
        this.ingredients = value;
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
     * Gets the value of the patternName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternName() {
        return patternName;
    }

    /**
     * Sets the value of the patternName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternName(String value) {
        this.patternName = value;
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
     *               &lt;enumeration value="Scent"/>
     *               &lt;enumeration value="Size-Scent"/>
     *               &lt;enumeration value="PatternName"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
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
        "scent"
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
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String colorMap;
        @XmlElement(name = "Scent")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String scent;

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
         * Gets the value of the scent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScent() {
            return scent;
        }

        /**
         * Sets the value of the scent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScent(String value) {
            this.scent = value;
        }

    }

}
