package com;

import com.aop01.ISleep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring01.xml");
        ISleep is = context.getBean("personProxy",ISleep.class);
        is.asdsleep();
    }
}
