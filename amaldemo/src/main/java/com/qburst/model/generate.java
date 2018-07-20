package com.qburst.model;

import java.io.Serializable;

public class generate implements Serializable {
    public String str;

    public generate(String str) {
        this.str = str;
    }

    public generate() {
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
