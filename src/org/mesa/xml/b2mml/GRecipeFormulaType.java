//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 02:11:12 PM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRecipeFormulaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRecipeFormulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessInputs" type="{http://www.mesa.org/xml/B2MML-V0600}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessOutputs" type="{http://www.mesa.org/xml/B2MML-V0600}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessIntermediates" type="{http://www.mesa.org/xml/B2MML-V0600}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessElementParameter" type="{http://www.mesa.org/xml/B2MML-V0600}ProcessElementParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}GRecipeFormula" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRecipeFormulaType", propOrder = {
    "description",
    "processInputs",
    "processOutputs",
    "processIntermediates",
    "processElementParameter"
})
public class GRecipeFormulaType {

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcessInputs")
    protected GRecipeMaterialsType processInputs;
    @XmlElement(name = "ProcessOutputs")
    protected GRecipeMaterialsType processOutputs;
    @XmlElement(name = "ProcessIntermediates")
    protected GRecipeMaterialsType processIntermediates;
    @XmlElement(name = "ProcessElementParameter")
    protected List<ProcessElementParameterType> processElementParameter;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the processInputs property.
     * 
     * @return
     *     possible object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public GRecipeMaterialsType getProcessInputs() {
        return processInputs;
    }

    /**
     * Sets the value of the processInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public void setProcessInputs(GRecipeMaterialsType value) {
        this.processInputs = value;
    }

    /**
     * Gets the value of the processOutputs property.
     * 
     * @return
     *     possible object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public GRecipeMaterialsType getProcessOutputs() {
        return processOutputs;
    }

    /**
     * Sets the value of the processOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public void setProcessOutputs(GRecipeMaterialsType value) {
        this.processOutputs = value;
    }

    /**
     * Gets the value of the processIntermediates property.
     * 
     * @return
     *     possible object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public GRecipeMaterialsType getProcessIntermediates() {
        return processIntermediates;
    }

    /**
     * Sets the value of the processIntermediates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRecipeMaterialsType }
     *     
     */
    public void setProcessIntermediates(GRecipeMaterialsType value) {
        this.processIntermediates = value;
    }

    /**
     * Gets the value of the processElementParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processElementParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessElementParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessElementParameterType }
     * 
     * 
     */
    public List<ProcessElementParameterType> getProcessElementParameter() {
        if (processElementParameter == null) {
            processElementParameter = new ArrayList<ProcessElementParameterType>();
        }
        return this.processElementParameter;
    }

}
