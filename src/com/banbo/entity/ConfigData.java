package com.banbo.entity;

public class ConfigData {

	private String GETOPTIONFROM; 
	
	private String Stamp;
	
	private String OpStamp;
	
	private String PhotoStamp;
	
	private String ErrorDelay;
	
	private String Delay;
	
	private String TransTimes;
	
	private String TransInterval;
	
	private String TransFlag;
	
	private String Realtime;
	
	private String Encrypt;

	public String getGETOPTIONFROM() {
		return GETOPTIONFROM;
	}

	public void setGETOPTIONFROM(String gETOPTIONFROM) {
		GETOPTIONFROM = gETOPTIONFROM;
	}

	public String getStamp() {
		return Stamp;
	}

	public void setStamp(String stamp) {
		Stamp = stamp;
	}

	public String getOpStamp() {
		return OpStamp;
	}

	public void setOpStamp(String opStamp) {
		OpStamp = opStamp;
	}

	public String getPhotoStamp() {
		return PhotoStamp;
	}

	public void setPhotoStamp(String photoStamp) {
		PhotoStamp = photoStamp;
	}

	public String getErrorDelay() {
		return ErrorDelay;
	}

	public void setErrorDelay(String errorDelay) {
		ErrorDelay = errorDelay;
	}

	public String getDelay() {
		return Delay;
	}

	public void setDelay(String delay) {
		Delay = delay;
	}

	public String getTransTimes() {
		return TransTimes;
	}

	public void setTransTimes(String transTimes) {
		TransTimes = transTimes;
	}

	public String getTransInterval() {
		return TransInterval;
	}

	public void setTransInterval(String transInterval) {
		TransInterval = transInterval;
	}

	public String getTransFlag() {
		return TransFlag;
	}

	public void setTransFlag(String transFlag) {
		TransFlag = transFlag;
	}

	public String getRealtime() {
		return Realtime;
	}

	public void setRealtime(String realtime) {
		Realtime = realtime;
	}

	public String getEncrypt() {
		return Encrypt;
	}

	public void setEncrypt(String encrypt) {
		Encrypt = encrypt;
	}

	@Override
	public String toString() {
		return "ConfigData [GETOPTIONFROM=" + GETOPTIONFROM + ", Stamp="
				+ Stamp + ", OpStamp=" + OpStamp + ", PhotoStamp=" + PhotoStamp
				+ ", ErrorDelay=" + ErrorDelay + ", Delay=" + Delay
				+ ", TransTimes=" + TransTimes + ", TransInterval="
				+ TransInterval + ", TransFlag=" + TransFlag + ", Realtime="
				+ Realtime + ", Encrypt=" + Encrypt + "]";
	}
	
	
	
}



