package exam01;

import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        ThreadEx06_1 th1 = new ThreadEx06_1();
        ThreadEx06_2 th2 = new ThreadEx06_2();
        th1.start();
        th2.start();

        try {
            // main 쓰레드는 th1, th2의 수행이 끝날때 까지 일시 정지 상태
            // 수행이 끝나면 다시 재개
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
    }
}

class ThreadEx06_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class ThreadEx06_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("*");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

