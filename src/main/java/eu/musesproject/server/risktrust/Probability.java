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
 * The Class Probability.
 * 
 * @author Jean-Marc Seigneur (UNIGE)
 * @version Sep 24, 2013
 */
public class Probability {
	
	private double value;
	private String eventname;

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the eventname
	 */
	public String getEventname() {
		return eventname;
	}

	/**
	 * @param eventname the eventname to set
	 */
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

}
