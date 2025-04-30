package exam01;

public class Ex02 {
    public static void main(String[] args) {
        ThreadEx02 th = new ThreadEx02();
        //th.run(); // 쓰레드가 생성 X, 단순히 main 쓰레드에서 run 함수가 호출된 것
        th.start(); // 쓰레드가 생성, 새로운 호출 스택, run() 함수 실행
    }
}

class ThreadEx02 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
