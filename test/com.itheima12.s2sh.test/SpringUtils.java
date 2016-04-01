package com.itheima12.s2sh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BlueT on 2016/4/1.
 */
public class SpringUtils {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
    }
}
