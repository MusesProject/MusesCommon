package eu.musesproject.client.model.decisiontable;

public class Action {
	private int id;
	private String description;

	/**
     * Access fiel {@link eu.musesproject.client.model.decisiontable.ActionType}
     */
	private boolean requestedByMusesAwareApp;
	private String actionType;
	private long timestamp;

	public Action() {
		//default
		requestedByMusesAwareApp = false;
	}

    public Action(String actionType, long timestamp) {
		//default
		requestedByMusesAwareApp = false;
        setActionType(actionType);
        setTimestamp(timestamp);
	}

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
	public boolean isRequestedByMusesAwareApp() {
		return requestedByMusesAwareApp;
	}
	public void setRequestedByMusesAwareApp(boolean requestedByMusesAwareApp) {
		this.requestedByMusesAwareApp = requestedByMusesAwareApp;
	}
}
