package com.dmoreira.fintech.repositories.rest;

import java.util.List;

/**
 * Created by diego.moreira on 11/7/2016.
 */
public class MervalConnection {

    private List<String> cookies;
    private String state;

    public List<String> getCookies() {
        return cookies;
    }

    public void setCookies(List<String> cookies) {
        this.cookies = cookies;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
