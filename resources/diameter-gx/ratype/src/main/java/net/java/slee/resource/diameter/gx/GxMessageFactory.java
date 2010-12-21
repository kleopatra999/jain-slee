/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package net.java.slee.resource.diameter.gx;

import net.java.slee.resource.diameter.base.DiameterMessageFactory;
import net.java.slee.resource.diameter.gx.events.GxCreditControlRequest;

/**
 * Used by applications to create Diameter Gx request messages.
 * Gx answer messages can be created using the GxServerSessionActivity.createGxCreditControlAnswer() method.
 *
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author <a href="mailto:carl-magnus.bjorkell@emblacom.com"> Carl-Magnus Björkell </a>
 */
public interface GxMessageFactory {

    public static final long _GX_TGPP_VENDOR_ID = 10415L;
    public static final int _GX_AUTH_APP_ID = 16777224;

    /**
     * Creates a Credit Control Request message.
     * @return
     */
    public GxCreditControlRequest createGxCreditControlRequest();

    /**
     * Creates a Credit Control Request message with the Session-Id AVP populated with the sessionId parameter.
     * @param sessionId
     * @return
     */
    public GxCreditControlRequest createGxCreditControlRequest(String sessionId);

    /**
     * @return Base Diameter message factory
     */
    public DiameterMessageFactory getBaseMessageFactory();
}