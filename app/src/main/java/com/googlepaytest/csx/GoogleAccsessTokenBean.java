package com.googlepaytest.csx;

/**
 * Date: 2019/8/28
 * create by cuishuxiang
 * description:
 */
public class GoogleAccsessTokenBean {

    /**
     * access_token : ya29.GltyB1aAtM7QEz0T0GVtNZk64bXldamoCWU32us0fe2zD8HvBNW3LMig4-T2p3EAc4oDfozqa6ZHIaNfCC19KFk4qFhPwAniSzy2r7OeunPHx8P6tzCwjKA1_H4F
     * expires_in : 3600//	访问令牌的剩余生命周期（以秒为单位）。
     * refresh_token : 1/ZSenrx4IL5iUnyA_P0TjDG9GpY6xENpEIv4LeQeo3mg
     * scope : https://www.googleapis.com/auth/androidpublisher
     * token_type : Bearer
     */

    private String access_token;
    private int expires_in;
    private String refresh_token;
    private String scope;
    private String token_type;

    public String getAccess_token() {
        return access_token;
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

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
