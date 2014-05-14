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
 * The Class DeviceSecurityState.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class DeviceSecurityState {
	
		private int device_id;
		private String deviceState;
		private boolean antivirus; 
		private boolean passwordProtection;
		private boolean autoLock; 
		private boolean sslProtection;
		private boolean encryption; 
		private boolean trackingDevice;
		private boolean remotewipe;
		private boolean vpn;
		/**
		 * @return the device_id
		 */
		public int getDevice_id() {
			return device_id;
		}
		/**
		 * @param device_id the device_id to set
		 */
		public void setDevice_id(int device_id) {
			this.device_id = device_id;
		}
		/**
		 * @return the deviceState
		 */
		public String getDeviceState() {
			return deviceState;
		}
		/**
		 * @param deviceState the deviceState to set
		 */
		public void setDeviceState(String deviceState) {
			this.deviceState = deviceState;
		}
		/**
		 * @return the antivirus
		 */
		public boolean isAntivirus() {
			return antivirus;
		}
		/**
		 * @param antivirus the antivirus to set
		 */
		public void setAntivirus(boolean antivirus) {
			this.antivirus = antivirus;
		}
		/**
		 * @return the passwordProtection
		 */
		public boolean isPasswordProtection() {
			return passwordProtection;
		}
		/**
		 * @param passwordProtection the passwordProtection to set
		 */
		public void setPasswordProtection(boolean passwordProtection) {
			this.passwordProtection = passwordProtection;
		}
		/**
		 * @return the autoLock
		 */
		public boolean isAutoLock() {
			return autoLock;
		}
		/**
		 * @param autoLock the autoLock to set
		 */
		public void setAutoLock(boolean autoLock) {
			this.autoLock = autoLock;
		}
		/**
		 * @return the sslProtection
		 */
		public boolean isSslProtection() {
			return sslProtection;
		}
		/**
		 * @param sslProtection the sslProtection to set
		 */
		public void setSslProtection(boolean sslProtection) {
			this.sslProtection = sslProtection;
		}
		/**
		 * @return the encryption
		 */
		public boolean isEncryption() {
			return encryption;
		}
		/**
		 * @param encryption the encryption to set
		 */
		public void setEncryption(boolean encryption) {
			this.encryption = encryption;
		}
		/**
		 * @return the trackingDevice
		 */
		public boolean isTrackingDevice() {
			return trackingDevice;
		}
		/**
		 * @param trackingDevice the trackingDevice to set
		 */
		public void setTrackingDevice(boolean trackingDevice) {
			this.trackingDevice = trackingDevice;
		}
		/**
		 * @return the remotewipe
		 */
		public boolean isRemotewipe() {
			return remotewipe;
		}
		/**
		 * @param remotewipe the remotewipe to set
		 */
		public void setRemotewipe(boolean remotewipe) {
			this.remotewipe = remotewipe;
		}
		/**
		 * @return the vpn
		 */
		public boolean isVpn() {
			return vpn;
		}
		/**
		 * @param vpn the vpn to set
		 */
		public void setVpn(boolean vpn) {
			this.vpn = vpn;
		}
		


}
