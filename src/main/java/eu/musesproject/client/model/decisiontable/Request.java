/*
 * #%L
 * musesclient
 * %%
 * Copyright (C) 2013 - 2014 HITEC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package eu.musesproject.client.model.decisiontable;

/**
 * 
 * @author christophstanik
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