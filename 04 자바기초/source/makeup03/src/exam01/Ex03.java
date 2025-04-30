package exam01;

import javax.swing.*;

public class Ex03 {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력 내용:" + message);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
