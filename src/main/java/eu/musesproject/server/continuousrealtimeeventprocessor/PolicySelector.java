/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.continuousrealtimeeventprocessor;


import eu.musesproject.server.continuousrealtimeeventprocessor.model.PolicyDT;
import eu.musesproject.server.risktrust.Decision;
import eu.musesproject.server.risktrust.Device;

/**
 * Class PolicySelector
 * 
 * @author Sergio Zamarripa (S2)
 * @version Oct 7, 2013
 */
public class PolicySelector {
	
	
	/**
	 * Info RT
	 * 
	 *  Once the RT2AE makes a decision/s regarding the current request, these decisions (which will be based on a list of 
	 *  permissions and/or actions) must be applied on the device. Hence, the policy selector is in charge of building Decision
	 *   Table modifications/additions to be applied on the device
	 * 
	 * @param decisions

	 * 
	 * @return policyDT
	 */
	
	public PolicyDT computePolicyBasedOnDecisions( Decision[] decisions){
		return null;

	}	
	
	/**
	 * Info RT
	 * 
	 *  Once the policy decision table has been computed, this method applies this policy to the device
	 * 
	 * @param policy
	 * 
	 * @param device
	 * 
	 * @return void
	 */
	
	@SuppressWarnings("unused")
	private void applyPolicyOnDevice( PolicyDT policy, Device device){

	}
	
	

}
