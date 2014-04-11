/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */

/**
 * The Class IMusesCorrelationService.
 * 
 * @author Sergio Zamarripa (S2)
 * @version 26 sep 2013
 */
package eu.musesproject.server.continuousrealtimeeventprocessor;

import eu.musesproject.server.continuousrealtimeeventprocessor.model.Event;
import eu.musesproject.server.risktrust.Device;


/**
 * Interface IMusesCorrelationService
 * 
 * @author Sergio Zamarripa (S2)
 * @version Sep 24, 2013
 */


public interface IMusesCorrelationService{
	
	
	/**
	 * Info M
	 * 
	 *  Send event to process. This method is called from the MusUCEDR whenever an event arrives, coming from a concrete device, in order to be processed.
	 * 
	 * @param Event
	 * 
	 * @param Device
	 * 
	 * @return void
	 */
	
	public abstract void sendEventToProcess(Event event, Device device);
	
	/**
	 * Info M
	 * 
	 *  Private method called by sendEventToProcess, in order to insert incoming events in the working memory, to be correlated against the rules
	 * 
	 * @param Event
	 * 
	 * @return void
	 */
	
	abstract void insertEventInWorkingMemory(Event event);
	
	/**
	 * Info M
	 * 
	 *  Private method called by sendEventToProcess, in order to insert device information in the working memory, to complement information associated with the rules
	 * 
	 * @param Device
	 * 
	 * @return void
	 */
	
	abstract void insertDeviceInfoInWorkingMemory(Device device);
}
