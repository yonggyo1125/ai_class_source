package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.calculator.Calculator;
import org.koreait.calculator.PerformanceCalculator;
import org.koreait.calculator.RecCalculator;

import java.lang.reflect.Proxy;

public class Ex01 {
    @Test
    void test1() {
        Calculator cal = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class}, new PerformanceCalculator(new RecCalculator()));

        long result = cal.factorial(10L);
        System.out.println(result);

        System.out.println(cal instanceof RecCalculator);

    }

    @Test
    void test2() {
        RecCalculator cal = (RecCalculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class}, new PerformanceCalculator(new RecCalculator()));

        long result = cal.factorial(10L);
        System.out.println(result);
    }
}
