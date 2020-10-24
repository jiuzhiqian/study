package xin.jiuzhiqian.study;

import xin.jiuzhiqian.study.tools.Redis;

/**
 * @author : zhou
 */
public class TmpTest {
    public static void main(String[] args) {
        Redis redis = new Redis();
        redis.setHash("zhou2","space","0");
        System.out.println(redis.getHash("zhou2","space"));
    }
}