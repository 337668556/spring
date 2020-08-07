package com.aop3;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepAdvice {



    public void begin() {

        System.out.println("睡前003");
    }


    public void over(){

        System.out.println("睡后002");

    }


}
