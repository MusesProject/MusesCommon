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
 * The Class SecurityIncident.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class SecurityIncident {
	
	private double costBenefit;
	
	private String description;
	
	private int deviceid;
	
	private int assetid;
	
	private int userid;  
	
	private int decisionid;
	
	private double probability;

	/**
	 * @return the costBenefit
	 */
	public double getCostBenefit() {
		return costBenefit;
	}

	/**
	 * @param costBenefit the costBenefit to set
	 */
	public void setCostBenefit(double costBenefit) {
		this.costBenefit = costBenefit;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the deviceid
	 */
	public int getDeviceid() {
		return deviceid;
	}

	/**
	 * @param deviceid the deviceid to set
	 */
	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	/**
	 * @return the probability
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * @param probability the probability to set
	 */
	public void setProbability(double probability) {
		this.probability = probability;
	}

	/**
	 * @return the assetid
	 */
	public int getAssetid() {
		return assetid;
	}

	/**
	 * @param assetid the assetid to set
	 */
	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}

	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return the decisionid
	 */
	public int getDecisionid() {
		return decisionid;
	}

	/**
	 * @param decisionid the decisionid to set
	 */
	public void setDecisionid(int decisionid) {
		this.decisionid = decisionid;
	}


}
