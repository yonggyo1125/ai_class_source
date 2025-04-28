package exam04;

public class Ex07 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        int baseFare = trans.getBaseFare();
        System.out.println(baseFare);

        int total = trans.getTotal(10);
        System.out.println(total);
    }
}
