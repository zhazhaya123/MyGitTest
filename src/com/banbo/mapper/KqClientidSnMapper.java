package com.banbo.mapper;

import java.util.List;

import com.banbo.entity.KqClientidSn;

public interface KqClientidSnMapper {

	public KqClientidSn selectKqjAndSN(String sn);	//查询配置文件

	public int updateZkOpStamp(String OpStamp, String sn);	//更新配置文件的opStamp 为设备最后上传人员数据的最新操作记录时间戳标记 

	public int updateZkStamp(String stamp, String sn);	//更新配置文件的Stamp 为设备最后上传考勤记录的最新记录时间戳标记 

}
