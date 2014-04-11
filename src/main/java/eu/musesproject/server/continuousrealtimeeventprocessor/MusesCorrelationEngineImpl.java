/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */

/**
 * The Class MusesCorrelationEngineImpl.
 * 
 * @author Sergio Zamarripa (S2)
 * @version 26 sep 2013
 */

package eu.musesproject.server.continuousrealtimeeventprocessor;

import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBase;
import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBaseConfiguration;
import eu.musesproject.server.continuousrealtimeeventprocessor.model.KnowledgeBuilder;

/**
 * The Class MusesCorrelationEngineImpl
 * 
 * @author Sergio Zamarripa (S2)
 * @version Sep 24, 2013
 */
public class MusesCorrelationEngineImpl implements IMusesCorrelationEngine{

	@Override
	public KnowledgeBase createKBase(KnowledgeBuilder kbuilder,
			KnowledgeBaseConfiguration config) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadSecurityRules() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifySecurityRulesUpdate() {
		// TODO Auto-generated method stub
		
	}
	
}