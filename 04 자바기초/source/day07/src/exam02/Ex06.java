package exam02;

public class Ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(500);
        String str = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();  // 메서드 체이닝
        /*
        StringBuffer sb1 = sb.append("ABC"); // return this
        StringBuffer sb2 = sb1.append("DEF");
         */
    }
}
