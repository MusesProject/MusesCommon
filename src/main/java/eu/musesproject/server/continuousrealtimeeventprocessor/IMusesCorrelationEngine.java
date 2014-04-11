/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */

/**
 * The Class IMusesCorrelationEngine.
 * 
 * @author Sergio Zamarripa (S2)
 * @version 26 sep 2013
 */
package eu.musesproject.server.continuousrealtimeeventprocessor;

import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBase;
import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBaseConfiguration;
import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBuilder;

/**
 * Interface IMusesCorrelationEngine
 * 
 * @author Sergio Zamarripa (S2)
 * @version Sep 24, 2013
 */

public interface IMusesCorrelationEngine{



/**
	 * Creates KnowledgeBase from KBuilder and KBaseConfig
	 * 
	 * @param kbuilder
	 * @param config
	 * @return
	 */
	abstract KnowledgeBase createKBase(KnowledgeBuilder kbuilder, KnowledgeBaseConfiguration config);
	
	/**
	 * Info DB
	 * 
	 *  Loading Security Rules on server startup. This method calls retrieveUpdatedRules from SecurityRulesData.
	 * 
	 * 
	 * 
	 * @return void
	 */
	
	abstract void loadSecurityRules();
	
	/**
	 * Info DB
	 * 
	 *   If there is a need for update the rules, MusKRS will notify the Event Processor, taking into account that there are some
	 *   modifications of the rules that must be updated in the Event Processor. This method calls retrieveUpdatedRules from SecurityRulesData.
	 * 
	 *
	 * 
	 * @return void
	 */
	
	abstract void notifySecurityRulesUpdate();
	
	
}	