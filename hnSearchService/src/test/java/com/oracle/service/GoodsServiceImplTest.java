package com.oracle.service;

import com.github.pagehelper.PageInfo;
import com.oracle.domain.Goods;
import com.oracle.service.impl.GoodsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 商品业务实现测试
 */
@RunWith(value= SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml"
})
public class GoodsServiceImplTest {
    //放入业务实现类
    @Autowired @Qualifier("GoodsServiceImpl")
    private GoodsServiceImpl goodsServiceImpl;
    @Test
    public void searchAll() {
        List<Goods> goodsList=this.goodsServiceImpl.searchAll(1,4);
        for (Goods goods : goodsList) {
            System.out.println(goods.getGoodsName());
            System.out.println(goods.getGoodsTypes().getTypeName());
            System.out.println("============================================");
        }
    }

    @Test
    public void search() {
        PageInfo<Goods> pageInfo = this.goodsServiceImpl.search(1, 4);

        List<Goods> goodsList = pageInfo.getList();

        for (Goods goods : goodsList) {
            System.out.println(goods.getGoodsName());
            System.out.println(goods.getGoodsTypes().getTypeName());
            System.out.println("============================================");
        }
    }
}
