package javax.slee.profile;

import javax.slee.Address;

/**
 * This interface is implemented by profile updated events generated by
 * <code>ProfileMBean</code> objects when a profile is updated.
 * <p>
 * The event type name of profile updated events is
 * "<code>javax.slee.profile.ProfileUpdatedEvent</code>".
 */
public interface ProfileUpdatedEvent {
    /**
     * Get the profile identifier for the profile that was updated.
     * @return the profile identifier for the profile that was updated.
     */
    public ProfileID getProfile();

    /**
     * Get the address of the profile that was updated.  This method is equivalent
     * to {@link ProfileID#toAddress() this.getProfile().toAddress()}.
     * @return the address of the profile that was updated.
     */
    public Address getProfileAddress();

    /**
     * Get the committed state of the profile before it was updated.  The actual type of the
     * return value is the Profile CMP Interface defined by the profile specification
     * of the profile table in which the profile resides, and may be safely typecast
     * using the normal Java typecast mechanism.
     * <p>
     * The object returned from this method is only valid within the event-handler transaction
     * in which the event was delivered to an SBB entity.  The state contained in the
     * object is read-only and cannot be modified.
     * @return the committed state of the profile before it was updated.  This method may
     *        return <code>null</code> in the case where the required profile specification
     *        classes are not available in the classloader of the calling SLEE component,
     *        eg. the SLEE component's deployment descriptor has not defined a reference
     *        to the profile specification of this event's profile table.
     * @deprecated Replaced with {@link #getBeforeUpdateProfileLocal()} ()} which returns an
     *        object implementing the Profile Local Interface rather than the Profile CMP
     *        Interface.
     */
    public Object getBeforeUpdateProfile();

    /**
     * Get the committed state of the profile after it was updated.  The actual type of the
     * return value is the Profile CMP Interface defined by the profile specification
     * of the profile table in which the profile resides, and may be safely typecast
     * using the normal Java typecast mechanism.
     * <p>
     * The object returned from this method is only valid within the event-handler transaction
     * in which the event was delivered to an SBB entity.  The state contained in the
     * object is read-only and cannot be modified.
     * @return the committed state of the profile after it was updated.  This method may
     *        return <code>null</code> in the case where the required profile specification
     *        classes are not available in the classloader of the calling SLEE component,
     *        eg. the SLEE component's deployment descriptor has not defined a reference
     *        to the profile specification of this event's profile table.
     * @deprecated Replaced with {@link #getAfterUpdateProfileLocal()} ()} which returns an 
     *        object implementing the Profile Local Interface rather than the Profile CMP
     *        Interface.
     */
    public Object getAfterUpdateProfile();

    /**
     * Get a profile local object associated with the committed state of the profile
     * before it was updated.  The actual type of the return value is the Profile Local
     * Interface defined by the profile specification of the profile table in which the
     *  profile resides, and may be safely typecast using the normal Java typecast mechanism.
     * <p>
     * The object returned from this method is only valid within the event-handler transaction
     * in which the event was delivered to an SBB entity.  The state accessed via the
     * profile local object is read-only and cannot be modified.
     * @return a profile local object associated with the committed state of the profile
     *        before it was updated.  This method may return <code>null</code> in the case where
     *        the required profile specification classes are not available in the classloader
     *        of the calling SLEE component, eg. the SLEE component's deployment descriptor
     *        has not defined a reference to the profile specification of this event's profile
     *        table.
     * @since SLEE 1.1
     */
    public ProfileLocalObject getBeforeUpdateProfileLocal();

    /**
     * Get a profile local object associated with the committed state of the profile
     * after it was updated.  The actual type of the return value is the Profile Local
     * Interface defined by the profile specification of the profile table in which the
     * profile resides, and may be safely typecast using the normal Java typecast mechanism.
     * <p>
     * The object returned from this method is only valid within the event-handler transaction
     * in which the event was delivered to an SBB entity.  The state accessed via the
     * profile local object is read-only and cannot be modified.
     * @return a profile local object associated with the committed state of the profile
     *        after it was updated.  This method may return <code>null</code> in the case where
     *        the required profile specification classes are not available in the classloader
     *        of the calling SLEE component, eg. the SLEE component's deployment descriptor
     *        has not defined a reference to the profile specification of this event's profile
     *        table.
     * @since SLEE 1.1
     */
    public ProfileLocalObject getAfterUpdateProfileLocal();
}

