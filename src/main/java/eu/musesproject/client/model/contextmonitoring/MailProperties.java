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