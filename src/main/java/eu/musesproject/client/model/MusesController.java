package eu.musesproject.client.model;

public interface MusesController {
	
	void enableMuses();
	void disableMuses();
	MusesLogEntry[] getLogs(String logQueryParams);
	MusesStatusInfo showStatus();

}
