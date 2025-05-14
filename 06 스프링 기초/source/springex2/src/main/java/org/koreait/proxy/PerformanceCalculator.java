package org.koreait.proxy;

public class PerformanceCalculator implements Calculator {
    private Calculator calculator;

    public PerformanceCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); // 시작 시간 - 공통 기능
        try {
            long result = calculator.factorial(num); // 다른 계산기의 핵심 기능을 대신 수행

            return result;

        } finally { // 공통 기능
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
