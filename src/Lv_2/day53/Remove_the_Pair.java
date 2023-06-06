package Lv_2.day53;

import java.util.Stack;

public class Remove_the_Pair {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();

        for (String str : s.split("")) {
            if (!stack.isEmpty() && stack.peek().equals(str)) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Remove_the_Pair removeThePair = new Remove_the_Pair();
        String a = "baabaa";
        System.out.println(removeThePair.solution(a));
    }
}
