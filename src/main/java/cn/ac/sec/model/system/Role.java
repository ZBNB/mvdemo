package cn.ac.sec.model.system;
/**
 * 
* 类名称：Role.java
* @version 1.0
 */
public class Role {
	private String ROLE_ID;
	private String ROLE_NAME;
	private String RIGHTS;
	private String PARENT_ID;
	private String ADD_QX;
	private String DEL_QX;
	private String EDIT_QX;
	private String CHA_QX;
	private String QX_ID;
	private String data_rights;
	private String data_ids;
	private String station;
	
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getData_ids() {
		return data_ids;
	}
	public void setData_ids(String data_ids) {
		this.data_ids = data_ids;
	}
	public String getData_rights() {
		return data_rights;
	}
	public void setData_rights(String data_rights) {
		this.data_rights = data_rights;
	}
	public String getQX_ID() {
		return QX_ID;
	}
	public void setQX_ID(String qX_ID) {
		QX_ID = qX_ID;
	}
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	public String getRIGHTS() {
		return RIGHTS;
	}
	public void setRIGHTS(String rIGHTS) {
		RIGHTS = rIGHTS;
	}
	public String getPARENT_ID() {
		return PARENT_ID;
	}
	public void setPARENT_ID(String pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}
	public String getADD_QX() {
		return ADD_QX;
	}
	public void setADD_QX(String aDD_QX) {
		ADD_QX = aDD_QX;
	}
	public String getDEL_QX() {
		return DEL_QX;
	}
	public void setDEL_QX(String dEL_QX) {
		DEL_QX = dEL_QX;
	}
	public String getEDIT_QX() {
		return EDIT_QX;
	}
	public void setEDIT_QX(String eDIT_QX) {
		EDIT_QX = eDIT_QX;
	}
	public String getCHA_QX() {
		return CHA_QX;
	}
	public void setCHA_QX(String cHA_QX) {
		CHA_QX = cHA_QX;
	}
	
	
}
