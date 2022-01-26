package com.example.demo;

public class Airtel implements Sim {

//    public Airtel(){
//        System.out.println("airtel constut called");
//    }

    @Override
    public void calling() {
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing data using airtel");
    }
}
