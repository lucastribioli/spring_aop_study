package br.com.lucastribioli.spring_aop_study.Aspect;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Aspect
@Component
public class LogAspect {


    @Before("execution(* br.com.lucastribioli.spring_aop_study.classTest.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method execution" + joinPoint.getSignature().getName());
    }

//    @After("execution(* br.com.lucastribioli.spring_aop_study.classTest.*.*(..))")
//    public void logAfter() {
//        System.out.println("After method execution");
//    }

//    @AfterReturning("execution(* br.com.lucastribioli.spring_aop_study.classTest.*.*(..))")
//    public void logAfterReturning() {
//        System.out.println("After returning method execution");
//    }
//
//    @AfterThrowing("execution(* br.com.lucastribioli.spring_aop_study.classTest.*.*(..))")
//    public void logAfterThrowing() {
//        System.out.println("After throwing method execution");
//    }
//
    @Around("execution(* br.com.lucastribioli.spring_aop_study.classTest.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Before method execution");
        Object object = joinPoint.proceed();
        System.out.println("After method execution");


        return object;

    }
}
