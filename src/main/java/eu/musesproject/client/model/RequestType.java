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

/**
 * Created by christophstanik on 4/22/14.
 */
public class RequestType {
    public static final String LOCAL_DECISION           = "local_decision"; // decision already done locally
    public static final String ONLINE_DECISION          = "online_decision"; // need decision from server
    public static final String UPDATE_CONTEXT_EVENTS    = "update_context_events"; // send offline stored context events
    public static final String UPDATE_POLICIES          = "update_policies"; // policies are sent
    public static final String LOGIN	        		= "login"; // authentication response to the server
    public static final String LOGOUT	        		= "logout";
    public static final String AUTH_RESPONSE	        = "auth-response"; // authentication response from the server
    public static final String USER_ACTION				= "user_behavior";
    public static final String CONFIG_SYNC				= "config_sync";
    public static final String CONFIG_UPDATE			= "config_update";
}