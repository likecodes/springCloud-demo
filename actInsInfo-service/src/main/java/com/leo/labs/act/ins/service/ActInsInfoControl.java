package com.leo.labs.act.ins.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by leo on 2017/5/24.
 */
@Controller
public class ActInsInfoControl {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String add() {
        System.out.println("活动实例信息服务");
        return "redirect:http://www.baidu.com";
    }
    @RequestMapping(value = "/page/{bankcode}/{actId}",method=RequestMethod.GET)
    public  String  getActivityPage(@PathVariable("bankcode")String banckcod,@PathVariable("actId")String actId){
        System.out.println("活动页面获取"+actId);
        return actId;

    }
}
