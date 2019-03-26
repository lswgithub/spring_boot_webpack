package com.entity;

import javax.persistence.*;
// import javax.persistence.Column;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import java.io.Serializable;
import lombok.Data;

@Entity
// @Data
@Table(name="COMTCCMMNCODE")
public class COMTCCMMNCODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public COMTCCMMNCODE(){}
	@Id
	@Column(name = "CODE_ID", nullable=false)
	public String codeId;
	@Column(name = "CODE_ID_NM")
	public String codeIdNm;
	@Column(name = "CODE_ID_DC")
	public String codeIdDc;
	@Column(name = "USE_AT")
	public String useAt;
	@Column(name = "CL_CODE")
	public String clCode;
	@Column(name = "FRST_REGIST_PNTTM")
	public String frstRegistPnttm;
	@Column(name = "FRST_REGISTER_ID")
	public String frstRegisterId;
	@Column(name = "LAST_UPDT_PNTTM")
	public String lastUpdtPnttm;
	@Column(name = "LAST_UPDUSR_ID")
	public String lastUpdustId;

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
