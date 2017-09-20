package com.banbo.mapper;

import java.util.List;
import java.util.Map;

import com.banbo.entity.KqUsers;


/**
 * 
 * <br>
 * <b>功能：</b>KqUsersMapper<br>
 */
public interface KqUsersMapper {

	int insertZkUser(KqUsers user);

	KqUsers selectZkUserByPin(String pin);

	int updateZkUser(KqUsers user);
	
	
}
