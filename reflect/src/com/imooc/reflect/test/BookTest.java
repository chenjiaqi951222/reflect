package com.imooc.reflect.test;

import org.junit.Test;

import java.lang.reflect.Field;

public class BookTest {
    @Test
    /**
     * 测试Book类
     */
    public void testBook() throws Exception {
        Class class1 = Class.forName("com.imooc.reflect.test.Book");
        Book book1 = (Book) class1.newInstance();
        Field field = class1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(book1, "童话");
        System.out.println(book1.toString());
        Field field2 = class1.getField("price");
        Book book2 = (Book) class1.newInstance();
        field2.set(book2,20.3);
        System.out.println(book2.toString());
    }
}
