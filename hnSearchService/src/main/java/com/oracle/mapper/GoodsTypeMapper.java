package com.oracle.mapper;

import com.oracle.domain.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}