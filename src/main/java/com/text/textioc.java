package com.text;

import com.bean.Computer;
import com.bean.Massage;
import com.bean.Mobilephone;
import com.bean.Strudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class textioc {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAnno.xml") ;



    }
}
