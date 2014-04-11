/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server;

import eu.musesproject.server.continuousrealtimeeventprocessor.model.Event;

/**
 * Class UserContextEventDataReceiver
 * 
 * @author Sergio Zamarripa (S2)
 * @version Oct 7, 2013
 */

public class UserContextEventDataReceiver {
	
	
	/**
	 * Info M
	 * 
	 *  Regarding events to be stored, these will be stored based on several criteria, for example, in order to compute 
	 *  user trust, we should store any event associated to a user action (Event objects whose instance type is UserEvent).
	 *  This method will be in charge of classifying the concrete databases where the event must be stored 
	 * 
	 * @param event
	 * 
	 * 
	 * @return void
	 */
	
	public void storeEvent( Event event){

	}	

}
