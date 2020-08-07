package com.aop04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SleepAdvice {

    @Pointcut("execution(* com.aop04.Person.*(..))")
    public void cut(){}


@Before("cut()")
    public void begin() {

        System.out.println("睡前004");
    }

    @Before("cut()")
    public void over(){

        System.out.println("睡后004");

    }



}
