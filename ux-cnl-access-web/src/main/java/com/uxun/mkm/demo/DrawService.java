package com.uxun.mkm.demo;

import com.uxun.mkm.demo.Context;
import com.uxun.mkm.demo.DrawContext;
import com.uxun.mkm.demo.DrawStep;

/**
 * Created by leo on 2017/5/16.
 */
public class DrawService {
        public String test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
          Class clazz=Class.forName("com.uxun.demo.DrawStepImp");
          DrawStep step=(DrawStep)clazz.newInstance();
          Context ct=step.excute(new DrawContext());
          System.out.println(ct.getValue("result"));
            return null;
        }
}
