package com.oracle.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author YangHaiBo
 * @create 2019-09-10 11:24
 */
public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper();


    /**
     * 将对象转换为json对象
     * <p>Title:pojoToJson</p>
     * @param data
     * @return
     */
    public static String objectToJson(Object data){
        try{
            String string = MAPPER.writeValueAsString(data);
            return string;
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json数据转换为pojo对象list
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T> T jsonToPojo(String jsonData,Class<T> beanType){
        try {
            T t= MAPPER.readValue(jsonData,beanType);
            return t;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
