package com.xiwai.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class advice {

    @Pointcut("execution(* com.xiwai.bookservice.*Service.*(..))")
    private void servicept() {
    }

    @Around("servicept()")
//    public Object runspeed(ProceedingJoinPoint pjp) throws Throwable {
//
//
//        Object ret = pjp.proceed();
//        return ret;
//    }
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层接口万次执行时间: " + (end - start) + "ms");
    }

}
