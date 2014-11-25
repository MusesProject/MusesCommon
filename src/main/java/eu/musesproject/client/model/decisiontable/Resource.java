package eu.musesproject.client.model.decisiontable;

public class Resource {
	
	private int id;
	private String description;
	private String path;
	private String condition;
	private ResourceType resourceType;
	private long modification;
	private String severity;
	private String name;
	private String type;
	
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
	public long getModification() {
		return modification;
	}
	public void setModification(long modification) {
		this.modification = modification;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
