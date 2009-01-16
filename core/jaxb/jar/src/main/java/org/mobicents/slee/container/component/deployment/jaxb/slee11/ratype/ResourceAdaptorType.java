//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.16 at 04:56:25 PM WET 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee11.ratype;

import java.util.ArrayList;
import java.util.List;
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
    "resourceAdaptorTypeName",
    "resourceAdaptorTypeVendor",
    "resourceAdaptorTypeVersion",
    "libraryRef",
    "resourceAdaptorTypeClasses",
    "eventTypeRef"
})
@XmlRootElement(name = "resource-adaptor-type")
public class ResourceAdaptorType {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "resource-adaptor-type-name", required = true)
    protected ResourceAdaptorTypeName resourceAdaptorTypeName;
    @XmlElement(name = "resource-adaptor-type-vendor", required = true)
    protected ResourceAdaptorTypeVendor resourceAdaptorTypeVendor;
    @XmlElement(name = "resource-adaptor-type-version", required = true)
    protected ResourceAdaptorTypeVersion resourceAdaptorTypeVersion;
    @XmlElement(name = "library-ref")
    protected List<LibraryRef> libraryRef;
    @XmlElement(name = "resource-adaptor-type-classes", required = true)
    protected ResourceAdaptorTypeClasses resourceAdaptorTypeClasses;
    @XmlElement(name = "event-type-ref")
    protected List<EventTypeRef> eventTypeRef;

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

    /**
     * Gets the value of the libraryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryRef }
     * 
     * 
     */
    public List<LibraryRef> getLibraryRef() {
        if (libraryRef == null) {
            libraryRef = new ArrayList<LibraryRef>();
        }
        return this.libraryRef;
    }

    /**
     * Gets the value of the resourceAdaptorTypeClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAdaptorTypeClasses }
     *     
     */
    public ResourceAdaptorTypeClasses getResourceAdaptorTypeClasses() {
        return resourceAdaptorTypeClasses;
    }

    /**
     * Sets the value of the resourceAdaptorTypeClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAdaptorTypeClasses }
     *     
     */
    public void setResourceAdaptorTypeClasses(ResourceAdaptorTypeClasses value) {
        this.resourceAdaptorTypeClasses = value;
    }

    /**
     * Gets the value of the eventTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeRef }
     * 
     * 
     */
    public List<EventTypeRef> getEventTypeRef() {
        if (eventTypeRef == null) {
            eventTypeRef = new ArrayList<EventTypeRef>();
        }
        return this.eventTypeRef;
    }

}
