package eu.musesproject.client.model.contextmonitoring;

/**
 * This class contains a dictionary for specific user actions in an application 
 * like attaching a file for different languages
 * 
 * @author christophstanik
 */

// TODO this should be solved in a different way I think but it's sufficient for testing purpose
public class InteractionDictionary {
	/*
	 * Interactions for mail applications
	 */
	// English
	public static final String ATTACH_FILE_EN = "Attach file";
	public static final String SEND_EN 		  = "Send";
	public static final String SUBJECT_EN	  = "subject";
	public static final String DISCARD_EN	  = "Discard";
	// German
	public static final String ATTACH_FILE_DE = "Datei anhängen";
	public static final String SEND_DE 		  = "Senden";
	public static final String SUBJECT_DE 	  = "Betreff";
	public static final String DISCARD_DE	  = "Löschen";
}