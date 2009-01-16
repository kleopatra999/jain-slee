//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.16 at 04:56:26 PM WET 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee.sbb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "resourceAdaptorObjectName",
    "resourceAdaptorEntityLink"
})
@XmlRootElement(name = "resource-adaptor-entity-binding")
public class ResourceAdaptorEntityBinding {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "resource-adaptor-object-name", required = true)
    protected ResourceAdaptorObjectName resourceAdaptorObjectName;
    @XmlElement(name = "resource-adaptor-entity-link")
    protected ResourceAdaptorEntityLink resourceAdaptorEntityLink;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the resourceAdaptorObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorObjectName }
     *     
     */
    public ResourceAdaptorObjectName getResourceAdaptorObjectName() {
        return resourceAdaptorObjectName;
    }

    /**
     * Sets the value of the resourceAdaptorObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorObjectName }
     *     
     */
    public void setResourceAdaptorObjectName(ResourceAdaptorObjectName value) {
        this.resourceAdaptorObjectName = value;
    }

    /**
     * Gets the value of the resourceAdaptorEntityLink property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorEntityLink }
     *     
     */
    public ResourceAdaptorEntityLink getResourceAdaptorEntityLink() {
        return resourceAdaptorEntityLink;
    }

    /**
     * Sets the value of the resourceAdaptorEntityLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorEntityLink }
     *     
     */
    public void setResourceAdaptorEntityLink(ResourceAdaptorEntityLink value) {
        this.resourceAdaptorEntityLink = value;
    }

}
