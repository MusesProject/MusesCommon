/*
 * Copyright
 * Jean-Marc Seigneur, Carlos Ballester Lafuente, Xavier Titi
 * University of Geneva
 * 2013 /2014
 *
 */
package eu.musesproject.server.risktrust;

import java.util.Collection;
import java.util.Vector;



/**
 * The Class OpportunityDescriptor.
 */
public class OpportunityDescriptor {


	/** The outcomes. */
	//Outcome is the cost of the opportunity 
	private Collection<Outcome> outcomes = new Vector<Outcome>();
	
	/** The textual description */
	private String description;
	
	
	/** The probability.*/
	private double probability;
	

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public void setOutcomes(Collection<Outcome> outcomes) {
		this.outcomes = outcomes;
	}

	public OpportunityDescriptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OpportunityDescriptor(String description,
			 Outcome outcome) {
		super();
		this.description = description;
		this.outcomes.add(outcome);
	}

	
	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the outcomes.
	 * 
	 * @return the outcomes
	 */
	public Collection<Outcome> getOutcomes() {
		return this.outcomes;
	}

	public void addOutcome(Outcome outcome) {

		this.outcomes.add(outcome);

	}

	

	/**
	 * Sets the description.
	 * 
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public void computeOpportunityOutcomeProbability(User user ){
		probability = user.getUsertrustvalue().getValue();
	}
}
