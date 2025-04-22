package exam05;

public class Ex01 {
    public static void main(String[] args) {
        //JoinService s1 = new JoinService();
        //JoinService s2 = new JoinService();
        JoinService s1 = JoinService.getInstance();
        JoinService s2 = JoinService.getInstance();

        System.out.println(s1 == s2);
    }
}
