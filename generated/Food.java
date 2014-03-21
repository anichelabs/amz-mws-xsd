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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *                         &lt;enumeration value="Flavor"/>
 *                         &lt;enumeration value="Flavor-Size"/>
 *                         &lt;enumeration value="PatternName"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Flavor" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="PatternName" type="{}HundredString" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryProducedIn" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="RegionOfOrigin" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Prefecture" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemForm" type="{}String" minOccurs="0"/>
 *         &lt;element name="Ingredients" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="NutritionalFacts" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="KosherCertification" type="{}HundredString" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="OrganicCertification" type="{}HundredString" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TokuhoCertification" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ItemSpecialty" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CaffeineContent" type="{}String" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="IsPerishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StorageInstructions" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="Directions" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Occasion" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="AwardsWon" type="{}HundredString" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="AgeRangeDescription" type="{}String" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="ContainerType" type="{}String" minOccurs="0"/>
 *         &lt;element name="UnitCount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}StringNotNull" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
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
    "countryProducedIn",
    "regionOfOrigin",
    "prefecture",
    "itemForm",
    "ingredients",
    "nutritionalFacts",
    "kosherCertification",
    "organicCertification",
    "tokuhoCertification",
    "itemSpecialty",
    "caffeineContent",
    "warnings",
    "isPerishable",
    "storageInstructions",
    "directions",
    "occasion",
    "awardsWon",
    "ageRangeDescription",
    "itemPackageQuantity",
    "numberOfItems",
    "displayLength",
    "displayWeight",
    "displayVolume",
    "containerType",
    "unitCount"
})
@XmlRootElement(name = "Food")
public class Food {

    @XmlElement(name = "VariationData")
    protected Food.VariationData variationData;
    @XmlElement(name = "CountryProducedIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String countryProducedIn;
    @XmlElement(name = "RegionOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String regionOfOrigin;
    @XmlElement(name = "Prefecture")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefecture;
    @XmlElement(name = "ItemForm")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemForm;
    @XmlElement(name = "Ingredients")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ingredients;
    @XmlElement(name = "NutritionalFacts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nutritionalFacts;
    @XmlElement(name = "KosherCertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> kosherCertification;
    @XmlElement(name = "OrganicCertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> organicCertification;
    @XmlElement(name = "TokuhoCertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> tokuhoCertification;
    @XmlElement(name = "ItemSpecialty")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> itemSpecialty;
    @XmlElement(name = "CaffeineContent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String caffeineContent;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String warnings;
    @XmlElement(name = "IsPerishable")
    protected Boolean isPerishable;
    @XmlElement(name = "StorageInstructions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String storageInstructions;
    @XmlElement(name = "Directions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String directions;
    @XmlElement(name = "Occasion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String occasion;
    @XmlElement(name = "AwardsWon")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> awardsWon;
    @XmlElement(name = "AgeRangeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ageRangeDescription;
    @XmlElement(name = "ItemPackageQuantity")
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
    @XmlElement(name = "ContainerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String containerType;
    @XmlElement(name = "UnitCount")
    protected Food.UnitCount unitCount;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link Food.VariationData }
     *     
     */
    public Food.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Food.VariationData }
     *     
     */
    public void setVariationData(Food.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the countryProducedIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryProducedIn() {
        return countryProducedIn;
    }

    /**
     * Sets the value of the countryProducedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryProducedIn(String value) {
        this.countryProducedIn = value;
    }

    /**
     * Gets the value of the regionOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    /**
     * Sets the value of the regionOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionOfOrigin(String value) {
        this.regionOfOrigin = value;
    }

    /**
     * Gets the value of the prefecture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefecture() {
        return prefecture;
    }

    /**
     * Sets the value of the prefecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefecture(String value) {
        this.prefecture = value;
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
     * Gets the value of the nutritionalFacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalFacts() {
        return nutritionalFacts;
    }

    /**
     * Sets the value of the nutritionalFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalFacts(String value) {
        this.nutritionalFacts = value;
    }

    /**
     * Gets the value of the kosherCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kosherCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKosherCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKosherCertification() {
        if (kosherCertification == null) {
            kosherCertification = new ArrayList<String>();
        }
        return this.kosherCertification;
    }

    /**
     * Gets the value of the organicCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organicCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganicCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganicCertification() {
        if (organicCertification == null) {
            organicCertification = new ArrayList<String>();
        }
        return this.organicCertification;
    }

    /**
     * Gets the value of the tokuhoCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokuhoCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokuhoCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTokuhoCertification() {
        if (tokuhoCertification == null) {
            tokuhoCertification = new ArrayList<String>();
        }
        return this.tokuhoCertification;
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
     * Gets the value of the caffeineContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaffeineContent() {
        return caffeineContent;
    }

    /**
     * Sets the value of the caffeineContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaffeineContent(String value) {
        this.caffeineContent = value;
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
     * Gets the value of the isPerishable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerishable() {
        return isPerishable;
    }

    /**
     * Sets the value of the isPerishable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerishable(Boolean value) {
        this.isPerishable = value;
    }

    /**
     * Gets the value of the storageInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageInstructions() {
        return storageInstructions;
    }

    /**
     * Sets the value of the storageInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageInstructions(String value) {
        this.storageInstructions = value;
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
     * Gets the value of the occasion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccasion() {
        return occasion;
    }

    /**
     * Sets the value of the occasion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasion(String value) {
        this.occasion = value;
    }

    /**
     * Gets the value of the awardsWon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardsWon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardsWon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAwardsWon() {
        if (awardsWon == null) {
            awardsWon = new ArrayList<String>();
        }
        return this.awardsWon;
    }

    /**
     * Gets the value of the ageRangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeRangeDescription() {
        return ageRangeDescription;
    }

    /**
     * Sets the value of the ageRangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeRangeDescription(String value) {
        this.ageRangeDescription = value;
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
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the unitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Food.UnitCount }
     *     
     */
    public Food.UnitCount getUnitCount() {
        return unitCount;
    }

    /**
     * Sets the value of the unitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Food.UnitCount }
     *     
     */
    public void setUnitCount(Food.UnitCount value) {
        this.unitCount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}StringNotNull" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnitCount {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String unitOfMeasure;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

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
     *               &lt;enumeration value="Flavor"/>
     *               &lt;enumeration value="Flavor-Size"/>
     *               &lt;enumeration value="PatternName"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Flavor" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="PatternName" type="{}HundredString" minOccurs="0"/>
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
        "flavor",
        "patternName"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String size;
        @XmlElement(name = "Flavor")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String flavor;
        @XmlElement(name = "PatternName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String patternName;

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

    }

}
