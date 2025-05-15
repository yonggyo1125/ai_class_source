package org.koreait.proxy3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Performance3Calculator {

//    @Pointcut("execution(* org.koreait.proxy.*.*(long))")
//    public void publicTarget() {}

    //@Around("publicTarget()")
    //@Around("org.koreait.proxy3.CommonPointcut.publicTarget()")
    @Around("CommonPointcut.publicTarget()") // 동일 패키지에 있는 경우
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

    @Before("CommonPointcut.publicTarget()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before()");
    }

    @After("CommonPointcut.publicTarget()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after()");
    }

    @AfterReturning(pointcut = "CommonPointcut.publicTarget()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("afterReturning()");
        System.out.println("rv:" + returnValue);
    }
}
