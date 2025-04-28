package exam04;

public class Ex05 {
    public static void main(String[] args) {
        String trans = "BUS";

        //Transportation BUS = Enum.valueOf(Transportation.class, trans);
        //System.out.printf("BUS:%s, ordinal():%d%n", BUS, BUS.ordinal());
        Transportation BUS = Transportation.valueOf(trans);
        System.out.printf("BUS:%s, ordinal():%d%n", BUS, BUS.ordinal());
    }
}
