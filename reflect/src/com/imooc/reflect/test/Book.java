package com.imooc.reflect.test;

public class Book {
    private String id;
    private String name;
    public Double price;

    public Book() {
    }

    public Book(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
