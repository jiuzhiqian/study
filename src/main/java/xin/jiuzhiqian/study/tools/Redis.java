package xin.jiuzhiqian.study.tools;

import redis.clients.jedis.Jedis;

/**
 * @author : feng
 */
public class Redis {

    private static Jedis jedis;

    public Redis() {
        jedis = new Jedis("localhost", 6379);
    }

    public void setString(String key, String value) {
        jedis.set(key, value);
    }

    public String getString(String key) {
        return jedis.get(key);
    }

    public String getHash(String hashKey, String key) {
        return jedis.hget(hashKey, key);
    }

    public void setHash(String hashKey, String key, String value) {
        jedis.hset(hashKey, key, value);
    }
}