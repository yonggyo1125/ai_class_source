package exam02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx2;
import org.koreait.proxy.Calculator;
import org.koreait.proxy.RecCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppCtx2.class)
public class Ex03 {
    @Autowired
    private Calculator calculator;

    @BeforeEach
    void init() {
        System.out.println(calculator instanceof RecCalculator);
    }

    @Test
    void test1() {
        long result = calculator.factorial(10L);
        System.out.printf("result:%d%n", result);

        result = calculator.factorial(10L);
        System.out.printf("result:%d%n", result);

        result = calculator.factorial(10L);
        System.out.printf("result:%d%n", result);

        result = calculator.factorial(10L);
        System.out.printf("result:%d%n", result);

    }
}
