package com.oracle.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsType implements Serializable {

    private Integer typeId;

    private String typeName;

    private Integer typePid;

    private Integer typeLv;

    private String typePath;

    private static final long serialVersionUID = 1L;

}