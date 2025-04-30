package exam01;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "회원1");
        members.put("user02", "회원2");
        members.put("user03", "회원3");
        members.put("user04", "회원4");
        members.put("user05", "회원5");

        members.put("user03", "(수정)회원3"); // 이미 user03 키가 존재하므로 대체
        members.remove("user03");

        String user03 = members.get("user03"); // null
        System.out.println(user03);

        // 값이 null일때 기본값 대체
        user03 = members.getOrDefault("user03", "기본값!");
        System.out.println(user03); // 기본값!
    }
}
