package org.telestax.slee.container.build.as7.extension;

import java.util.HashMap;
import java.util.Map;

enum Element {

    REMOTE_RMI_ADDRESS(SleeSubsystemDefinition.REMOTE_RMI_ADDRESS.getXmlName()),
    REMOTE_RMI_PORT(SleeSubsystemDefinition.REMOTE_RMI_PORT.getXmlName()),
    PROFILES_PERSIST_PROFILES(SleeSubsystemDefinition.PROFILES_PERSIST_PROFILES.getXmlName()),
    PROFILES_CLUSTERED_PROFILES(SleeSubsystemDefinition.PROFILES_CLUSTERED_PROFILES.getXmlName()),
    PROFILES_HIBERNATE_DATASOURCE(SleeSubsystemDefinition.PROFILES_HIBERNATE_DATASOURCE.getXmlName()),
    PROFILES_HIBERNATE_DIALECT(SleeSubsystemDefinition.PROFILES_HIBERNATE_DIALECT.getXmlName()),
    UNKNOWN(null);

    private final String name;

    Element(final String name) {
        this.name = name;
    }

    /**
     * Get the local name of this element.
     *
     * @return the local name
     */
    public String getLocalName() {
        return name;
    }

    private static final Map<String, Element> MAP;

    static {
        final Map<String, Element> map = new HashMap<String, Element>();
        for (Element element : values()) {
            final String name = element.getLocalName();
            if (name != null) map.put(name, element);
        }
        MAP = map;
    }

    public static Element forName(String localName) {
        final Element element = MAP.get(localName);
        return element == null ? UNKNOWN : element;
    }
}
