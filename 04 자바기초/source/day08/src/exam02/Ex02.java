package exam02;

import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Stack<String> items = new Stack<>();
        items.push("이름1");
        items.push("이름2");
        items.push("이름3");

        while(items.size() > 0) {
            String item = items.pop();
            System.out.println(item);
        }
    }
}
