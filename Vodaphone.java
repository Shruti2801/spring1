package com.example.demo;

//import com.example.demo.Sim;

public class Vodaphone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling using vodaphone sim");
    }

    @Override
    public void data() {
        System.out.println("browsing data using vodaphone");
    }
}
