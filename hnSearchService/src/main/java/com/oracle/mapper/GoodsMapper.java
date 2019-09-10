package com.oracle.mapper;

import com.oracle.domain.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("GoodsMapper")
public interface GoodsMapper {
    public List<Goods> searchAll();

    public int countAll();
}