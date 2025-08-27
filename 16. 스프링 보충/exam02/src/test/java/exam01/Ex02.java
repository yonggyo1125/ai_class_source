package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.calculator.RecCalculator;
import org.koreait.configs.AppCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppCtx.class)
public class Ex02 {

    @Autowired
    private RecCalculator calculator;

    @Test
    void test1() {
        long result = calculator.factorial(10L);
        System.out.println(result);

        System.out.println(calculator instanceof RecCalculator);
    }
}
