package xin.jiuzhiqian.study.design.auth;

/**
 * @author : feng
 */
public class ApiRequest {
    private String baseUrl;
    private String token;
    private String appId;
    private Long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, Long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}