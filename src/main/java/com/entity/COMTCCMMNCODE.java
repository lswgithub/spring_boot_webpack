package com.entity;


import javax.persistence.Id;


public class COMTCCMMNCODE {
	
	private String codeId;
	private String codeIdNm;
	private String codeIdDc;
	private String useAt;
	private String clCode;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdustId;
	
	public void setCodeId(String arg) {
		this.codeId = arg;
	}
	public void setCodeIdNm(String arg) {
		this.codeIdNm = arg;
	}
	public void setCodeIdDc(String arg) {
		this.codeIdDc = arg;
	}
	public void setUseAt(String arg) {
		this.useAt = arg;
	}
	public void setClCode(String arg) {
		this.clCode = arg;
	}
	public void setFrstRegistPnttm(String arg) {
		this.frstRegistPnttm = arg;
	}
	public void setFrstRegisterId(String arg) {
		this.frstRegisterId = arg;
	}
	public void setLastUpdtPnttm(String arg) {
		this.lastUpdtPnttm = arg;
	}
	public void setLastUpdustId(String arg) {
		this.lastUpdustId = arg;
	}
	
	@Id
	public String getCodeId () {
		return codeId;
	}
	
	public String getCodeIdNm () {
		return codeIdNm;
	}
	
	public String getCodeIdDc () {
		return codeIdDc;
	}
	
	public String getUseAt () {
		return useAt;
	}
	
	public String getClCode () {
		return clCode;
	}
	
	public String getFrstRegistPnttm () {
		return frstRegistPnttm;
	}
	
	public String getFrstRegisterId () {
		return frstRegisterId;
	}
	
	public String getLastUpdtPnttm () {
		return lastUpdtPnttm;
	}
	
	public String getLastUpdustId () {
		return lastUpdustId;
	}
	
	
}
