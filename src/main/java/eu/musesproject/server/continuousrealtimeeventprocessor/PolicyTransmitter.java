/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.continuousrealtimeeventprocessor;

import eu.musesproject.server.continuousrealtimeeventprocessor.model.PolicyDT;
import eu.musesproject.server.risktrust.Device;

/**
 * Class PolicyTransmitter
 * 
 * @author Sergio Zamarripa (S2)
 * @version Oct 7, 2013
 */

public class PolicyTransmitter {
	
	
	/**
	 * Info D
	 * 
	 *  Once the policy decision table has been computed, this method sends this policy to the device
	 * 
	 * @param policy
	 * 
	 * @param device
	 * 
	 * @return result of sending the policy
	 */
	
	@SuppressWarnings("unused")
	private Integer sendPolicyDT( PolicyDT policy, Device device){
		return null;
	}

}
