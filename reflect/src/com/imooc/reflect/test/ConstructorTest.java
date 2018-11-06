package com.imooc.reflect.test;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    @Test
    /**
     * 获得无参数的构造方法
     */
    public void demo1() throws Exception {
        //获得类的字节码文件对应的对象
        Class class1 = Class.forName("com.imooc.reflect.test.Person");
        Constructor c = class1.getConstructor();
        Person person = (Person) c.newInstance();//相当于Person person = new Person();
        person.eat();
    }

    @Test
    /**
     * 获得有参数的构造方法并且实例化
     */
    public void demo2() throws Exception{
        Class class1 = Class.forName("com.imooc.reflect.test.Person");
        Constructor constructor = class1.getConstructor(String.class,String.class);
        Person person = (Person) constructor.newInstance("陈嘉麒","男");//相当于Person person = new Person();
        System.out.println(person);
    }
}
