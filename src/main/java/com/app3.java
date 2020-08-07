package com;


import com.aop3.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app3 {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring03.xml");
        Person per = context.getBean("person",Person.class);
        per.sleep();
    }
}
