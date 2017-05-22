package com.uxun.mkm.demo;

/**
 * Created by leo on 2017/5/16.
 */
public interface Context {
    public Object getValue(String key);
    public void add(String key,Object obj);
}
