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

package eu.musesproject.client.model.contextmonitoring;

/**
 * This class holds constants that are needed for mail sensors. These kind of sensors
 * are working for just specific mail applications. However, this class provides all
 * properties that might be interesting
 * 
 * @author christophstanik
 */
public class MailProperties {
	private MailProperties() {
	}
    // context property keys
    public static final String PROPERTY_KEY_FROM 			= "from";
    public static final String PROPERTY_KEY_TO 				= "to";
    public static final String PROPERTY_KEY_CC 				= "cc";
    public static final String PROPERTY_KEY_BCC 			= "bcc";
    public static final String PROPERTY_KEY_SUBJECT 		= "subject";
    public static final String PROPERTY_KEY_ATTACHMENT_COUNT= "noAttachments";
    public static final String PROPERTY_KEY_ATTACHMENT_INFO = "attachmentInfo";
}