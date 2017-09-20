package com.banbo.mapper;

import java.util.Map;

import com.banbo.entity.KqRecordsValid;



public interface KqRecordsValidMapper {
	public int insert(KqRecordsValid recordslog);
	public int update(KqRecordsValid recordslog);
	public int delete(KqRecordsValid recordslog);
//	public int addorupdate(KqRecordsLog recordslog);
	public int insertorupdateRecord(KqRecordsValid recordslog);
	public KqRecordsValid queryByOne(Map<String, Object> likeCondition);
}
