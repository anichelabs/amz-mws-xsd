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
 *         &lt;element name="GraphicsCardDescription" type="{}MediumStringNotNull"/>
 *         &lt;element name="GraphicsCardRamSize" type="{}MemorySizeDimension"/>
 *         &lt;element name="GraphicsCardInterface" type="{}TwentyStringNotNull"/>
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
    "graphicsCardDescription",
    "graphicsCardRamSize",
    "graphicsCardInterface"
})
@XmlRootElement(name = "GraphicsCard")
public class GraphicsCard {

    @XmlElement(name = "GraphicsCardDescription", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String graphicsCardDescription;
    @XmlElement(name = "GraphicsCardRamSize", required = true)
    protected MemorySizeDimension graphicsCardRamSize;
    @XmlElement(name = "GraphicsCardInterface", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String graphicsCardInterface;

    /**
     * Gets the value of the graphicsCardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardDescription() {
        return graphicsCardDescription;
    }

    /**
     * Sets the value of the graphicsCardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardDescription(String value) {
        this.graphicsCardDescription = value;
    }

    /**
     * Gets the value of the graphicsCardRamSize property.
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getGraphicsCardRamSize() {
        return graphicsCardRamSize;
    }

    /**
     * Sets the value of the graphicsCardRamSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setGraphicsCardRamSize(MemorySizeDimension value) {
        this.graphicsCardRamSize = value;
    }

    /**
     * Gets the value of the graphicsCardInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardInterface() {
        return graphicsCardInterface;
    }

    /**
     * Sets the value of the graphicsCardInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardInterface(String value) {
        this.graphicsCardInterface = value;
    }

}
