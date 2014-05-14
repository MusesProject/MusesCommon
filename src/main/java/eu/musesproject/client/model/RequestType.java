package eu.musesproject.client.model;

/**
 * Created by christophstanik on 4/22/14.
 */
public class RequestType {
    public static final String LOCAL_DECISION           = "local_decision"; // decision already done locally
    public static final String ONLINE_DECISION          = "online_decision"; // need decision from server
    public static final String UPDATE_CONTEXT_EVENTS    = "update_context_events"; // send offline stored context events
    public static final String UPDATE_POLICIES          = "update_policies"; // policies are sent
}