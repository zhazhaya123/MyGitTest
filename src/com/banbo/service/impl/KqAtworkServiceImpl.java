package com.banbo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.banbo.entity.KqAtwork;
import com.banbo.mapper.KqAtworkMapper;
import com.banbo.service.KqAtworkService;

/**
 * 
 * <br>
 * <b>功能：</b>KqAtworkService<br>
 */
@Service("kqAtworkService")
public class  KqAtworkServiceImpl implements KqAtworkService {
  private final static Logger log= Logger.getLogger(KqAtworkServiceImpl.class);
	

	@Resource
	private KqAtworkMapper kqAtworkMapper;
	public int insertOrUpdate(List<KqAtwork> kqatwork){
		return kqAtworkMapper.insertOrUpdate(kqatwork);
	}
	public int deleteList(List<KqAtwork> kqatwork){
		return kqAtworkMapper.deleteList(kqatwork);
	}
	public int deleteClientid(Map<String, Object> likeCondition){
		return kqAtworkMapper.deleteClientid(likeCondition);
	}
	public int insertatwork(KqAtwork kqatwork){
		return kqAtworkMapper.insertatwork(kqatwork);
	}
}
