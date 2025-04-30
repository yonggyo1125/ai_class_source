package exam01;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        //HashMap<String, String> members = new HashMap<>();
        //TreeMap<String, String> members = new TreeMap<>();
        TreeMap<String, String> members = new TreeMap<>(Comparator.reverseOrder());
        members.put("user01", "회원1");
        members.put("user02", "회원2");
        members.put("user03", "회원3");
        members.put("user04", "회원4");
        members.put("user05", "회원5");

        //Set<Map.Entry<String, String>> entries = members.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.printf("key=%s, value=%s%n", key, value);
//        }

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
