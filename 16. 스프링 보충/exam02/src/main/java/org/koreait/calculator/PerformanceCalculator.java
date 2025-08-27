package org.koreait.calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceCalculator implements InvocationHandler {

    private final Object target;

    public PerformanceCalculator(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long stime = System.nanoTime();  // 시작 시간 - 공통 기능
        try {

            Object result = method.invoke(target, args); // 핵심 기능을 대신 수행 : RecCalculator - factorial()

            return result;
        } finally { // - 공통 기능
            long etime = System.nanoTime(); // 종료 시간
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
