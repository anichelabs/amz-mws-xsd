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
 *         &lt;element name="StorageAndPresentationMaterials" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="hanging-bars"/>
 *               &lt;enumeration value="pages-general"/>
 *               &lt;enumeration value="negative-and-unmounted-slides-pages"/>
 *               &lt;enumeration value="mounted-slides-pages"/>
 *               &lt;enumeration value="prints-pages"/>
 *               &lt;enumeration value="other-media-pages"/>
 *               &lt;enumeration value="sleeves-general"/>
 *               &lt;enumeration value="negative-and-unmounted-slides-sleeves"/>
 *               &lt;enumeration value="mounted-slides-sleeves"/>
 *               &lt;enumeration value="prints-sleeves"/>
 *               &lt;enumeration value="other-media-sleeves"/>
 *               &lt;enumeration value="storage-binders-general"/>
 *               &lt;enumeration value="storage-binders-with-rings"/>
 *               &lt;enumeration value="storage-binders-without-rings"/>
 *               &lt;enumeration value="negatives-boxes"/>
 *               &lt;enumeration value="slides-boxes"/>
 *               &lt;enumeration value="prints-boxes"/>
 *               &lt;enumeration value="other-boxes"/>
 *               &lt;enumeration value="portfolios"/>
 *               &lt;enumeration value="presentation-boards"/>
 *               &lt;enumeration value="glassine-envelopes"/>
 *               &lt;enumeration value="kraft-envelopes"/>
 *               &lt;enumeration value="mailers"/>
 *               &lt;enumeration value="professional-photo-albums"/>
 *               &lt;enumeration value="other-professional-albums"/>
 *               &lt;enumeration value="sectional-frames"/>
 *               &lt;enumeration value="digital-frames"/>
 *               &lt;enumeration value="other-professional-frames"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StudioSupplies" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="laminating-machines"/>
 *               &lt;enumeration value="mounting-press"/>
 *               &lt;enumeration value="mat-boards-general"/>
 *               &lt;enumeration value="pre-cut-mat-boards"/>
 *               &lt;enumeration value="heat-activated-boards"/>
 *               &lt;enumeration value="pressure-sensitive-boards"/>
 *               &lt;enumeration value="slide-mounters"/>
 *               &lt;enumeration value="copystands-general"/>
 *               &lt;enumeration value="tabletop-copystands"/>
 *               &lt;enumeration value="instant-copystands"/>
 *               &lt;enumeration value="other-copystands"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhotoBackgrounds" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ceiling-to-floor"/>
 *               &lt;enumeration value="collapsible-discs"/>
 *               &lt;enumeration value="free-standing"/>
 *               &lt;enumeration value="graduated"/>
 *               &lt;enumeration value="wall-mounted"/>
 *               &lt;enumeration value="other-background-styles"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhotoBackgroundAccessories" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="posing-props"/>
 *               &lt;enumeration value="shooting-tables"/>
 *               &lt;enumeration value="shooting-tents"/>
 *               &lt;enumeration value="studio-accessories"/>
 *               &lt;enumeration value="support-equipment"/>
 *               &lt;enumeration value="other-background-accessories"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhotoBackgroundFabrics" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="canvas"/>
 *               &lt;enumeration value="muslins"/>
 *               &lt;enumeration value="seamless-paper"/>
 *               &lt;enumeration value="velour"/>
 *               &lt;enumeration value="other-background-fabrics"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhotoStudioAccessories" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="mounting-corners"/>
 *               &lt;enumeration value="mounting-squares"/>
 *               &lt;enumeration value="photographic-tapes"/>
 *               &lt;enumeration value="wire"/>
 *               &lt;enumeration value="picture-hangers"/>
 *               &lt;enumeration value="mats"/>
 *               &lt;enumeration value="mat-cutters"/>
 *               &lt;enumeration value="trimmers"/>
 *               &lt;enumeration value="replacement-blades"/>
 *               &lt;enumeration value="other-framing-accessories"/>
 *               &lt;enumeration value="mounts-general"/>
 *               &lt;enumeration value="slide-mounts"/>
 *               &lt;enumeration value="other-mounts"/>
 *               &lt;enumeration value="dry-mount-press-accessories"/>
 *               &lt;enumeration value="mounting-adhesives-general"/>
 *               &lt;enumeration value="dry-mount-tissue"/>
 *               &lt;enumeration value="laminating-film"/>
 *               &lt;enumeration value="print-finishing-lacquers"/>
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
    "storageAndPresentationMaterials",
    "studioSupplies",
    "photoBackgrounds",
    "photoBackgroundAccessories",
    "photoBackgroundFabrics",
    "photoStudioAccessories"
})
@XmlRootElement(name = "PhotoStudio")
public class PhotoStudio {

    @XmlElement(name = "StorageAndPresentationMaterials")
    protected String storageAndPresentationMaterials;
    @XmlElement(name = "StudioSupplies")
    protected String studioSupplies;
    @XmlElement(name = "PhotoBackgrounds")
    protected String photoBackgrounds;
    @XmlElement(name = "PhotoBackgroundAccessories")
    protected String photoBackgroundAccessories;
    @XmlElement(name = "PhotoBackgroundFabrics")
    protected String photoBackgroundFabrics;
    @XmlElement(name = "PhotoStudioAccessories")
    protected String photoStudioAccessories;

    /**
     * Gets the value of the storageAndPresentationMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageAndPresentationMaterials() {
        return storageAndPresentationMaterials;
    }

    /**
     * Sets the value of the storageAndPresentationMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageAndPresentationMaterials(String value) {
        this.storageAndPresentationMaterials = value;
    }

    /**
     * Gets the value of the studioSupplies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudioSupplies() {
        return studioSupplies;
    }

    /**
     * Sets the value of the studioSupplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudioSupplies(String value) {
        this.studioSupplies = value;
    }

    /**
     * Gets the value of the photoBackgrounds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoBackgrounds() {
        return photoBackgrounds;
    }

    /**
     * Sets the value of the photoBackgrounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoBackgrounds(String value) {
        this.photoBackgrounds = value;
    }

    /**
     * Gets the value of the photoBackgroundAccessories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoBackgroundAccessories() {
        return photoBackgroundAccessories;
    }

    /**
     * Sets the value of the photoBackgroundAccessories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoBackgroundAccessories(String value) {
        this.photoBackgroundAccessories = value;
    }

    /**
     * Gets the value of the photoBackgroundFabrics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoBackgroundFabrics() {
        return photoBackgroundFabrics;
    }

    /**
     * Sets the value of the photoBackgroundFabrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoBackgroundFabrics(String value) {
        this.photoBackgroundFabrics = value;
    }

    /**
     * Gets the value of the photoStudioAccessories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoStudioAccessories() {
        return photoStudioAccessories;
    }

    /**
     * Sets the value of the photoStudioAccessories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoStudioAccessories(String value) {
        this.photoStudioAccessories = value;
    }

}
