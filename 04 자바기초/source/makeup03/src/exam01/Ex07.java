package exam01;

public class Ex07 {
    public static void main(String[] args) {
        ThreadEx07 th1 = new ThreadEx07();
        ThreadEx07 th2 = new ThreadEx07();
        th1.start();
        th2.start();
    }
}

class ThreadEx07 extends Thread {
    private volatile Account account = new Account();
    /*
    @Override
    public synchronized void run() { // 동기화 처리
        while(account.getBalance() > 0) {
            // 100, 200, 300 0~2 + 1 -> 1~3
            int money = (int)(Math.random() * 3 + 1) * 100; // 100, 200, 300
            account.withdraw(money);
            System.out.printf("잔액: %d%n", account.getBalance());
        }
    } */

    @Override
    public void run() { // 동기화 처리

        while(account.getBalance() > 0) {
            // 100, 200, 300 0~2 + 1 -> 1~3
            int money = (int)(Math.random() * 3 + 1) * 100; // 100, 200, 300
            account.withdraw(money);
            System.out.printf("잔액: %d%n", account.getBalance());
        }
    }
}
