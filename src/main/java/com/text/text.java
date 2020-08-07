package com.text;

import com.bean.Order;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    public static void main(String[] args) {

        Order or=new Order();
        Order or1=new Order();
        System.out.println(or+"/n"+or1);

    }
}