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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element name="HasGreyScale" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxInputSheetCapacity" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionBlackWhite" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxPrintSpeedBlackWhite" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxPrintSpeedColor" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxScanningSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinScanningSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterMediaSizeMaximum" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterOutputType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}PrinterWirelessType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}PrintingMediaType" minOccurs="0"/>
 *         &lt;element name="PrintingTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScanRate" type="{}HundredFiftyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ScannerResolution" type="{}StringNotNull" minOccurs="0"/>
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
    "hasGreyScale",
    "lightSourceType",
    "maxInputSheetCapacity",
    "maxPrintResolutionBlackWhite",
    "maxPrintResolutionColor",
    "maxPrintSpeedBlackWhite",
    "maxPrintSpeedColor",
    "maxScanningSize",
    "minScanningSize",
    "printerMediaSizeMaximum",
    "printerOutputType",
    "printerWirelessType",
    "printingMediaType",
    "printingTechnology",
    "scanRate",
    "scannerResolution"
})
@XmlRootElement(name = "Printer")
public class Printer {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "HasGreyScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hasGreyScale;
    @XmlElement(name = "LightSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lightSourceType;
    @XmlElement(name = "MaxInputSheetCapacity")
    protected BigInteger maxInputSheetCapacity;
    @XmlElement(name = "MaxPrintResolutionBlackWhite")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxPrintResolutionBlackWhite;
    @XmlElement(name = "MaxPrintResolutionColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxPrintResolutionColor;
    @XmlElement(name = "MaxPrintSpeedBlackWhite")
    protected BigInteger maxPrintSpeedBlackWhite;
    @XmlElement(name = "MaxPrintSpeedColor")
    protected BigInteger maxPrintSpeedColor;
    @XmlElement(name = "MaxScanningSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxScanningSize;
    @XmlElement(name = "MinScanningSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String minScanningSize;
    @XmlElement(name = "PrinterMediaSizeMaximum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String printerMediaSizeMaximum;
    @XmlElement(name = "PrinterOutputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String printerOutputType;
    @XmlElement(name = "PrinterWirelessType")
    protected List<String> printerWirelessType;
    @XmlElement(name = "PrintingMediaType")
    protected PrintingMediaTypeValues printingMediaType;
    @XmlElement(name = "PrintingTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String printingTechnology;
    @XmlElement(name = "ScanRate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scanRate;
    @XmlElement(name = "ScannerResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scannerResolution;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link VariationData }
     *     
     */
    public VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationData }
     *     
     */
    public void setVariationData(VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the hasGreyScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGreyScale() {
        return hasGreyScale;
    }

    /**
     * Sets the value of the hasGreyScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGreyScale(String value) {
        this.hasGreyScale = value;
    }

    /**
     * Gets the value of the lightSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightSourceType() {
        return lightSourceType;
    }

    /**
     * Sets the value of the lightSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightSourceType(String value) {
        this.lightSourceType = value;
    }

    /**
     * Gets the value of the maxInputSheetCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxInputSheetCapacity() {
        return maxInputSheetCapacity;
    }

    /**
     * Sets the value of the maxInputSheetCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxInputSheetCapacity(BigInteger value) {
        this.maxInputSheetCapacity = value;
    }

    /**
     * Gets the value of the maxPrintResolutionBlackWhite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintResolutionBlackWhite() {
        return maxPrintResolutionBlackWhite;
    }

    /**
     * Sets the value of the maxPrintResolutionBlackWhite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintResolutionBlackWhite(String value) {
        this.maxPrintResolutionBlackWhite = value;
    }

    /**
     * Gets the value of the maxPrintResolutionColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintResolutionColor() {
        return maxPrintResolutionColor;
    }

    /**
     * Sets the value of the maxPrintResolutionColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintResolutionColor(String value) {
        this.maxPrintResolutionColor = value;
    }

    /**
     * Gets the value of the maxPrintSpeedBlackWhite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPrintSpeedBlackWhite() {
        return maxPrintSpeedBlackWhite;
    }

    /**
     * Sets the value of the maxPrintSpeedBlackWhite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPrintSpeedBlackWhite(BigInteger value) {
        this.maxPrintSpeedBlackWhite = value;
    }

    /**
     * Gets the value of the maxPrintSpeedColor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPrintSpeedColor() {
        return maxPrintSpeedColor;
    }

    /**
     * Sets the value of the maxPrintSpeedColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPrintSpeedColor(BigInteger value) {
        this.maxPrintSpeedColor = value;
    }

    /**
     * Gets the value of the maxScanningSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxScanningSize() {
        return maxScanningSize;
    }

    /**
     * Sets the value of the maxScanningSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxScanningSize(String value) {
        this.maxScanningSize = value;
    }

    /**
     * Gets the value of the minScanningSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinScanningSize() {
        return minScanningSize;
    }

    /**
     * Sets the value of the minScanningSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinScanningSize(String value) {
        this.minScanningSize = value;
    }

    /**
     * Gets the value of the printerMediaSizeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterMediaSizeMaximum() {
        return printerMediaSizeMaximum;
    }

    /**
     * Sets the value of the printerMediaSizeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterMediaSizeMaximum(String value) {
        this.printerMediaSizeMaximum = value;
    }

    /**
     * Gets the value of the printerOutputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterOutputType() {
        return printerOutputType;
    }

    /**
     * Sets the value of the printerOutputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterOutputType(String value) {
        this.printerOutputType = value;
    }

    /**
     * Gets the value of the printerWirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printerWirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrinterWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrinterWirelessType() {
        if (printerWirelessType == null) {
            printerWirelessType = new ArrayList<String>();
        }
        return this.printerWirelessType;
    }

    /**
     * Gets the value of the printingMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link PrintingMediaTypeValues }
     *     
     */
    public PrintingMediaTypeValues getPrintingMediaType() {
        return printingMediaType;
    }

    /**
     * Sets the value of the printingMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingMediaTypeValues }
     *     
     */
    public void setPrintingMediaType(PrintingMediaTypeValues value) {
        this.printingMediaType = value;
    }

    /**
     * Gets the value of the printingTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingTechnology() {
        return printingTechnology;
    }

    /**
     * Sets the value of the printingTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingTechnology(String value) {
        this.printingTechnology = value;
    }

    /**
     * Gets the value of the scanRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanRate() {
        return scanRate;
    }

    /**
     * Sets the value of the scanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanRate(String value) {
        this.scanRate = value;
    }

    /**
     * Gets the value of the scannerResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerResolution() {
        return scannerResolution;
    }

    /**
     * Sets the value of the scannerResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerResolution(String value) {
        this.scannerResolution = value;
    }

}
