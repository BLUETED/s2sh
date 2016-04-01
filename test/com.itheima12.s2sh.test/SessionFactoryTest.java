package com.itheima12.s2sh.test;

import org.junit.Test;

/**
 * Created by BlueT on 2016/4/1.
 */
public class SessionFactoryTest extends SpringUtils {
    @Test
    public void testSessionFactory() {
        context.getBean("sessionFactory");
    }
}
