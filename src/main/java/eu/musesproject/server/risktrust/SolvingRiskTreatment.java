package eu.musesproject.server.risktrust;




public class SolvingRiskTreatment {
	
    public static final int VIRUS_FOUND           = 1; // Detection of a virus, the user must run an antivirus
    public static final int UNSECURE_NETWORK          = 2; // The user is connected to unsecure network, he has to switch to secure network
    public static final int ATTEMPT_TO_SAVE_A_FILE_IN_A_MONITORED_FOLDER  = 3; // The user try to save a file in a monitored folder
    public static final int ANTIVIRUS_IS_NOT_RUNNING          = 4; // The user has not a antivirus running on his device 
    public static final int UNSECURE_WIFI_ENCRYPTION_WITHOUT_WPA2  = 5; // The user is connected to unsecure network, he has to switch to secure network with wpa2 encryption
    public static final int INSUFFICIENT_SCREEN_LOOK_TIMEOUT          = 6; // The user has not set a screen look timeout  
    public static final int BLUETOOTH_ENABLED_MIGHT_TURN_INTO_LEAKAGE_PROBLEMS          = 7; // The user enabled the bluetooth  

    
    
}
