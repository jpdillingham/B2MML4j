//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 02:10:24 PM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelimitedDataBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelimitedDataBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TagDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DelimitedData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelimitedDataBlockType", propOrder = {
    "tagDelimiter",
    "orderDelimiter",
    "delimitedData"
})
public class DelimitedDataBlockType {

    @XmlElement(name = "TagDelimiter", required = true)
    protected String tagDelimiter;
    @XmlElement(name = "OrderDelimiter", required = true)
    protected String orderDelimiter;
    @XmlElement(name = "DelimitedData", required = true)
    protected String delimitedData;

    /**
     * Gets the value of the tagDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagDelimiter() {
        return tagDelimiter;
    }

    /**
     * Sets the value of the tagDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagDelimiter(String value) {
        this.tagDelimiter = value;
    }

    /**
     * Gets the value of the orderDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDelimiter() {
        return orderDelimiter;
    }

    /**
     * Sets the value of the orderDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDelimiter(String value) {
        this.orderDelimiter = value;
    }

    /**
     * Gets the value of the delimitedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimitedData() {
        return delimitedData;
    }

    /**
     * Sets the value of the delimitedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimitedData(String value) {
        this.delimitedData = value;
    }

}
