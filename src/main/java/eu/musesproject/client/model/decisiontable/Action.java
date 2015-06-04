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

public class Action {
	private int id;
	private String description;

	/**
     * Access fiel {@link eu.musesproject.client.model.decisiontable.ActionType}
     */
	private boolean requestedByMusesAwareApp;
	private boolean musesAwareAppRequiresResponse;
	private String actionType;
	private long timestamp;

	public Action() {
		//default
		requestedByMusesAwareApp = false;
		musesAwareAppRequiresResponse = false;
	}

    public Action(String actionType, long timestamp) {
		//default
		requestedByMusesAwareApp = false;
        setActionType(actionType);
        setTimestamp(timestamp);
	}

	public boolean isMusesAwareAppRequiresResponse() {
		return musesAwareAppRequiresResponse;
	}

	public void setMusesAwareAppRequiresResponse(boolean musesAwareAppRequiresResponse) {
		this.musesAwareAppRequiresResponse = musesAwareAppRequiresResponse;
	}

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
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public boolean isRequestedByMusesAwareApp() {
		return requestedByMusesAwareApp;
	}
	public void setRequestedByMusesAwareApp(boolean requestedByMusesAwareApp) {
		this.requestedByMusesAwareApp = requestedByMusesAwareApp;
	}
}