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

import java.util.HashMap;

/**
 * The Class Threat.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class AdditionalProtection {
	
	private int id;
	private String type;
	private long timestamp;
	private int requestId;
	private double probability;	
    private int assetId;
    private boolean passwordProtected;
	private boolean patternProtected;
	private boolean trustedAVInstalled;
	private boolean isRooted;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(double probability) {
		this.probability = probability;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public boolean isPasswordProtected() {
		return passwordProtected;
	}
	public void setPasswordProtected(boolean passwordProtected) {
		this.passwordProtected = passwordProtected;
	}
	public boolean isPatternProtected() {
		return patternProtected;
	}
	public void setPatternProtected(boolean patternProtected) {
		this.patternProtected = patternProtected;
	}
	public boolean isTrustedAVInstalled() {
		return trustedAVInstalled;
	}
	public void setTrustedAVInstalled(boolean trustedAVInstalled) {
		this.trustedAVInstalled = trustedAVInstalled;
	}
	public boolean isRooted() {
		return isRooted;
	}
	public void setRooted(boolean isRooted) {
		this.isRooted = isRooted;
	}


}
