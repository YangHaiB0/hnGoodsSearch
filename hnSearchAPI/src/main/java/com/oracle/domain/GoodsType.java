package com.oracle.domain;

import java.io.Serializable;

public class GoodsType implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_id
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_name
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_pid
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private Integer typePid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_lv
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private Integer typeLv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_path
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private String typePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_type
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_id
     *
     * @return the value of goods_type.type_id
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_id
     *
     * @param typeId the value for goods_type.type_id
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_name
     *
     * @return the value of goods_type.type_name
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_name
     *
     * @param typeName the value for goods_type.type_name
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_pid
     *
     * @return the value of goods_type.type_pid
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public Integer getTypePid() {
        return typePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_pid
     *
     * @param typePid the value for goods_type.type_pid
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_lv
     *
     * @return the value of goods_type.type_lv
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public Integer getTypeLv() {
        return typeLv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_lv
     *
     * @param typeLv the value for goods_type.type_lv
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public void setTypeLv(Integer typeLv) {
        this.typeLv = typeLv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_path
     *
     * @return the value of goods_type.type_path
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public String getTypePath() {
        return typePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_path
     *
     * @param typePath the value for goods_type.type_path
     *
     * @mbg.generated Fri Sep 06 09:02:52 CST 2019
     */
    public void setTypePath(String typePath) {
        this.typePath = typePath == null ? null : typePath.trim();
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typePid=" + typePid +
                ", typeLv=" + typeLv +
                ", typePath='" + typePath + '\'' +
                '}';
    }
}