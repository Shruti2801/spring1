package com.example.demo;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("calling using JIO sim");
    }

    @Override
    public void data() {
        System.out.println("browsing data using JIO");
    }
}

