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
package eu.musesproject.client.model.actuators;

import eu.musesproject.client.model.decisiontable.Action;
import eu.musesproject.client.model.decisiontable.Decision;

import java.util.Map;

/**
 * This class holds {@link Decision}, {@link Action} and the action properties
 * in order to perform the tasks of the actuator. THis object is meant to store
 * all the needed information for the Actuator classes.
 *
 * Created by christophstanik on 6/8/15.
 */
public class ActuationInformationHolder {
    private Decision decision;
    private Action action;
    private Map<String, String> actionProperties;

    public ActuationInformationHolder() {
    }

    public ActuationInformationHolder(Decision decision, Action action, Map<String, String> actionProperties) {
        this.decision = decision;
        this.action = action;
        this.actionProperties = actionProperties;
    }

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
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
}