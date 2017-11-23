/**
 * 
 */
package com.cgi.w360vmstats;

/**
 * @author ashray.gokul
 *
 */
public class VMStats {

	
	private String vmStats;
	private String vmName;
	private String vmID;
	/**
	 * @return the vmStats
	 */
	public String getVmStats() {
		return vmStats;
	}
	
	public VMStats(String stats, String name, String id) {
		
		this.vmStats = stats;
		this.vmID = id;
		this.vmName = name;
		
	}
	
	/**
	 * @param vmStats the vmStats to set
	 */
	public void setVmStats(String vmStats) {
		this.vmStats = vmStats;
	}
	/**
	 * @return the vmName
	 */
	public String getVmName() {
		return vmName;
	}
	/**
	 * @param vmName the vmName to set
	 */
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}
	/**
	 * @return the vmID
	 */
	public String getVmID() {
		return vmID;
	}
	/**
	 * @param vmID the vmID to set
	 */
	public void setVmID(String vmID) {
		this.vmID = vmID;
	}
	
}
