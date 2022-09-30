package com.zcitc.advlib.bean;

/**
 * @author liuj
 */
public class Token {
    private String access_token;
    private int expires_in;
    private String token_type;

    public String getAccess_token() {
        return checkNull(access_token);
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getToken_type() {
        return checkNull(token_type);
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    private String checkNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
