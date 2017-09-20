package com.banbo.mapper;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqRecords;

/**
 * 
 * <br>
 * <b>功能：</b>KqRecordsMapper<br>
 */
public interface KqRecordsMapper{

	int insertRecords(KqRecords records);		//新增考勤数据

	KqRecords selectLastRecordId();
	public KqRecords queryByOne(Map<String, Object> likeCondition);

}
