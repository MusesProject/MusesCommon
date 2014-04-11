/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.device.muscm;


/**
 * The Interface IConnectionManager
 * @author yasir (SWE)
 * @version Sep 25, 2013
 */
public interface IConnectionManager {
    int musesConnect(String url, int timeout, IConnectionCallbacks connectionCallbacks);
    int sendData(String data);
    void disconnect(); 
}
