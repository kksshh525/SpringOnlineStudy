package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

    public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
        String signatureStr = joinpoint.getSignature().toShortString();
        System.out.println(signatureStr + "is started.");
        long st = System.currentTimeMillis();

        try {
            Object obj = joinpoint.proceed();
            return obj;
        } finally {
            long et = System.currentTimeMillis();
            System.out.println(signatureStr + "is finished.");
            System.out.println(signatureStr + "spent time : " + (et - st));
        }
    }
}
