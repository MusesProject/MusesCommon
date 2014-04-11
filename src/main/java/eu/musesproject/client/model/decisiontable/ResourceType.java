package eu.musesproject.client.model.decisiontable;

public class ResourceType {
	
	public static final String FILE = "file";
	public static final String URL = "url";
	public static final String APP = "app";
	public static final String CONNECTION = "connection";
	
	private int id;
	private String name;
	private long modification;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getModification() {
		return modification;
	}
	public void setModification(long modification) {
		this.modification = modification;
	}
	
	

}
