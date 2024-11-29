package com.blog.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // 定义切点，匹配UserService中的所有方法
    @Pointcut("execution(* com.blog.service.Impl.BookServiceImpl.*(..))")
    public void userServiceMethods() {}

    // 前置通知，在方法执行前记录日志
    @After("userServiceMethods()")
    public void beforeUserServiceMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Before executing method: {}", methodName);
    }
}