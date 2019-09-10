package com.oracle.service;

import com.github.pagehelper.PageInfo;
import com.oracle.domain.Goods;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * 商品业务接口
 */

public interface GoodsService {
    public List<Goods> searchAll(Integer page,Integer pageSize);

    public PageInfo<Goods> search(Integer page, Integer pageSize);

    public int countAll();
}
