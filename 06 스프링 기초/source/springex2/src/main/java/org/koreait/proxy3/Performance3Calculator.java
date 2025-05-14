package org.koreait.proxy3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Performance3Calculator {

    @Pointcut("execution(* org.koreait.proxy.*.*(long))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        long stime = System.nanoTime(); // 시작시간 - 공통 기능
        try {
            Object result = joinPoint.proceed(); // 핵심기능을 대신 수행 - 예) long factorial(long ..)

            return result;
        } finally {
            long etime = System.nanoTime(); // 종료 시간 - 공통 기능
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
