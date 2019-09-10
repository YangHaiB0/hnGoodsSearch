package com.oracle.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.domain.Goods;
import com.oracle.jedis.JedisClient;
import com.oracle.mapper.GoodsMapper;
import com.oracle.service.GoodsService;
import com.oracle.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 这是业务的实现
 */
@Service("GoodsServiceImpl")
public class GoodsServiceImpl implements GoodsService {
    //添加商品映射接口
    @Autowired
    @Qualifier("GoodsMapper")
    private GoodsMapper goodsMapper;

    //加入缓存功能
    @Autowired
    @Qualifier(value = "JedisClientImpl")
    private JedisClient jedisClient;


    /**
     * 查询方法 测试使用
     *
     * @param page 页数
     * @param pageSize 页面大小
     * @return goodList 查询到的商品信息
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Goods> searchAll(Integer page, Integer pageSize) {
        try {
            PageHelper.startPage(page, pageSize);
            List<Goods> goodsList = this.goodsMapper.searchAll();
            return goodsList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询商品信息
     *
     * @param page 页数
     * @param pageSize 页面大小
     * @return pageInfo
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Goods> search(Integer page, Integer pageSize) {
        try {
            //1.缓存中获取JSON数据
            String json = this.jedisClient.get("GoodsPage" + page);
            //2.判断得到的JOSN数据
            if (StringUtils.isNotBlank(json)) {
                //3.成功,转为java对象
                PageInfo pageInfo = JsonUtils.jsonToPojo(json, PageInfo.class);
                return pageInfo;
            } else {
                //4.缓存中无当前页面信息,去持久层获取java数据

                //指定分页信息
                PageHelper.startPage(page, pageSize);
                //数据库中查询商品
                List<Goods> goodsList = this.goodsMapper.searchAll();
                //得到分页后的商品信息
                PageInfo<Goods> pageInfo = new PageInfo<>(goodsList);
                if (page > pageInfo.getPages()) {
                    pageInfo.setPageNum(pageInfo.getPages());
                }
                if (page < 1) {
                    pageInfo.setPageNum(1);
                }
                //将获取的数据存入缓存
                String pageInfoJson = JsonUtils.objectToJson(pageInfo);
                this.jedisClient.set("GoodsPage" + page, pageInfoJson);

                return pageInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
