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
 * The Class Decision.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
abstract public class Decision {

	public static final CorporateUserAccessRequestDecision GRANTED_ACCESS = new CorporateUserAccessRequestDecision();

	public static final CorporateUserAccessRequestDecision STRONG_DENY_ACCESS = new CorporateUserAccessRequestDecision();
	
	public static final CorporateUserAccessRequestDecision MAYBE_ACCESS_WITH_RISKTREATMENTS = new CorporateUserAccessRequestDecision();
	
	public static final CorporateUserAccessRequestDecision UPTOYOU_ACCESS_WITH_RISKCOMMUNICATION = new CorporateUserAccessRequestDecision();
	

	private RiskCommunication riskCommunication = new RiskCommunication();
	
	private String condition = null;
	
	private String information = null;
	
	private int solving_risktreatment = 0;
	
	private String id;




	public RiskCommunication getRiskCommunication() {
		return riskCommunication;
	}


	public void setRiskCommunication(RiskCommunication riskCommunication) {
		this.riskCommunication = riskCommunication;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}


	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}


	/**
	 * @return the solving_risktreatment
	 */
	public int getSolving_risktreatment() {
		return solving_risktreatment;
	}


	/**
	 * @param solving_risktreatment the solving_risktreatment to set
	 */
	public void setSolving_risktreatment(int solving_risktreatment) {
		this.solving_risktreatment = solving_risktreatment;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}