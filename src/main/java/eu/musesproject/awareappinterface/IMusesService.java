package eu.musesproject.awareappinterface;

/*
 * #%L
 * MUSES Client
 * %%
 * Copyright (C) 2013 - 2014 Sweden Connectivity
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMusesService extends Remote{
	void sendUserAction(AwareAction action, Properties properties) throws RemoteException;
	void registerCallback(IMusesServiceCallback callback) throws RemoteException;
	void unregisterCallback(IMusesServiceCallback callback) throws RemoteException;
}
