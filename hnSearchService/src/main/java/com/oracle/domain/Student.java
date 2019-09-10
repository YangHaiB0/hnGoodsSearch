package com.oracle.domain;

/**
 * @author YangHaiBo
 * @create 2019-09-10 14:32
 */

/**
 * JsonUtil测试类
 */
public class Student {
   private String id;
   private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
