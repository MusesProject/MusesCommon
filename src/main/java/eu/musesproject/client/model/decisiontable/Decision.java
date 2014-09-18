package eu.musesproject.client.model.decisiontable;

import eu.musesproject.server.risktrust.RiskCommunication;

public class Decision {
	
	public static final String GRANTED_ACCESS = "GRANTED";

	public static final String STRONG_DENY_ACCESS = "STRONG_DENY";
	
	public static final String MAYBE_ACCESS_WITH_RISKTREATMENTS = "MAYBE";
	
	public static final String UPTOYOU_ACCESS_WITH_RISKCOMMUNICATION = "UP_TO_YOU";
	
	public static final String DEFAULT_DENY_ACCESS = "DEFAULT_DENY";
	
	private String name = null;

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
}
