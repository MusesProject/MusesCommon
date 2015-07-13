package eu.musesproject.server.risktrust;




public class SolvingRiskTreatment {
	
    public static final int VIRUS_FOUND           = 1; // Detection of a virus, the user must run an antivirus
    public static final int UNSECURE_NETWORK          = 2; // The user is connected to unsecure network, he has to switch to secure network
    public static final int ATTEMPT_TO_SAVE_A_FILE_IN_A_MONITORED_FOLDER  = 3; // The user try to save a file in a monitored folder
    public static final int ANTIVIRUS_IS_NOT_RUNNING          = 4; // The user has not a antivirus running on his device 
    public static final int UNSECURE_WIFI_ENCRYPTION_WITHOUT_WPA2  = 5; // The user is connected to unsecure network, he has to switch to secure network with wpa2 encryption
    public static final int INSUFFICIENT_SCREEN_LOOK_TIMEOUT          = 6; // The user has not set a screen look timeout  
    public static final int BLUETOOTH_ENABLED_MIGHT_TURN_INTO_LEAKAGE_PROBLEMS          = 7; // The user enabled the bluetooth  
    public static final int ACCESSIBILITY          = 8; // Accessibilty disbaled
    public static final int OPEN_CONFIDENTIAL_ASSET_UNSECURE_WIFI = 9; //"AccessRequest Detection open asset type confidential unsecure wifi" 
    public static final int OPEN_INTERNAL_ASSET_UNSECURE_WIFI = 10;//"AccessRequest Detection open asset type internal unsecure wifi" 
    public static final int OPEN_STRICTLY_CONFIDENTIAL_ASSET_UNSECURE_WIFI = 10;//"AccessRequest Detection open asset type strictly confidential unsecure wifi" 
    public static final int BLACKLIST_APP_0001 = 11;//"Blacklist app 00001" 
    public static final int BLACKLIST_APP_0002 = 12;//"Blacklist app 00002" 
    public static final int EMAIL_WITH_ATTACHEMENT = 13;//AccessRequest Email with Attachments"
    public static final int CHANGE_SECURITY_PROPERTY_PASSWORD_PROTECTED = 14;//"AccessRequest Change Security Property-password-protected" 
    public static final int CHANGE_SECURITY_PROPERTY_SCREEN_TIMEOUT = 15;//"AccessRequest Change Security Property-screen-timeout" 
    public static final int REQUIRED_APPLICATION_LIST = 16;//"Required application list" 
    public static final int DETECTION_OPEN_FILE_MONITORED_FOLDER = 16;// "AccessRequest Detection Open File in a monitored folder" 
    public static final int ROOTED_DEVICE = 17;//"Rooted device" 
    public static final int BLACKLIST_GENERIC_OPEN = 18;//"Blacklist generic open" 
    public static final int UNSAFE_STORAGE = 19;//"Unsafe Storage" 
    public static final int INSTALL_NOT_ALLOWED_APPLICATION = 20;//"Install not allowed application" 
    public static final int ZONE_1_APPLICATION_RESTRICTION = 21;//"Zone 1 application restriction" 
    public static final int OPEN_ASSET_IN_RESTRICTED_ZONE_1 = 22;//"Open asset in restricted zone 1" 
    public static final int USER_ENTERED_PASSWORD = 23;//"User entered password" 
    public static final int EMAS_ADD_NOTE = 24;//"Emas Add Note" 
    public static final int OPPORTUNITY = 25;//"Emas Add Note" 

    

    
    
}
