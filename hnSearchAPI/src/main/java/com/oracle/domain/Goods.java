package com.oracle.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {

    private Integer goodsId;

    private String goodsName;

    private Float goodsPrice;

    private Integer goodsNum;

    private String goodsImg;

    //private Integer goodsType;
    //建立与GoodsType的关联
    private GoodsType goodsTypes;

    private static final long serialVersionUID = 1L;

}