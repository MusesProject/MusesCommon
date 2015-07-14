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

package eu.musesproject.client.model;

public class JSONIdentifiers {
	public static final String REQUEST_IDENTIFIER 		= "id";
	public static final String REQUEST_TYPE_IDENTIFIER 	= "requesttype";
	public static final String ACTION_IDENTIFIER 	    = "action";
	public static final String ACTION_TYPE 		        = "type";
	public static final String ACTION_TIMESTAMP	        = "timestamp";
	public static final String DECISION_IDENTIFIER	    = "decision_id";
	public static final String SENSOR_IDENTIFIER	    = "sensor";
	public static final String PROPERTIES_IDENTIFIER    = "properties";
	public static final String DEVICE_POLICY   			= "muses-device-policy";
	public static final String POLICY_SECTION_FILES		= "files";
	public static final String POLICY_SECTION_ACTION	= "action";
	public static final String POLICY_SECTION_RESOURCE	= "resource";
	public static final String POLICY_SECTION_SUBJECT	= "subject";
	public static final String POLICY_SECTION_RISKCOMMUNICATION	= "riskCommunication";
	public static final String POLICY_SECTION_ROLE		= "role";
	public static final String POLICY_SECTION_RISKTREATMENT	= "riskTreatment"; 
	public static final String POLICY_PROPERTY_TEXTUAL_DESC	= "textualdescription";//TODO use iterator to handle properties
	public static final String POLICY_PROPERTY_SEQUENCE = "communication_sequence";
	public static final String POLICY_PROPERTY_DESCRIPTION	= "description";
	public static final String POLICY_PROPERTY_TYPE		= "type";
	public static final String POLICY_PROPERTY_RESOURCETYPE		= "resourceType";
	public static final String POLICY_PROPERTY_PATH		= "path";
	public static final String POLICY_PROPERTY_ALLOW	= "allow";
	public static final String POLICY_PROPERTY_DENY		= "deny";
	public static final String POLICY_PROPERTY_MAYBE	= "maybe";
	public static final String POLICY_CONDITION			= "condition";
	public static final String AUTH_RESULT				= "auth-result";
	public static final String AUTH_RESPONSE			= "auth-response";
	public static final String AUTH_MESSAGE				= "auth-message";
	public static final String AUTH_USERNAME			= "username";
	public static final String AUTH_PASSWORD			= "password";
	public static final String AUTH_DEVICE_ID			= "device_id";
	public static final String USER_BEHAVIOR			= "behavior";
	public static final String OPERATING_SYSTEM_VERSION		= "operating-system-version";
	public static final String OPERATING_SYSTEM 			= "operating-system";
	public static final String LOGOUT_RESPONSE			= "logout-response";
	public static final String MUSES_CONFIG				= "muses-config";
	public static final String SILENT_MODE				= "silent-mode";
	public static final String CONFIG_NAME				= "config-name";
	public static final String SENSOR_TYPE				= "sensor-type";
	public static final String KEY						= "key";
	public static final String VALUE					= "value";
	public static final String SENSOR_CONFIGURATION		= "sensor-configuration";
	public static final String SENSOR_PROPERTY			= "sensor-property";
	public static final String CONNECTION_CONFIG		= "connection-config";
	public static final String TIMEOUT					= "timeout";
	public static final String POLL_TIMEOUT				= "poll_timeout";
	public static final String SLEEP_POLL_TIMEOUT		= "sleep_poll_timeout";
	public static final String POLLING_ENABLED			= "polling_enabled";
	public static final String LOGIN_ATTEMPTS			= "login_attempts";
	public static final String ZONE_CONFIG				= "zone-config";
	public static final String ZONE						= "zone";
	public static final String ZONE_ID					= "zoneId";
	public static final String LONGITUD					= "longitud";
	public static final String LATITUDE					= "latitude";
	public static final String RADIUS					= "radius";
	public static final String DESCRIPTION				= "description";
	public static final String OPPORTUNITY_TIME			= "opportunity_working_hours";
	public static final String OPPORTUNITY_LOSS_EUROS	= "opportunity_revenue_loss_euros";
	public static final String OPPORTUNITY_LOSS_DESCRIPTION= "opportunity_revenue_loss_description";
}
