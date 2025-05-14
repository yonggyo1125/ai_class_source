package org.koreait.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Performance2Calculator implements InvocationHandler {

    private final Object instance;

    public Performance2Calculator(Object instance) {
        this.instance = instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime(); // 시작 시간 - 공통 기능
        try {
            Object result = method.invoke(instance, args); // 핵심 기능을 대신 수행

            return result;

        } finally { // 공통기능
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
