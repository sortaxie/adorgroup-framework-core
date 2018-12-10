package com.adorgroup.framework.core.controller;


import com.adorgroup.framework.core.security.user.Token;
import com.adorgroup.framework.core.security.user.token.TokenUtil;

public class BaseController {

    private Token token;

    public Token getToken() {

        return TokenUtil.getToken();
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
