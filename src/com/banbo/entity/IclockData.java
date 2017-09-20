package com.banbo.entity;

import java.util.Date;

public class IclockData {

	private int id;
	
	private Date date;
	
	private String status;
	
	private String verify;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	@Override
	public String toString() {
		return "IclockData [id=" + id + ", date=" + date + ", status=" + status
				+ ", verify=" + verify + "]";
	}
	
	
}
