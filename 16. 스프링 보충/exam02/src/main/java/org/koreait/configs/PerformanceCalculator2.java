package org.koreait.configs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceCalculator2 {

    @Pointcut("execution(* org.koreait.calculator..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
       long stime = System.nanoTime(); // 시작 시간 - 공통 기능
        try {

           Object result = joinPoint.proceed(); // 핵심기능을 대신 수행

           return result;
       } finally { // 공통 기능
           long etime = System.nanoTime(); // 종료 시간
            System.out.printf("걸린시간: %d%n", etime - stime);
       }
    }
}
