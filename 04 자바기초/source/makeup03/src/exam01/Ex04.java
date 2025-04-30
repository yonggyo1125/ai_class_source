package exam01;

import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {
        ThreadEx04 th = new ThreadEx04();
        th.start();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
        }
    }
}

class ThreadEx04 extends Thread {
    @Override
    public void run() {
        String message = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력 내용:" + message);
    }
}
