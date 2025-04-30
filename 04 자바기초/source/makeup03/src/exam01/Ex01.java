package exam01;

public class Ex01 {
    public static void main(String[] args) { // 메인쓰레드,

        Thread1 th1 = new Thread1();
        Thread th2 = new Thread(new Thread2());
        Thread th3 = new Thread(() -> {
            Thread th = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.printf("num=%d, name=%s%n", i+1, th.getName());
                try {
                    Thread.sleep(1000); // 현재 실행 중인 쓰레드를 1초 간격으로 대기
                } catch (InterruptedException e) {}
            }
        });
        th1.start(); // 쓰레드 실행 시작, 호출 스택 + run() 호출
        th2.start(); // 쓰레드 실행 시작, 호출 스택 + run() 호출
        th3.start();

        for (int i = 0; i < 10; i++) {
            // Thread.currentThread() : 현재 실행 중인 쓰레드
            Thread th = Thread.currentThread();
            System.out.printf("num=%d, name=%s%n", i + 1, th.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {// Thread-1, getName()
        for (int i = 0; i < 5; i++) {
            System.out.printf("num=%d, name=%s%n", i+1, getName());
            try {
                Thread.sleep(1000); // 현재 실행 중인 쓰레드를 1초 간격으로 대기
            } catch (InterruptedException e) {}
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.printf("num=%d, name=%s%n", i+1, th.getName());
            try {
                Thread.sleep(1000); // 현재 실행 중인 쓰레드를 1초 간격으로 대기
            } catch (InterruptedException e) {}
        }
    }
}