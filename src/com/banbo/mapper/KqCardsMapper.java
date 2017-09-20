package com.banbo.mapper;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqCards;
import com.banbo.entity.KqUsers;


/**
 * 
 * <br>
 * <b>功能：</b>KqCardsMapper<br>
 */
public interface KqCardsMapper  {

	KqCards selectLastWorkNo();

	int insertKqCard(KqCards card);

	int updateKqCard(KqCards card);		
	
	public List<KqCards> queryUserId(Map<String, Object> likeCondition);

	KqCards selectCid(KqUsers userPin);
}
