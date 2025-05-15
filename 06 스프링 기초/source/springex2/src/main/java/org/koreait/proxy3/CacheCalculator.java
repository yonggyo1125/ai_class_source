package org.koreait.proxy3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Order(1)
public class CacheCalculator {

    private Map<Long, Object> cache = new HashMap<>();

//    @Pointcut("execution(* org.koreait.proxy.*.*(long))")
//    public void publicTarget() {}

    //@Around("publicTarget()")
    @Around("execution(* org.koreait.proxy.*.*(long))")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs(); // 사용된 매개변수에 사용된 값 - 인수
        Long num = (long)args[0];
        if (cache.containsKey(num)) { // 캐시에 저장되어 있는지...
            System.out.println("캐시에서 값을 가져옴...");
            return cache.get(num);
        }

        Object result = joinPoint.proceed();

        cache.put(num, result);
        System.out.println("캐시에 저장됨...");

        return result;
    }
}
