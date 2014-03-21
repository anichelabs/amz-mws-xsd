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
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}BrassAndWoodwindInstruments"/>
 *                   &lt;element ref="{}Guitars"/>
 *                   &lt;element ref="{}InstrumentPartsAndAccessories"/>
 *                   &lt;element ref="{}KeyboardInstruments"/>
 *                   &lt;element ref="{}MiscWorldInstruments"/>
 *                   &lt;element ref="{}PercussionInstruments"/>
 *                   &lt;element ref="{}SoundAndRecordingEquipment"/>
 *                   &lt;element ref="{}StringedInstruments"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
    "productType"
})
@XmlRootElement(name = "MusicalInstruments")
public class MusicalInstruments {

    @XmlElement(name = "ProductType", required = true)
    protected MusicalInstruments.ProductType productType;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link MusicalInstruments.ProductType }
     *     
     */
    public MusicalInstruments.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MusicalInstruments.ProductType }
     *     
     */
    public void setProductType(MusicalInstruments.ProductType value) {
        this.productType = value;
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
     *       &lt;choice>
     *         &lt;element ref="{}BrassAndWoodwindInstruments"/>
     *         &lt;element ref="{}Guitars"/>
     *         &lt;element ref="{}InstrumentPartsAndAccessories"/>
     *         &lt;element ref="{}KeyboardInstruments"/>
     *         &lt;element ref="{}MiscWorldInstruments"/>
     *         &lt;element ref="{}PercussionInstruments"/>
     *         &lt;element ref="{}SoundAndRecordingEquipment"/>
     *         &lt;element ref="{}StringedInstruments"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "brassAndWoodwindInstruments",
        "guitars",
        "instrumentPartsAndAccessories",
        "keyboardInstruments",
        "miscWorldInstruments",
        "percussionInstruments",
        "soundAndRecordingEquipment",
        "stringedInstruments"
    })
    public static class ProductType {

        @XmlElement(name = "BrassAndWoodwindInstruments")
        protected BrassAndWoodwindInstruments brassAndWoodwindInstruments;
        @XmlElement(name = "Guitars")
        protected Guitars guitars;
        @XmlElement(name = "InstrumentPartsAndAccessories")
        protected InstrumentPartsAndAccessories instrumentPartsAndAccessories;
        @XmlElement(name = "KeyboardInstruments")
        protected KeyboardInstruments keyboardInstruments;
        @XmlElement(name = "MiscWorldInstruments")
        protected MiscWorldInstruments miscWorldInstruments;
        @XmlElement(name = "PercussionInstruments")
        protected PercussionInstruments percussionInstruments;
        @XmlElement(name = "SoundAndRecordingEquipment")
        protected SoundAndRecordingEquipment soundAndRecordingEquipment;
        @XmlElement(name = "StringedInstruments")
        protected StringedInstruments stringedInstruments;

        /**
         * Gets the value of the brassAndWoodwindInstruments property.
         * 
         * @return
         *     possible object is
         *     {@link BrassAndWoodwindInstruments }
         *     
         */
        public BrassAndWoodwindInstruments getBrassAndWoodwindInstruments() {
            return brassAndWoodwindInstruments;
        }

        /**
         * Sets the value of the brassAndWoodwindInstruments property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrassAndWoodwindInstruments }
         *     
         */
        public void setBrassAndWoodwindInstruments(BrassAndWoodwindInstruments value) {
            this.brassAndWoodwindInstruments = value;
        }

        /**
         * Gets the value of the guitars property.
         * 
         * @return
         *     possible object is
         *     {@link Guitars }
         *     
         */
        public Guitars getGuitars() {
            return guitars;
        }

        /**
         * Sets the value of the guitars property.
         * 
         * @param value
         *     allowed object is
         *     {@link Guitars }
         *     
         */
        public void setGuitars(Guitars value) {
            this.guitars = value;
        }

        /**
         * Gets the value of the instrumentPartsAndAccessories property.
         * 
         * @return
         *     possible object is
         *     {@link InstrumentPartsAndAccessories }
         *     
         */
        public InstrumentPartsAndAccessories getInstrumentPartsAndAccessories() {
            return instrumentPartsAndAccessories;
        }

        /**
         * Sets the value of the instrumentPartsAndAccessories property.
         * 
         * @param value
         *     allowed object is
         *     {@link InstrumentPartsAndAccessories }
         *     
         */
        public void setInstrumentPartsAndAccessories(InstrumentPartsAndAccessories value) {
            this.instrumentPartsAndAccessories = value;
        }

        /**
         * Gets the value of the keyboardInstruments property.
         * 
         * @return
         *     possible object is
         *     {@link KeyboardInstruments }
         *     
         */
        public KeyboardInstruments getKeyboardInstruments() {
            return keyboardInstruments;
        }

        /**
         * Sets the value of the keyboardInstruments property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyboardInstruments }
         *     
         */
        public void setKeyboardInstruments(KeyboardInstruments value) {
            this.keyboardInstruments = value;
        }

        /**
         * Gets the value of the miscWorldInstruments property.
         * 
         * @return
         *     possible object is
         *     {@link MiscWorldInstruments }
         *     
         */
        public MiscWorldInstruments getMiscWorldInstruments() {
            return miscWorldInstruments;
        }

        /**
         * Sets the value of the miscWorldInstruments property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscWorldInstruments }
         *     
         */
        public void setMiscWorldInstruments(MiscWorldInstruments value) {
            this.miscWorldInstruments = value;
        }

        /**
         * Gets the value of the percussionInstruments property.
         * 
         * @return
         *     possible object is
         *     {@link PercussionInstruments }
         *     
         */
        public PercussionInstruments getPercussionInstruments() {
            return percussionInstruments;
        }

        /**
         * Sets the value of the percussionInstruments property.
         * 
         * @param value
         *     allowed object is
         *     {@link PercussionInstruments }
         *     
         */
        public void setPercussionInstruments(PercussionInstruments value) {
            this.percussionInstruments = value;
        }

        /**
         * Gets the value of the soundAndRecordingEquipment property.
         * 
         * @return
         *     possible object is
         *     {@link SoundAndRecordingEquipment }
         *     
         */
        public SoundAndRecordingEquipment getSoundAndRecordingEquipment() {
            return soundAndRecordingEquipment;
        }

        /**
         * Sets the value of the soundAndRecordingEquipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link SoundAndRecordingEquipment }
         *     
         */
        public void setSoundAndRecordingEquipment(SoundAndRecordingEquipment value) {
            this.soundAndRecordingEquipment = value;
        }

        /**
         * Gets the value of the stringedInstruments property.
         * 
         * @return
         *     possible object is
         *     {@link StringedInstruments }
         *     
         */
        public StringedInstruments getStringedInstruments() {
            return stringedInstruments;
        }

        /**
         * Sets the value of the stringedInstruments property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringedInstruments }
         *     
         */
        public void setStringedInstruments(StringedInstruments value) {
            this.stringedInstruments = value;
        }

    }

}
