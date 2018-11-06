package com.imooc.reflect.test;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    //测试共有的属性
    public void demo1() throws Exception {
        //获得Class
        Class class1 = Class.forName("com.imooc.reflect.test.Person");
        //获得属性
        Field field = class1.getField("name");
        //操作属性
        Person p = (Person) class1.newInstance();
        field.set(p, "lily"); //相当于p.name = "lily"
        Object obj = field.get(p);
        System.out.println(obj);
    }

    @Test
    //测试私有属性
    public void demo2() throws Exception {
        //获得Class
        Class class1 = Class.forName("com.imooc.reflect.test.Person");
        //获得私有属性
        Field field = class1.getDeclaredField("sex");
        //操作属性
        Person p = (Person) class1.getConstructor().newInstance();
        //私有属性，需要设置一个可访问的权限
        field.setAccessible(true);
        //设置值
        field.set(p, "男");
        //获取值
        Object obj = field.get(p);
        System.out.println(obj);
        System.out.println(p);
    }
}
