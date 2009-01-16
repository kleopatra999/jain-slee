//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.16 at 04:56:25 PM WET 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee11.sbb;

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
    "sbbAliasRef",
    "getChildRelationMethodName",
    "defaultPriority"
})
@XmlRootElement(name = "get-child-relation-method")
public class GetChildRelationMethod {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "sbb-alias-ref", required = true)
    protected SbbAliasRef sbbAliasRef;
    @XmlElement(name = "get-child-relation-method-name", required = true)
    protected GetChildRelationMethodName getChildRelationMethodName;
    @XmlElement(name = "default-priority", required = true)
    protected DefaultPriority defaultPriority;

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
     * Gets the value of the sbbAliasRef property.
     * 
     * @return
     *     possible object is
     *     {@link SbbAliasRef }
     *     
     */
    public SbbAliasRef getSbbAliasRef() {
        return sbbAliasRef;
    }

    /**
     * Sets the value of the sbbAliasRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbbAliasRef }
     *     
     */
    public void setSbbAliasRef(SbbAliasRef value) {
        this.sbbAliasRef = value;
    }

    /**
     * Gets the value of the getChildRelationMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link GetChildRelationMethodName }
     *     
     */
    public GetChildRelationMethodName getGetChildRelationMethodName() {
        return getChildRelationMethodName;
    }

    /**
     * Sets the value of the getChildRelationMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChildRelationMethodName }
     *     
     */
    public void setGetChildRelationMethodName(GetChildRelationMethodName value) {
        this.getChildRelationMethodName = value;
    }

    /**
     * Gets the value of the defaultPriority property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultPriority }
     *     
     */
    public DefaultPriority getDefaultPriority() {
        return defaultPriority;
    }

    /**
     * Sets the value of the defaultPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultPriority }
     *     
     */
    public void setDefaultPriority(DefaultPriority value) {
        this.defaultPriority = value;
    }

}
