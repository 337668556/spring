package com;

import com.aop04.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("spring04.xml");
        Person per = con.getBean("person",Person.class);
        per.asdsleep();
        per.sleep();

    }
}
