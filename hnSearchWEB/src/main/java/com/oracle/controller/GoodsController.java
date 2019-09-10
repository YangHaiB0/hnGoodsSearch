package com.oracle.controller;

import com.github.pagehelper.PageInfo;
import com.oracle.domain.Goods;
import com.oracle.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品控制器
 */
@Controller("GoodsController")
public class GoodsController {

    @Autowired
    @Qualifier(value = "GoodsService")
    private GoodsService goodsService;

    /**
     * 控制器跳转业务方法
     *
     * @param model 用来保存查到的商品数据
     * @return String
     */
    //@Transactional 还没加
    @RequestMapping("/search")
    public String search(Model model,
                         @RequestParam(name = "page", defaultValue = "1") Integer page,
                         @RequestParam(name = "size", defaultValue = "4") Integer pageSize) {
        //1.查询所有商品
        PageInfo<Goods> goodsList = this.goodsService.search(page, pageSize);

        //2.输出
        System.out.println(goodsList);

        //3.把取到的数据保存到model对象
        model.addAttribute("goodsList", goodsList);//商品信息

        //4.返回值
        return "list";
    }
}
