package eu.musesproject.client.model.decisiontable;

import eu.musesproject.server.risktrust.RiskCommunication;

public class Decision {
	
	public static final String GRANTED_ACCESS = "GRANTED";

	public static final String STRONG_DENY_ACCESS = "STRONG_DENY";
	
	public static final String MAYBE_ACCESS_WITH_RISKTREATMENTS = "MAYBE";
	
	public static final String UPTOYOU_ACCESS_WITH_RISKCOMMUNICATION = "UP_TO_YOU";
	
	public static final String DEFAULT_DENY_ACCESS = "DEFAULT_DENY";
	
	private String name = null;
	
	private String decision_id = null;
	
	private int solving_risktreatment = 0;

	private RiskCommunication riskCommunication = new RiskCommunication();


	public RiskCommunication getRiskCommunication() {
		return riskCommunication;
	}


	public void setRiskCommunication(RiskCommunication riskCommunication) {
		this.riskCommunication = riskCommunication;
	}
	
	public void setName(String decision){
		this.name = decision;
	}

    public String getName() {
        return name;
    }


	public String getDecision_id() {
		return decision_id;
	}


	public void setDecision_id(String decision_id) {
		this.decision_id = decision_id;
	}


	public int getSolving_risktreatment() {
		return solving_risktreatment;
	}


	public void setSolving_risktreatment(int solving_risktreatment) {
		this.solving_risktreatment = solving_risktreatment;
	}
}
