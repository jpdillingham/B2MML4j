//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 02:10:24 PM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonnelIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonnelIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelIdentificationManifest" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelIdentificationManifestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonnelIdentificationType", propOrder = {
    "personnelIdentificationManifest"
})
public class PersonnelIdentificationType {

    @XmlElement(name = "PersonnelIdentificationManifest")
    protected List<PersonnelIdentificationManifestType> personnelIdentificationManifest;

    /**
     * Gets the value of the personnelIdentificationManifest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelIdentificationManifest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelIdentificationManifest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelIdentificationManifestType }
     * 
     * 
     */
    public List<PersonnelIdentificationManifestType> getPersonnelIdentificationManifest() {
        if (personnelIdentificationManifest == null) {
            personnelIdentificationManifest = new ArrayList<PersonnelIdentificationManifestType>();
        }
        return this.personnelIdentificationManifest;
    }

}
