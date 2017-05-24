package com.leo.labs.productor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
        logger.info("client:   "+des);
        List<ServiceInstance> list=discoveryClient.getInstances("drawActivity-provider");
        for(ServiceInstance serviceInstance:list){
            logger.info("抽奖活动的服务"+serviceInstance.getHost()+" "+serviceInstance.getPort());
        }
        return r;
    }
}
