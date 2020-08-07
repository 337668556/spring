package com;


import com.aop02.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring02.xml");
        Person per = context.getBean("person",Person.class);
        per.ssleep();
    }
}
