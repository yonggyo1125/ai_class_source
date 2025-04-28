package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Transportation bus = Transportation.BUS;
        Transportation trans = Transportation.BUS;
        System.out.println(bus == trans);


        System.out.println(bus instanceof Transportation);
        System.out.println(bus instanceof Enum);
    }
}
