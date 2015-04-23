package eu.musesproject.awareappinterface;

import java.io.Serializable;

public class Properties implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String property;
	public Properties() {
	}
	
	public Properties(int id, String property) {
		super();
		this.id = id;
		this.property = property;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Properties [id=" + id + ", property=" + property + "]";
	}
	
}
