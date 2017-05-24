package com.leo.cloud.labs.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo on 2017/5/16.
 */
public class DrawContext implements Context {
    private Map map=new HashMap();
    public void add(String key,Object obj){
        map.put(key,obj);
    }


    public Object getValue(String key){
        return map.get(key);
    }
}
