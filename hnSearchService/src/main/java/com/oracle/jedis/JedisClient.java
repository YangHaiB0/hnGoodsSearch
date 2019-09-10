package com.oracle.jedis;

import java.util.List;

/**
 * @author YangHaiBo
 * @create 2019-09-10 15:04
 */
public interface JedisClient {

    String set(String key, String value);

    String get(String key);

    boolean exists(String key);

    Long expire(String key, int seconds);

    Long ttl(String key);

    Long incr(String key);

    Long hset(String key, String field, String value);

    String hget(String key,String field);

    Long hdel(String key,String... field);

    Boolean hexists(String key,String field);

    List<String> hvals(String key);

    Long del(String key);
}
