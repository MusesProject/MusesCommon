package eu.musesproject.client.model.actuators;

public class RiskTreatment {
	private int riskLevel;
    private String riskTreatmentText;
    private int answerAlternatives;
    
    public RiskTreatment() {
	}
    
    public RiskTreatment(int riskLevel, String riskTreatmentText, int answerAlternatives) {
    	this.riskLevel = riskLevel;
    	this.riskTreatmentText = riskTreatmentText;
    	this.answerAlternatives = answerAlternatives;
	}
    
	public int getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskTreatmentText() {
		return riskTreatmentText;
	}
	public void setRiskTreatmentText(String riskTreatmentText) {
		this.riskTreatmentText = riskTreatmentText;
	}
	public int getAnswerAlternatives() {
		return answerAlternatives;
	}
	public void setAnswerAlternatives(int answerAlternatives) {
		this.answerAlternatives = answerAlternatives;
	}
}