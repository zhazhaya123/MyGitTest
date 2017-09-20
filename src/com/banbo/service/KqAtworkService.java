package com.banbo.service;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqAtwork;

/**
 * 
 * <br>
 * <b>功能：</b>KqAtworkService<br>
 */
public interface KqAtworkService {
	public int insertOrUpdate(List<KqAtwork> kqatwork);
	public int deleteList(List<KqAtwork> kqatwork);
	public int deleteClientid(Map<String, Object> likeCondition);
	public int insertatwork(KqAtwork kqatwork);
}
