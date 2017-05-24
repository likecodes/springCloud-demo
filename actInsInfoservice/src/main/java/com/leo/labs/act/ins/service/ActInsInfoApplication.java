package com.leo.labs.act.ins.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
