package exam03;

public class Ex05 {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = num1; // 자동 형변환, 묵시적 형변환
        int num3 = num2;
        System.out.println(num2);
        System.out.println(num3);
    }
}
