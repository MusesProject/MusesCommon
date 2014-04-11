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
 * The Class Outcome.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class Outcome {
	
	private double costBenefit;
	
	private String description;

	public Outcome(String description, double costBenefit) {
		super();
		this.setCostBenefit(costBenefit);
		this.setDescription(description);
	}

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

}
