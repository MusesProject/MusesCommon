package eu.musesproject.awareappinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMusesService extends Remote{
	void sendUserAction(AwareAction action, Properties properties) throws RemoteException;
	void registerCallback(IMusesServiceCallback callback) throws RemoteException;
	void unregisterCallback(IMusesServiceCallback callback) throws RemoteException;
}
