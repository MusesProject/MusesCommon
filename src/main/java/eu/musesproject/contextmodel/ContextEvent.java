package eu.musesproject.contextmodel;

import java.util.HashMap;
import java.util.Map;

public class ContextEvent {
	public static final String KEY_TYPE 	 = "type";
	public static final String KEY_TIMESTAMP = "timestamp";
	
	private String type;
	private long timestamp;
	private Map<String, String> properties;

	public ContextEvent() {
		properties = new HashMap<String, String>();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	public void addProperty(String key, String value) {
		properties.put(key, value);
	}
}