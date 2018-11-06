package com.imooc.reflect.test;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestGoods {
    @Test
    /**
     * 测试Class和Constructor
     */
    public void testGoods() throws Exception {
        Class classgoods = Class.forName("com.imooc.reflect.test.Goods");
        Constructor constructor1 = classgoods.getConstructor();
        Goods goods1 = (Goods) constructor1.newInstance();
        goods1.display();
        Constructor constructor2 = classgoods.getConstructor(String.class,String.class,Double.class,String.class);
        Goods goods2 = (Goods) constructor2.newInstance("001","手机",5000.62,"安卓手机");
        System.out.println(goods2.toString());
    }
}
