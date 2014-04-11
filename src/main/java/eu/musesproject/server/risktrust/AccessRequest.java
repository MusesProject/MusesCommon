/*
 * version 1.0 - MUSES prototype software
 * Copyright MUSES project (European Commission FP7) - 2013 
 * 
 */
package eu.musesproject.server.risktrust;

/*
 * #%L
 * MUSES Common
 * %%
 * Copyright (C) 2013 - 2014 UNIGE
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


/**
 * The Class AccessRequest.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class AccessRequest {
	
	private int id;
	private Device device;
	private User user;
	private Asset requestedCorporateAsset;
	private String action;
	
	
	/**
	 * @return the device
	 */
	public Device getDevice() {
		return device;
	}
	/**
	 * @param device the device to set
	 */
	public void setDevice(Device device) {
		this.device = device;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the requestedCorporateAsset
	 */
	public Asset getRequestedCorporateAsset() {
		return requestedCorporateAsset;
	}
	/**
	 * @param requestedCorporateAsset the requestedCorporateAsset to set
	 */
	public void setRequestedCorporateAsset(Asset requestedCorporateAsset) {
		this.requestedCorporateAsset = requestedCorporateAsset;
	}
	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	


	
}
