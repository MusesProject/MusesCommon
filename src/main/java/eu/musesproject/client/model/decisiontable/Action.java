package eu.musesproject.client.model.decisiontable;

public class Action {
	
	
	private int id;
	private String description;
    /**
     * Access fiel {@link eu.musesproject.client.model.decisiontable.ActionType}
     */
	private String actionType;
	private long timestamp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	

}
