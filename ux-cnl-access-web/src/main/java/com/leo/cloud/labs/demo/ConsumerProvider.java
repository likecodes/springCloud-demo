package com.leo.cloud.labs.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leo on 2017/5/24.
 */
@RestController
public class ConsumerProvider {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://DRAWACTIVITY-PROVIDER/add?a=10&b=20", String.class).getBody();
    }
}
