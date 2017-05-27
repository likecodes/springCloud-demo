package com.leo.labs.games.tree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leo on 2017/5/27.
 */
@RestController
public class TreeGameService {

        @RequestMapping(value = "/tree",method = RequestMethod.POST)
        public String plantTree(String str){

            return "植树抽奖服务！！！！";
    }
}
