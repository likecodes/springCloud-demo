package com.uxun.mkm.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by leo on 2017/5/16.
 */
@Controller
@EnableAutoConfiguration
public class test {
    @RequestMapping("/")
    @ResponseBody
    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       com.uxun.mkm.demo.DrawService ds =new com.uxun.mkm.demo.DrawService();
       ds.test();

    }
    public static void main(String[] args) {

        SpringApplication.run(test.class, args);

    }

}
