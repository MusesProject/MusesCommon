package eu.musesproject.contextmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * This class stores context events which are generated by the sensors
 */
public class ContextEvent {
	public static final String KEY_ID 	 	 = "id";
	public static final String KEY_TYPE 	 = "type";
	public static final String KEY_TIMESTAMP = "timestamp";
	
	private int id;
	private String type;
	private long timestamp;
	private Map<String, String> properties;

	public ContextEvent() {
		properties = new HashMap<String, String>();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((properties == null) ? 0 : properties.hashCode());
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContextEvent other = (ContextEvent) obj;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		if (timestamp != other.timestamp)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	public void generateId() {
		setId(hashCode());
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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