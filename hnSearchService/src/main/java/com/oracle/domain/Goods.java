package com.oracle.domain;

import java.io.Serializable;

public class Goods implements Serializable {

    private Integer goodsId;

    private String goodsName;

    private Float goodsPrice;

    private Integer goodsNum;

    private String goodsImg;

    private Integer goodsType;

    /**
     * 建立与GoodsType的关联
     */
    private GoodsType goodsTypes;



    private static final long serialVersionUID = 1L;


    public Integer getGoodsId() {
        return goodsId;
    }


    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNum=" + goodsNum +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsType=" + goodsType +
                ", goodsTypes=" + goodsTypes.toString() +
                '}';
    }

    public GoodsType getGoodsTypes() {
        return this.goodsTypes;
    }
}