package exam02;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("score.txt");
            DataInputStream dis = new DataInputStream(fis)) {
            int total = 0, count = 0;
            try {
                while (true) {
                    int score = dis.readInt();
                    total += score;
                    count++;
                }
            } catch (EOFException e) { // 점수를 모두 다 읽어온 경우
                double avg = total / (double)count;
                System.out.printf("총점: %d, 평균:%.2f%n", total, avg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
