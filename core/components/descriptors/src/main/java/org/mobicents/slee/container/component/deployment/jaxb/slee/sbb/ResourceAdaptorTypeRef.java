//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.17 at 04:44:01 PM WET 
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
    "resourceAdaptorTypeName",
    "resourceAdaptorTypeVendor",
    "resourceAdaptorTypeVersion"
})
@XmlRootElement(name = "resource-adaptor-type-ref")
public class ResourceAdaptorTypeRef {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "resource-adaptor-type-name", required = true)
    protected ResourceAdaptorTypeName resourceAdaptorTypeName;
    @XmlElement(name = "resource-adaptor-type-vendor", required = true)
    protected ResourceAdaptorTypeVendor resourceAdaptorTypeVendor;
    @XmlElement(name = "resource-adaptor-type-version", required = true)
    protected ResourceAdaptorTypeVersion resourceAdaptorTypeVersion;

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
     * Gets the value of the resourceAdaptorTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorTypeName }
     *     
     */
    public ResourceAdaptorTypeName getResourceAdaptorTypeName() {
        return resourceAdaptorTypeName;
    }

    /**
     * Sets the value of the resourceAdaptorTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorTypeName }
     *     
     */
    public void setResourceAdaptorTypeName(ResourceAdaptorTypeName value) {
        this.resourceAdaptorTypeName = value;
    }

    /**
     * Gets the value of the resourceAdaptorTypeVendor property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorTypeVendor }
     *     
     */
    public ResourceAdaptorTypeVendor getResourceAdaptorTypeVendor() {
        return resourceAdaptorTypeVendor;
    }

    /**
     * Sets the value of the resourceAdaptorTypeVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorTypeVendor }
     *     
     */
    public void setResourceAdaptorTypeVendor(ResourceAdaptorTypeVendor value) {
        this.resourceAdaptorTypeVendor = value;
    }

    /**
     * Gets the value of the resourceAdaptorTypeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorTypeVersion }
     *     
     */
    public ResourceAdaptorTypeVersion getResourceAdaptorTypeVersion() {
        return resourceAdaptorTypeVersion;
    }

    /**
     * Sets the value of the resourceAdaptorTypeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorTypeVersion }
     *     
     */
    public void setResourceAdaptorTypeVersion(ResourceAdaptorTypeVersion value) {
        this.resourceAdaptorTypeVersion = value;
    }

}
