package com.uxun.productor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by leo on 2017/5/23.
 */

@RestController
public class Activity {
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        String des=discoveryClient.description();
        logger.info("client"+des);
        return r;
    }
}
