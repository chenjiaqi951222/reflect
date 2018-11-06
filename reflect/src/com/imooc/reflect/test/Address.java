package com.imooc.reflect.test;

public class Address {
    private String id;
    private String name;
    private String addr;
    private String tel;

    public Address() {
    }

    public Address(String id, String name, String addr, String tel) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    public void display() {
        System.out.println("这是一个地址");
    }
    private void info() {
        System.out.println("我是私有方法");
    }
    private void equalsAddress(String name) {
        if (this.name.equals(name)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }
}
