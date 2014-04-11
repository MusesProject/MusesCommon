/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.continuousrealtimeeventprocessor;


import java.util.List;

import eu.musesproject.server.risktrust.AccessRequest;
import eu.musesproject.server.risktrust.Asset;
import eu.musesproject.server.risktrust.DeviceTrustValue;
import eu.musesproject.server.risktrust.Outcome;
import eu.musesproject.server.risktrust.Probability;
import eu.musesproject.server.risktrust.Threat;
import eu.musesproject.server.risktrust.UserTrustValue;

/**
 * The Class EventProcessor.
 * 
 * @author Sergio Zamarripa (S2)
 * @version Sep 24, 2013
 */
public interface EventProcessor {

	/**
	 * Log user made access request.
	 */
	void logUserMadeAccessRequest();

	/**
	 * Log user decided to access in spite of risk.
	 */
	void logUserDecidedToAccessInSpiteOfRisk();

	/**
	 * Log user successfully applied risk treatment.
	 */
	void logUserSuccessfullyAppliedRiskTreatment();

	/**
	 * Log user accessed asset.
	 */
	void logUserAccessedAsset();

	/**
	 * Log denied access request.
	 */
	void logDeniedAccessRequest();

	/**
	 * Log positive outcome based on the achieved opportunity.
	 */
	void logPositiveOutcomeBasedOnTheAchievedOpportunity();

	/**
	 * Log negative outcome based on the achieved opportunity.
	 */
	void logNegativeOutcomeBasedOnTheAchievedOpportunity();

	/**
	 * Log user seems involved in security incident.
	 */
	void logUserSeemsInvolvedInSecurityIncident();

	/**
	 * Gets the current threats.
	 * 
	 * @param accessRequest
	 *            the access request
	 * @param userTrustValue
	 *            the user trust value
	 * @param deviceTrustValue
	 *            the device trust value
	 * @param requestedAsset
	 *            the requested asset
	 * @return the current threats
	 */
	List<Threat> getCurrentThreats(AccessRequest accessRequest,
			UserTrustValue userTrustValue, DeviceTrustValue deviceTrustValue);
	/**
	 * Compute outcome probability.
	 * 
	 * @param requestPotentialOutcome
	 *            the request potential outcome
	 * @param accessRequest
	 *            the access request
	 * @param userTrustValue
	 *            the user trust value
	 * @param deviceTrustValue
	 *            the device trust value
	 * @return the probability
	 */
	public Probability computeOutcomeProbability(
			Outcome requestPotentialOutcome, AccessRequest accessRequest,
			UserTrustValue userTrustValue, DeviceTrustValue deviceTrustValue);	
	/**
	 * Info M
	 * 
	 * Initialize all the infrastructure associated with the Event Processor, including the working memory allocation and correlation engine
	 * 
	 * @return void
	 */
	
	public void initializeEventProcessor();
	/**
	 * Info M
	 * 
	 * Specify the location of rules as a resource, which will notify the event processor with any change
	 * 
	 * @param ruleURL
	 *            Unified resource location of the MUSES rules, in terms of database connection
	 * 
	 * @return void
	 */
	
	public void setUpResourceNotifier(IMusesCorrelationEngine des, String drlUrl);
	
	/**
	 * Info M
	 * 
	 * Start temporal correlation. Once the rules are uploaded from the database, they are locally stored in the specified path and the correlation is started.
	 * 
	 * @param drlRulePath
	 *            Resource path where updated rules are stored
	 * 
	 * @return void
	 */
	
	public IMusesCorrelationEngine startTemporalCorrelation(String drlRulePath);

}
