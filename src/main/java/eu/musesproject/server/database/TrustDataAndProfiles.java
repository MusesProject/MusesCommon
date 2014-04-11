/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.database;

import eu.musesproject.server.risktrust.Device;
import eu.musesproject.server.risktrust.TrustValue;
import eu.musesproject.server.risktrust.User;

/**
 * The Class TrustDataAndProfiles.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class TrustDataAndProfiles {

	/**
	 * Gets the device trust value.
	 * 
	 * @param device
	 *            the device
	 * @return the device trust value
	 */
	public TrustValue getDeviceTrustValue(Device device) {

		return null;
	}

	/**
	 * Sets the device trust value.
	 * 
	 * @param device
	 *            the device
	 * @param trustValue
	 *            the trust value
	 */
	public void setDeviceTrustValue(Device device, TrustValue trustValue) {

	}

	/**
	 * Gets the user trust value.
	 * 
	 * @param user
	 *            the user
	 * @return the user trust value
	 */
	public TrustValue getUserTrustValue(User user) {
		return null;
	}

	/**
	 * Sets the user trust value.
	 * 
	 * @param user
	 *            the user
	 * @param trustValue
	 *            the trust value
	 */
	public void setUserTrustValue(User user, TrustValue trustValue) {
	}

}
