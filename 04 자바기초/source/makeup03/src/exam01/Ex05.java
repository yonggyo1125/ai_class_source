package exam01;

public class Ex05 {
    public static void main(String[] args) {
        ThreadEx05 th = new ThreadEx05();
        th.setDaemon(true); // 데몬 쓰레드, main 쓰레드가 종료되면 함께 종료
        th.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

        }
    }
}


class ThreadEx05 extends Thread {
    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(3000);
                System.out.println("문서가 저장되었습니다.");
            } catch (InterruptedException e) {}
        }
    }
}