package eu.musesproject.awareappinterface;

import java.io.Serializable;

public class AwareAction implements Serializable {
	
	private static final long serialVersionUID = -8719201663585198021L;
	private String type;
	private long timestamp;
	
	public AwareAction() {

	}
	
	public AwareAction(String type, long timestamp) {
		super();
		this.type = type;
		this.timestamp = timestamp;
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

	@Override
	public String toString() {
		return "AwareAction [type=" + type + ", timestamp=" + timestamp + "]";
	}
	
	
}
