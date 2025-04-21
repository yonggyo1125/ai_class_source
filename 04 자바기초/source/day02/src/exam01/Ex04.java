package exam01;

public class Ex04 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            //System.out.println("--------" + i + "단--------");
            System.out.printf("-------%d단--------\n", i);
            for (int j = 1; j <= 9; j++) {
                //System.out.println(i + "X" + j + "=" + i * j);
                System.out.printf("%d X %d = %d%n", i, j, i*j);
            }
        }
    }
}
