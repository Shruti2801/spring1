package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
    public static void main(String[] args) {

//        Airtel airtel =new Airtel();
//        airtel.calling();
//        airtel.data();
//
//        Sim sim =new Airtel();
//        sim.calling();
//        sim.data();

        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        System.out.println("config loaded");

//    Airtel air= (Airtel) context.getBean("airtel");
//    air.calling();
//    air.data();
//
//    Vodaphone vo= context.getBean("vodaphone",Vodaphone.class);
//    vo.calling();
//    vo.data();

        Sim s =context.getBean("sim", Sim.class);
        s.calling();
        s.data();


    }
}
