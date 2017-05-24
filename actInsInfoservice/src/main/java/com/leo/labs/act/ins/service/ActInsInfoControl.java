package com.leo.labs.act.ins.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by leo on 2017/5/24.
 */
@RestController
public class ActInsInfoControl {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String add() {
        System.out.println("活动实例信息服务");
        return "redirect:www.baidu.com";
    }
}
