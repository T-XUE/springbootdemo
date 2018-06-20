package com.tixue.dal.dao;

import com.tixue.dal.model.TxDdd;
import com.tixue.util.mapper.TxMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TxDddMapper extends TxMapper<TxDdd> {
}