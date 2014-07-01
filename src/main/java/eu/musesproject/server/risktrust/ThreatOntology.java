package eu.musesproject.server.risktrust;

public class ThreatOntology {
	

	/**
	 * The unauthorized use of computer or network services without degrading the service to other 
	users**/
	public final static String DATA_LEAKAGE = "DATA_LEAKAGE";
	/**
	 * Deliberate destruction of a system component to interrupt system operation
	 * **/
	public final static String DATA_DESTRUCTION = "DATA_DESTRUCTION";
	/**
	 * Any unauthorized alteration of files stored on a host computer or data in transit across 
	a network**/
	public final static String DATA_CORRUPTION = "DATA_CORRUPTION";
	/**
	 * Use the normal function of the system to achieve the attacker's behavior for other purposes. For 
	example, an attacker uses the normal network connection to attack other systems, using vulnerabilities through 
	the normal system services to achieve attacker's aims**/
	public final static String ILLEGAL_USAGE = "ILLEGAL_USAGE";
	/**
	 * : The dissemination of information to anyone who is not authorized to access that 
	information**/
	public final static String DISCLOSURE_OF_INFORMATION = "DISCLOSURE_OF_INFORMATION";
	/**
	 * The intentional degradation or blocking of computer or network resources
	**/
	public final static String DENIAL_OF_USE = "DENIAL_OF_USE";
	/**
	 * Use some means or the use of weaknesses in the system; get permission to access the 
	target system. Such as guessing passwords, set aside the back door**/
	public final static String ELEVATION_PRIVILEGES = "ELEVATION_PRIVILEGES";
	
	public final static String UNAUTHORIZED_ACCESS = "UNAUTHORIZED_ACCESS";
	public final static String MALICIOUS_MISUSE = "MALICIOUS_MISUSE";
	public final static String PHYSICAL_ACCESS = "PHYSICAL_ACCESS";
}
