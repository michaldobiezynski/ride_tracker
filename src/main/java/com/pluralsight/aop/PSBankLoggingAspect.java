package com.pluralsight.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class PSBankLoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.pluralsight.controller.*.*(..))")
    private void forControllersPackage() { }

    @Pointcut("execution(* com.pluralsight.Services.*.*(..))")
    private void forServicesPackage() { }

    @Pointcut("execution(* com.pluralsight.DAO.*.*(..))")
    private void forDAOPackage() { }

    @Pointcut("forControllersPackage() || forServicesPackage() || forDAOPackage()")
    private void forApplication() { }

    @Before("forApplication()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("Information: in @Before Advice: Calling the method: " + methodName);
    }

    @AfterReturning(pointcut="forApplication()", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("Information: in @AfterReturning: From method: " + methodName);
        logger.info("Data returned by method: " + result);
    }

}
