package com.banbo.mapper;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqAtwork;


/**
 * 
 * <br>
 * <b>功能：</b>KqAtworkMapper<br>
 */
public interface KqAtworkMapper  {
	public int insertOrUpdate(List<KqAtwork> kqatwork);
	public int deleteList(List<KqAtwork> kqatwork);
	public int deleteClientid(Map<String, Object> likeCondition);
	public int insertatwork(KqAtwork kqatwork);
	public int deleteatwork(KqAtwork kqatwork);
}
