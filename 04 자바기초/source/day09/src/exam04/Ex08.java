package exam04;

import java.util.function.BiPredicate;

public class Ex08 {
    public static void main(String[] args) {
       // BiPredicate<String, String> cond = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> conds = String::equals;

        //  매개변수의 사용 순서가 변경 되었으므로 예상 불가, 메서드 참조 적용 X
        BiPredicate<String, String> cond = (s1, s2) -> s2.equals(s1);
    }
}
