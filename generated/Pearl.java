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
 *         &lt;element name="PearlType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlMinimumColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlLustre" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlUniformity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlSurfaceMarkingsAndBlemishes" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NacreThickness" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PearlStringingMethod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SizePerPearl" type="{}StringNotNull" minOccurs="0"/>
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
    "pearlType",
    "pearlMinimumColor",
    "pearlLustre",
    "pearlShape",
    "pearlUniformity",
    "pearlSurfaceMarkingsAndBlemishes",
    "nacreThickness",
    "pearlStringingMethod",
    "sizePerPearl"
})
@XmlRootElement(name = "Pearl")
public class Pearl {

    @XmlElement(name = "PearlType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlType;
    @XmlElement(name = "PearlMinimumColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlMinimumColor;
    @XmlElement(name = "PearlLustre")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlLustre;
    @XmlElement(name = "PearlShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlShape;
    @XmlElement(name = "PearlUniformity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlUniformity;
    @XmlElement(name = "PearlSurfaceMarkingsAndBlemishes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlSurfaceMarkingsAndBlemishes;
    @XmlElement(name = "NacreThickness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nacreThickness;
    @XmlElement(name = "PearlStringingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pearlStringingMethod;
    @XmlElement(name = "SizePerPearl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sizePerPearl;

    /**
     * Gets the value of the pearlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlType() {
        return pearlType;
    }

    /**
     * Sets the value of the pearlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlType(String value) {
        this.pearlType = value;
    }

    /**
     * Gets the value of the pearlMinimumColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlMinimumColor() {
        return pearlMinimumColor;
    }

    /**
     * Sets the value of the pearlMinimumColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlMinimumColor(String value) {
        this.pearlMinimumColor = value;
    }

    /**
     * Gets the value of the pearlLustre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlLustre() {
        return pearlLustre;
    }

    /**
     * Sets the value of the pearlLustre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlLustre(String value) {
        this.pearlLustre = value;
    }

    /**
     * Gets the value of the pearlShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlShape() {
        return pearlShape;
    }

    /**
     * Sets the value of the pearlShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlShape(String value) {
        this.pearlShape = value;
    }

    /**
     * Gets the value of the pearlUniformity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlUniformity() {
        return pearlUniformity;
    }

    /**
     * Sets the value of the pearlUniformity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlUniformity(String value) {
        this.pearlUniformity = value;
    }

    /**
     * Gets the value of the pearlSurfaceMarkingsAndBlemishes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlSurfaceMarkingsAndBlemishes() {
        return pearlSurfaceMarkingsAndBlemishes;
    }

    /**
     * Sets the value of the pearlSurfaceMarkingsAndBlemishes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlSurfaceMarkingsAndBlemishes(String value) {
        this.pearlSurfaceMarkingsAndBlemishes = value;
    }

    /**
     * Gets the value of the nacreThickness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacreThickness() {
        return nacreThickness;
    }

    /**
     * Sets the value of the nacreThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacreThickness(String value) {
        this.nacreThickness = value;
    }

    /**
     * Gets the value of the pearlStringingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearlStringingMethod() {
        return pearlStringingMethod;
    }

    /**
     * Sets the value of the pearlStringingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearlStringingMethod(String value) {
        this.pearlStringingMethod = value;
    }

    /**
     * Gets the value of the sizePerPearl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePerPearl() {
        return sizePerPearl;
    }

    /**
     * Sets the value of the sizePerPearl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePerPearl(String value) {
        this.sizePerPearl = value;
    }

}
