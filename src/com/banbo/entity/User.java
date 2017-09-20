package com.banbo.entity;

public class User {

	private String Name;
	
	private String PIN;
	
	private String Grp;
	
	private String TZ;
	
	private String Passwd;
	
	private String Card;
	
	private String Pri;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getGrp() {
		return Grp;
	}

	public void setGrp(String grp) {
		Grp = grp;
	}

	public String getTZ() {
		return TZ;
	}

	public void setTZ(String tZ) {
		TZ = tZ;
	}

	public String getPasswd() {
		return Passwd;
	}

	public void setPasswd(String passwd) {
		Passwd = passwd;
	}

	public String getCard() {
		return Card;
	}

	public void setCard(String card) {
		Card = card;
	}

	public String getPri() {
		return Pri;
	}

	public void setPri(String pri) {
		Pri = pri;
	}

	@Override
	public String toString() {
		return "User [Name=" + Name + ", PIN=" + PIN + ", Grp=" + Grp + ", TZ="
				+ TZ + ", Passwd=" + Passwd + ", Card=" + Card + ", Pri=" + Pri
				+ "]";
	}
	
	
}
