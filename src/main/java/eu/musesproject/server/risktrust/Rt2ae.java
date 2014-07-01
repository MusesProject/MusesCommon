/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.risktrust;

/*
 * #%L
 * MUSES Common
 * %%
 * Copyright (C) 2013 - 2014 UNIGE
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

/**
 * The Class Rt2ae.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public interface Rt2ae {

	/**
	 * Decide based on risk policy.
	 * 
	 * @param accessRequest
	 *            the access request
	 * @param policyCompliance
	 *            the policy compliance associated to the access request           
	 * @param context
	 *            the context
	 * @return the decision
	 */
	public Decision decideBasedOnRiskPolicy(AccessRequest accessRequest, PolicyCompliance policyCompliance,
			Context context);

	/**
	 * Warn device security state change.
	 * 
	 * @param deviceSecurityState
	 *            the device security state
	 */
	public void warnDeviceSecurityStateChange(
			DeviceSecurityState deviceSecurityState);

	/**
	 * Warn user seems involved in security incident.
	 * 
	 * @param user
	 *            the user
	 * @param probability
	 *            the probability
	 * @param securityIncident
	 *            the security incident
	 */
	public void warnUserSeemsInvolvedInSecurityIncident(User user,
			Probability probability, SecurityIncident securityIncident);

}
