package eu.musesproject.client.model.decisiontable;

public class Action {
	
	public static final String OPEN = "open";
	public static final String INSTALL = "install";
	public static final String RUN = "run";
	public static final String ACCESS = "access";
	public static final String DELETE = "delete";
	public static final String SEND = "send";
	
	private int id;
	private String description;
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
	
	

}
