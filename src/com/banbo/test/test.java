package com.banbo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.tomcat.jni.File;

import sun.util.resources.CalendarData;

import com.banbo.entity.ConfigData;
import com.banbo.entity.IclockData;
import com.banbo.entity.User;

public class test {


	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("MMM, d EEE yyyy HH:mm:ss 'GMT'",Locale.ENGLISH);
		SimpleDateFormat formatII = new SimpleDateFormat("HH:mm");
		String str = format.format(new Date());
		System.out.println(formatII.format(new Date()));
		ConfigData cg = new ConfigData();
		cg.setGETOPTIONFROM("7663473230281");		
		cg.setStamp("最后上传考勤记录时间");							//为设备最后上传考勤记录的最新记录时间戳标记 (可以理解为客户端自增长ID，无需反对应实际实际，BigInt)
		cg.setOpStamp("最后上传人员数据时间");							//为设备最后上传人员数据的最新操作记录时间戳标记 
		cg.setPhotoStamp("最后上传验证现场照片的记录时间");						//为设备最后上传验证现场照片的记录时间戳标记 
		cg.setErrorDelay("重新联接服务器的间隔时间");						//为联网失败后重新联接服务器的间隔时间（秒）
		cg.setDelay("联网时联接服务器的间隔时间");							//为正常联网时联接服务器的间隔时间（秒）
		cg.setTransTimes("00:00;14:05");						//为定时检查并传送新数据时间（时:分，24小时格式），多个时间用分号分开，最多支持10个时间 
		cg.setTransInterval("检查并传送新数据间隔时间");					//为检查并传送新数据间隔时间（分钟）
		cg.setTransFlag("1111000000");						//为指示设备向服务器传送哪些数据的标记, 请返回“1111000000” 
		cg.setRealtime("1");							//是否实时传送新记录。 为1表示有新数据就传送到服务器，为0表示按照 TransTimes 和 TransInterval 规定的时间传送
		cg.setEncrypt("None");							//是否加密传送数据（加密传送使用中控专门的加密算法），请返回0   改动：None
		
		String http ="HTTP/1.1 200 OK\nContent-Type: text/plain\nDate: "+format.format(new Date())+"\n";
		
		String body = "GET OPTION FROM: "+cg.getGETOPTIONFROM()+"\nStamp="+cg.getStamp()+"\nOpStamp="+cg.getOpStamp()+"\nPhotoStamp="+cg.getPhotoStamp()+"\nErrorDelay="+cg.getErrorDelay()+"\nDelay="+cg.getDelay()+"\nTransTimes="+cg.getTransTimes()+"\nTransInterval="+cg.getTransInterval()+"\nTransFlag="+cg.getTransFlag()+"\nRealtime="+cg.getRealtime()+"\nEncrypt="+cg.getRealtime()+"";
		String data = http+body;
		//2017年8月25日16:44:48    返回配置信息
		System.out.println(data);

	}
	
	
	public void test(){
		String params = "OPLOG 4	1	2017-08-24 16:17:02	0	0	0	0OPLOG 9	1	2017-08-24 16:17:36	3	0	0	0OPLOG 9	1	2017-08-24 16:17:37	0	0	0	0OPLOG 9	1	2017-08-24 16:17:38	0	0	0	0OPLOG 9	1	2017-08-24 16:17:39	0	0	0	0OPLOG 9	1	2017-08-24 16:17:40	0	0	0	0OPLOG 30	1	2017-08-24 16:18:45	888	0	0	0USER PIN=888	Name=	Pri=0	Passwd=789	Card=	Grp=0	TZ=0000000000000000";
		int i = params.indexOf("USER");
		String str = params.substring(i+4, params.length());
		
		String[] split = str.split("\t");
		Map<String, String> map = new HashMap<String, String>();
		for (int j = 0; j < split.length; j++) {
			
			int k = split[j].indexOf("=");
			String strStart = split[j].substring(0,k).trim();
			String strEnd = split[j].substring(k+1, split[j].length()).trim();
			map.put(strStart,strEnd);
		}
		
		User user = new User();
		user.setName(map.get("Name"));
		user.setPIN(map.get("PIN"));
		user.setGrp(map.get("Grp"));
		user.setPri(map.get("Pri"));
		user.setTZ(map.get("TZ"));
		user.setPasswd(map.get("Passwd"));
		user.setCard(map.get("Card"));
		System.out.println(map.get("PIN"));
		System.out.println(str);
		System.out.println(map);
		System.out.println(user);
	}
}
