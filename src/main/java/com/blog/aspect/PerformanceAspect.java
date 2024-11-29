package com.blog.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
@Slf4j
public class PerformanceAspect {
    @Pointcut("execution(* com.blog.service.Impl.BookServiceImpl.*(..))")
    public void pt(){}
    @Around("pt()")
    public Object measurePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature().getName() + " took " + (endTime - startTime) + " milliseconds to execute.");
        return result;
    }
}
