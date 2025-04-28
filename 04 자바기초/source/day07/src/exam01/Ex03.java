package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        items.add(str1);
        items.add(str2);
        items.add(new String("ABC"));
        items.add(new String("DEF"));
        items.add(new String("GHI"));

        System.out.println(items);

        System.out.printf("str1.hashCode():%d%n", str1.hashCode());
        System.out.printf("str2.hashCode():%d%n", str2.hashCode());
    }
}
