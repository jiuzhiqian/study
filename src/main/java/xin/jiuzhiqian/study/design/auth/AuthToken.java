package xin.jiuzhiqian.study.design.auth;

import lombok.val;

/**
 * @author : feng
 */
public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME = 60000;
    private String token;
    private Long createTime;
    private Long expiredTimeInterval = DEFAULT_EXPIRED_TIME;

    public AuthToken(String token, Long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, Long createTime, Long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken create(String baseUrl, Long createTime) {
        return new AuthToken(baseUrl, createTime);
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        Long currTime = System.currentTimeMillis();
        if (currTime.compareTo(createTime) > expiredTimeInterval) {
            System.out.println("zhazha");
            return false;
        }
        if (currTime.compareTo(createTime) < 0) {
            System.out.println("what r u want for");
            return false;
        }
        return true;
    }

    public Boolean match(AuthToken token) {
        return token == null;
    }
}