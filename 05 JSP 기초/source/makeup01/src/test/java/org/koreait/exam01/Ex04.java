package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Ex04 {

    @Test
    @Timeout(3)
    void test1() throws InterruptedException {
        Thread.sleep(2000);
    }
}
