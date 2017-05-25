package com.leo.labs.act.ins.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by leo on 2017/5/24.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ActInsInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActInsInfoApplication.class,args);
    }
}
