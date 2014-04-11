/*
 * MUSES High-Level Object Oriented Model
 * Copyright MUSES project (European Commission FP7) - 2013 
 */
package eu.musesproject.device.musacs;

import eu.musesproject.client.model.decisiontable.Decision;

/**
 * The Class LocalPolicySelector.
 * 
 * @author Sergio Zamarripa (S2)
 * @version 26 sep 2013
 */
public class DecisionMaker {
	
	/**
	 * Info DC
	 * 
	 *  Method to notify the decision maker about an incoming request
	 * 
	 * @param request
	 * 
	 * 
	 * @return 
	 */
	
	public void notifyActionRequest(Request request){

	}	
	
	/**
	 * Info DC
	 * 
	 *  Method to process the decision regarding a request
	 * 
	 * @param request
	 * 
	 * 
	 * @return 
	 */
	
	public void makeDecision(Request request){

	}	
	
	/**
	 * Info DC
	 * 
	 *  Method to push the decision associated to a request, including RiskTreatment and RiskCommunication
	 * 
	 * @param request
	 * 
	 * 
	 * @return Decision
	 */
	
	public Decision pushDecisionToEventHandler(Request request){
		
		return null;

	}	

}
