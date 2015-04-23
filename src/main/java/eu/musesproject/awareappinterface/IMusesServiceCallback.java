package eu.musesproject.awareappinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMusesServiceCallback extends Remote {
	void onAccept(String response) throws RemoteException;
   	void onDeny(String response) throws RemoteException;
}
