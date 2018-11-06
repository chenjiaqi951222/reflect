package com.imooc.reflect.test;

import java.lang.reflect.Method;

import static java.lang.Class.*;

public class TestAddress {
    public static void main(String[] args) throws Exception {

        Class class1 = forName("com.imooc.reflect.test.Address");
        Method display = class1.getMethod("display");
        Address address = (Address) class1.getConstructor(String.class,String.class,String.class,String.class).newInstance(null,"梅陇路",null,null);
        display.invoke(address);
        Method info = class1.getDeclaredMethod("info");
        info.setAccessible(true);
        info.invoke(address);
        Method equalsAddress = class1.getDeclaredMethod("equalsAddress", String.class);
        equalsAddress.setAccessible(true);
        equalsAddress.invoke(address,"和平路");
    }
}
