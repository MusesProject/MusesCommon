package eu.musesproject.client.model.decisiontable;

/**
 * 
 * @author zardosht
 *
 */
public class Request {
	
	private Action action = null;
	private Resource resource = null;

    public Request() {
    }

    public Request(Action action, Resource resource) {
        this.action = action;
        this.resource = resource;
    }

    public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}