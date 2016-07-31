package com.superbdong.jelly.service;

import com.superbdong.jelly.model.Operator;

public interface OperatorService {
	int deleteByPrimaryKey(Integer id);

	int insert(Operator record);

	int insertSelective(Operator record);

	Operator selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Operator record);

	int updateByPrimaryKey(Operator record);
}
