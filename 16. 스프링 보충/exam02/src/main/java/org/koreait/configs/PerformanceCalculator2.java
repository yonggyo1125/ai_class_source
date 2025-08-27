package org.koreait.configs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceCalculator2 {

    @Pointcut("execution(* org.koreait..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("스프링 프록시에 실행!");

        Object result = joinPoint.proceed(); // 핵심기능을 대신 수행

        return result;
    }
}
