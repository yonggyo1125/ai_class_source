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

        System.out.println("자바 표준 프록시에서 호출!!");

        Object result = method.invoke(target, args);

        return result;
    }
}
