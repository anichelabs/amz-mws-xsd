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
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClothingType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Gloves"/>
 *               &lt;enumeration value="Jacket"/>
 *               &lt;enumeration value="Pants"/>
 *               &lt;enumeration value="Shirt"/>
 *               &lt;enumeration value="Shoes"/>
 *               &lt;enumeration value="Suit"/>
 *               &lt;enumeration value="Underwear"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Department" type="{}StringNotNull" maxOccurs="10"/>
 *         &lt;element name="StyleKeywords" type="{}LongStringNotNull" maxOccurs="10"/>
 *         &lt;element name="ModelName" type="{}StringNotNull"/>
 *         &lt;element ref="{}ColorSpecification"/>
 *         &lt;element name="Fabric" type="{}LongString" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Material" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="InnerMaterial" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="OuterMaterial" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="SoleMaterial" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="ShoeClosureType" type="{}String" minOccurs="0"/>
 *         &lt;element name="OccasionAndLifestyle" type="{}LongString" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="EventKeywords" type="{}LongString" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumHeightRecommended" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumHeightRecommended" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Size" type="{}String" minOccurs="0"/>
 *         &lt;element name="SizeMap" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="XXXXX-Small"/>
 *               &lt;enumeration value="XXXX-Small"/>
 *               &lt;enumeration value="XXX-Small"/>
 *               &lt;enumeration value="XX-Small"/>
 *               &lt;enumeration value="X-Small"/>
 *               &lt;enumeration value="Small"/>
 *               &lt;enumeration value="Medium"/>
 *               &lt;enumeration value="Large"/>
 *               &lt;enumeration value="X-Large"/>
 *               &lt;enumeration value="XX-Large"/>
 *               &lt;enumeration value="XXX-Large"/>
 *               &lt;enumeration value="XXXX-Large"/>
 *               &lt;enumeration value="XXXXX-Large"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpecialSizeType" type="{}String" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="WaistSize" type="{}ClothingSizeDimension" minOccurs="0"/>
 *         &lt;element name="InseamLength" type="{}ClothingSizeDimension" minOccurs="0"/>
 *         &lt;element name="SleeveLength" type="{}ClothingSizeDimension" minOccurs="0"/>
 *         &lt;element name="NeckSize" type="{}ClothingSizeDimension" minOccurs="0"/>
 *         &lt;element name="ChestSize" type="{}ClothingSizeDimension" minOccurs="0"/>
 *         &lt;element name="CupSize" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="DD"/>
 *               &lt;enumeration value="DDD"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="FF"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="H"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShoeWidth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AAAA"/>
 *               &lt;enumeration value="AAA"/>
 *               &lt;enumeration value="AA"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="EE"/>
 *               &lt;enumeration value="EEE"/>
 *               &lt;enumeration value="EEEE"/>
 *               &lt;enumeration value="EEEEE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HeelHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="HeelType" type="{}String" minOccurs="0"/>
 *         &lt;element name="ShaftHeight" type="{}StringLengthOptionalDimension" minOccurs="0"/>
 *         &lt;element name="BeltLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BeltWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="1500"/>
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
    "clothingType",
    "department",
    "styleKeywords",
    "modelName",
    "colorSpecification",
    "fabric",
    "material",
    "innerMaterial",
    "outerMaterial",
    "soleMaterial",
    "shoeClosureType",
    "occasionAndLifestyle",
    "eventKeywords",
    "styleName",
    "minimumHeightRecommended",
    "maximumHeightRecommended",
    "countryOfOrigin",
    "isAdultProduct",
    "size",
    "sizeMap",
    "specialSizeType",
    "waistSize",
    "inseamLength",
    "sleeveLength",
    "neckSize",
    "chestSize",
    "cupSize",
    "shoeWidth",
    "heelHeight",
    "heelType",
    "shaftHeight",
    "beltLength",
    "beltWidth",
    "itemPackageQuantity",
    "manufacturerWarrantyDescription"
})
@XmlRootElement(name = "RidingApparel")
public class RidingApparel {

    @XmlElement(name = "VariationData")
    protected RidingApparel.VariationData variationData;
    @XmlElement(name = "ClothingType", required = true)
    protected String clothingType;
    @XmlElement(name = "Department", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> department;
    @XmlElement(name = "StyleKeywords", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> styleKeywords;
    @XmlElement(name = "ModelName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modelName;
    @XmlElement(name = "ColorSpecification", required = true)
    protected ColorSpecification colorSpecification;
    @XmlElement(name = "Fabric")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> fabric;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String material;
    @XmlElement(name = "InnerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String innerMaterial;
    @XmlElement(name = "OuterMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String outerMaterial;
    @XmlElement(name = "SoleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String soleMaterial;
    @XmlElement(name = "ShoeClosureType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shoeClosureType;
    @XmlElement(name = "OccasionAndLifestyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> occasionAndLifestyle;
    @XmlElement(name = "EventKeywords")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> eventKeywords;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String styleName;
    @XmlElement(name = "MinimumHeightRecommended")
    protected LengthDimension minimumHeightRecommended;
    @XmlElement(name = "MaximumHeightRecommended")
    protected LengthDimension maximumHeightRecommended;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String size;
    @XmlElement(name = "SizeMap")
    protected String sizeMap;
    @XmlElement(name = "SpecialSizeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> specialSizeType;
    @XmlElement(name = "WaistSize")
    protected ClothingSizeDimension waistSize;
    @XmlElement(name = "InseamLength")
    protected ClothingSizeDimension inseamLength;
    @XmlElement(name = "SleeveLength")
    protected ClothingSizeDimension sleeveLength;
    @XmlElement(name = "NeckSize")
    protected ClothingSizeDimension neckSize;
    @XmlElement(name = "ChestSize")
    protected ClothingSizeDimension chestSize;
    @XmlElement(name = "CupSize")
    protected String cupSize;
    @XmlElement(name = "ShoeWidth")
    protected String shoeWidth;
    @XmlElement(name = "HeelHeight")
    protected LengthDimension heelHeight;
    @XmlElement(name = "HeelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String heelType;
    @XmlElement(name = "ShaftHeight")
    protected StringLengthOptionalDimension shaftHeight;
    @XmlElement(name = "BeltLength")
    protected LengthDimension beltLength;
    @XmlElement(name = "BeltWidth")
    protected LengthDimension beltWidth;
    @XmlElement(name = "ItemPackageQuantity", defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "ManufacturerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerWarrantyDescription;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link RidingApparel.VariationData }
     *     
     */
    public RidingApparel.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RidingApparel.VariationData }
     *     
     */
    public void setVariationData(RidingApparel.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the clothingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingType() {
        return clothingType;
    }

    /**
     * Sets the value of the clothingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingType(String value) {
        this.clothingType = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDepartment() {
        if (department == null) {
            department = new ArrayList<String>();
        }
        return this.department;
    }

    /**
     * Gets the value of the styleKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleKeywords() {
        if (styleKeywords == null) {
            styleKeywords = new ArrayList<String>();
        }
        return this.styleKeywords;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
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
     * Gets the value of the fabric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fabric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFabric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFabric() {
        if (fabric == null) {
            fabric = new ArrayList<String>();
        }
        return this.fabric;
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
     * Gets the value of the innerMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnerMaterial() {
        return innerMaterial;
    }

    /**
     * Sets the value of the innerMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnerMaterial(String value) {
        this.innerMaterial = value;
    }

    /**
     * Gets the value of the outerMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterMaterial() {
        return outerMaterial;
    }

    /**
     * Sets the value of the outerMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterMaterial(String value) {
        this.outerMaterial = value;
    }

    /**
     * Gets the value of the soleMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoleMaterial() {
        return soleMaterial;
    }

    /**
     * Sets the value of the soleMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoleMaterial(String value) {
        this.soleMaterial = value;
    }

    /**
     * Gets the value of the shoeClosureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoeClosureType() {
        return shoeClosureType;
    }

    /**
     * Sets the value of the shoeClosureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoeClosureType(String value) {
        this.shoeClosureType = value;
    }

    /**
     * Gets the value of the occasionAndLifestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occasionAndLifestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccasionAndLifestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOccasionAndLifestyle() {
        if (occasionAndLifestyle == null) {
            occasionAndLifestyle = new ArrayList<String>();
        }
        return this.occasionAndLifestyle;
    }

    /**
     * Gets the value of the eventKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventKeywords() {
        if (eventKeywords == null) {
            eventKeywords = new ArrayList<String>();
        }
        return this.eventKeywords;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * Gets the value of the minimumHeightRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumHeightRecommended() {
        return minimumHeightRecommended;
    }

    /**
     * Sets the value of the minimumHeightRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumHeightRecommended(LengthDimension value) {
        this.minimumHeightRecommended = value;
    }

    /**
     * Gets the value of the maximumHeightRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumHeightRecommended() {
        return maximumHeightRecommended;
    }

    /**
     * Sets the value of the maximumHeightRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumHeightRecommended(LengthDimension value) {
        this.maximumHeightRecommended = value;
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
     * Gets the value of the sizeMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeMap() {
        return sizeMap;
    }

    /**
     * Sets the value of the sizeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeMap(String value) {
        this.sizeMap = value;
    }

    /**
     * Gets the value of the specialSizeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialSizeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialSizeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialSizeType() {
        if (specialSizeType == null) {
            specialSizeType = new ArrayList<String>();
        }
        return this.specialSizeType;
    }

    /**
     * Gets the value of the waistSize property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public ClothingSizeDimension getWaistSize() {
        return waistSize;
    }

    /**
     * Sets the value of the waistSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public void setWaistSize(ClothingSizeDimension value) {
        this.waistSize = value;
    }

    /**
     * Gets the value of the inseamLength property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public ClothingSizeDimension getInseamLength() {
        return inseamLength;
    }

    /**
     * Sets the value of the inseamLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public void setInseamLength(ClothingSizeDimension value) {
        this.inseamLength = value;
    }

    /**
     * Gets the value of the sleeveLength property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public ClothingSizeDimension getSleeveLength() {
        return sleeveLength;
    }

    /**
     * Sets the value of the sleeveLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public void setSleeveLength(ClothingSizeDimension value) {
        this.sleeveLength = value;
    }

    /**
     * Gets the value of the neckSize property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public ClothingSizeDimension getNeckSize() {
        return neckSize;
    }

    /**
     * Sets the value of the neckSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public void setNeckSize(ClothingSizeDimension value) {
        this.neckSize = value;
    }

    /**
     * Gets the value of the chestSize property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public ClothingSizeDimension getChestSize() {
        return chestSize;
    }

    /**
     * Sets the value of the chestSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingSizeDimension }
     *     
     */
    public void setChestSize(ClothingSizeDimension value) {
        this.chestSize = value;
    }

    /**
     * Gets the value of the cupSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupSize() {
        return cupSize;
    }

    /**
     * Sets the value of the cupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupSize(String value) {
        this.cupSize = value;
    }

    /**
     * Gets the value of the shoeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoeWidth() {
        return shoeWidth;
    }

    /**
     * Sets the value of the shoeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoeWidth(String value) {
        this.shoeWidth = value;
    }

    /**
     * Gets the value of the heelHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHeelHeight() {
        return heelHeight;
    }

    /**
     * Sets the value of the heelHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHeelHeight(LengthDimension value) {
        this.heelHeight = value;
    }

    /**
     * Gets the value of the heelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeelType() {
        return heelType;
    }

    /**
     * Sets the value of the heelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeelType(String value) {
        this.heelType = value;
    }

    /**
     * Gets the value of the shaftHeight property.
     * 
     * @return
     *     possible object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public StringLengthOptionalDimension getShaftHeight() {
        return shaftHeight;
    }

    /**
     * Sets the value of the shaftHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public void setShaftHeight(StringLengthOptionalDimension value) {
        this.shaftHeight = value;
    }

    /**
     * Gets the value of the beltLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBeltLength() {
        return beltLength;
    }

    /**
     * Sets the value of the beltLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBeltLength(LengthDimension value) {
        this.beltLength = value;
    }

    /**
     * Gets the value of the beltWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBeltWidth() {
        return beltWidth;
    }

    /**
     * Sets the value of the beltWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBeltWidth(LengthDimension value) {
        this.beltWidth = value;
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
