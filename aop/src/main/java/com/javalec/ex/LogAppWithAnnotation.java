package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAppWithAnnotation {

    @Pointcut("within(com.javalec.ex.*)")
    private void pointcutMethod() {}

    @Around("pointcutMethod()")
    public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
        String signatureStr = joinPoint.getSignature().toShortString();
        System.out.println(signatureStr + "is started");
        long st = System.currentTimeMillis();

        try {
            Object obj = joinPoint.proceed();
            return obj;
        } finally {
            long et = System.currentTimeMillis();
            System.out.println(signatureStr + "is finished.");
            System.out.println("Spending time : " + (et - st));
        }
    }

    // If you want to use advice without pointcut method and annotation, you can use within directly.
    @Before("within(com.javalec.ex.*)")
    public void beforeAdvice() {
        System.out.println("beforeAdvice()");
    }
}
