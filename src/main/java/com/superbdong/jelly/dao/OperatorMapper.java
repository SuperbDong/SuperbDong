package com.superbdong.jelly.dao;

import com.superbdong.jelly.model.Operator;

public interface OperatorMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Operator record);

	int insertSelective(Operator record);

	Operator selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Operator record);

	int updateByPrimaryKey(Operator record);
}