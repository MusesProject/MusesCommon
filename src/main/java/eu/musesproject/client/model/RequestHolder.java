package eu.musesproject.client.model;

import java.util.List;
import java.util.Map;

import eu.musesproject.client.model.decisiontable.Action;
import eu.musesproject.contextmodel.ContextEvent;

public class RequestHolder {
	private int id;
	private Action action;
	private Map<String, String> actionProperties;
	private List<ContextEvent> contextEvents;
	
	public RequestHolder() {
	}
	
	public RequestHolder(Action action, Map<String, String> actionProperties, List<ContextEvent> contextEvents) {
		setAction(action);
		setActionProperties(actionProperties);
		setContextEvents(contextEvents);
		setId(hashCode());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime
				* result
				+ ((actionProperties == null) ? 0 : actionProperties.hashCode());
		result = prime * result
				+ ((contextEvents == null) ? 0 : contextEvents.hashCode());
		result = prime * result + id;
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
		RequestHolder other = (RequestHolder) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (actionProperties == null) {
			if (other.actionProperties != null)
				return false;
		} else if (!actionProperties.equals(other.actionProperties))
			return false;
		if (contextEvents == null) {
			if (other.contextEvents != null)
				return false;
		} else if (!contextEvents.equals(other.contextEvents))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Map<String, String> getActionProperties() {
		return actionProperties;
	}

	public void setActionProperties(Map<String, String> actionProperties) {
		this.actionProperties = actionProperties;
	}

	public List<ContextEvent> getContextEvents() {
		return contextEvents;
	}

	public void setContextEvents(List<ContextEvent> contextEvents) {
		this.contextEvents = contextEvents;
	}
}