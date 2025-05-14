package org.koreait.proxy;

public class ImplCalculator implements Calculator {
    @Override
    public long factorial(long num) {

        long result = 1L;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
