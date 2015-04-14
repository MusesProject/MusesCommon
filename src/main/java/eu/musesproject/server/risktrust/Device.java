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
 * The Class Device.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class Device {
	
	private DeviceTrustValue devicetrustvalue;
	
	private String deviceId;

	private byte[] certificate;

	private String description;

	private String imei;

	private String mac;

	private String name;

	private String OS_name;

	private String OS_version;

	private String ownerType;
	
	private double trustValue;

	/**
	 * @return the devicetrustvalue
	 */
	public DeviceTrustValue getDevicetrustvalue() {
		return devicetrustvalue;
	}

	/**
	 * @param devicetrustvalue the devicetrustvalue to set
	 */
	public void setDevicetrustvalue(DeviceTrustValue devicetrustvalue) {
		this.devicetrustvalue = devicetrustvalue;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the certificate
	 */
	public byte[] getCertificate() {
		return certificate;
	}

	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(byte[] certificate) {
		this.certificate = certificate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imei
	 */
	public String getImei() {
		return imei;
	}

	/**
	 * @param imei the imei to set
	 */
	public void setImei(String imei) {
		this.imei = imei;
	}

	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the oS_name
	 */
	public String getOS_name() {
		return OS_name;
	}

	/**
	 * @param oS_name the oS_name to set
	 */
	public void setOS_name(String oS_name) {
		OS_name = oS_name;
	}

	/**
	 * @return the oS_version
	 */
	public String getOS_version() {
		return OS_version;
	}

	/**
	 * @param oS_version the oS_version to set
	 */
	public void setOS_version(String oS_version) {
		OS_version = oS_version;
	}

	/**
	 * @return the ownerType
	 */
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the trustValue
	 */
	public double getTrustValue() {
		return trustValue;
	}

	/**
	 * @param trustValue the trustValue to set
	 */
	public void setTrustValue(double trustValue) {
		this.trustValue = trustValue;
	}

}
