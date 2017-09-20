package com.banbo.mapper;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqDays;

/**
 * 
 * <br>
 * <b>功能：</b>KqDaysMapper<br>
 */
public interface KqDaysMapper  {
	
	public int insertDays(KqDays days);
	public int updateDays(KqDays days);
	public int deleteDays(KqDays days);
	public List<KqDays> querydate(Map<String, Object> likeCondition);
	public int insertorupdateDays(KqDays days);
}
