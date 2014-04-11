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

import eu.musesproject.server.ConfiguredMusesClientApp;
import eu.musesproject.server.continuousrealtimeeventprocessor.CorporateSecurityPolicy;
import eu.musesproject.server.continuousrealtimeeventprocessor.model.Rule;

/**
 * The Class SecurityPoliciesRiskManagement.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class SecurityPoliciesRiskManagement {

	/**
	 * Configure risk policy.
	 * 
	 * @param riskPolicy
	 *            the risk policy
	 */
	public void configureRiskPolicy(RiskPolicy riskPolicy) {

	}

	/**
	 * Configure rules and coporate security policies.
	 * 
	 * @param rules
	 *            the rules
	 * @param corporateSecurityPolicies
	 *            the corporate security policies
	 */
	public void configureRulesAndCoporateSecurityPolicies(Rule[] rules,
			CorporateSecurityPolicy[] corporateSecurityPolicies) {
	}

	/**
	 * Configure assets values.
	 * 
	 * @param assets
	 *            the assets
	 */
	public void configureAssetsValues(Asset[] assets) {
	}

	/**
	 * Configure muses client app for device and user.
	 * 
	 * @param user
	 *            the user
	 * @param device
	 *            the device
	 * @return the configured muses client app
	 */
	public ConfiguredMusesClientApp configureMusesClientAppForDeviceAndUser(
			User user, Device device) {
		return null;
	}

	/**
	 * Enroll user.
	 * 
	 * @param user
	 *            the user
	 */
	public void enrollUser(eu.musesproject.server.risktrust.User user) {
	}

	/**
	 * Adds the device.
	 * 
	 * @param device
	 *            the device
	 */
	public void addDevice(eu.musesproject.server.risktrust.Device device) {

	}

}
