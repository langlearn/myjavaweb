package com.mydomain.myproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Yang on 2014/6/16.
 */
@Component
public class ConfigInfo {
    @Value("${key1}")
    private String key1;
    @Value("${key2}")
    private String key2;

    public String getKey1() {
        return key1;
    }

    public String getKey2() {
        return key2;
    }
}
