package com.oracle.mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.domain.Goods;
import com.oracle.mapper.GoodsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 测试接口功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml " ,
        "classpath:spring-context.xml"})

public class GoodsMapperTest {
    @Autowired@Qualifier("GoodsMapper")
    private GoodsMapper goodsMapper;
    @Test
    public void test(){
        List<Goods> list = goodsMapper.searchAll();

        for(Goods goods : list){
            System.out.println(goods.toString());
        }
    }

    @Test
    public void page(){
        PageHelper.startPage(2,4);

        List<Goods> goodsList = this.goodsMapper.searchAll();

        PageInfo<Goods> pageInfo = new PageInfo<>(goodsList);

        List<Goods> list = pageInfo.getList();

        for (Goods goods:list){
            System.out.println(goods.getGoodsName());
            System.out.println("=======================");
        }
    }

}
