package Lv_2.day56;

import java.util.Stack;

public class Rotate_Parentheses {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        for(int i=0; i<len; i++){
            String str = s.substring(i, len) + s.substring(0, i);

            Stack<Character> stack = new Stack<>();

            for(int j=0; j<str.length(); j++){
                if(stack.isEmpty())
                    stack.push(str.charAt(j));
                else if(stack.peek() == '('&& str.charAt(j) == ')'){
                    stack.pop();
                }
                else if(stack.peek() == '['&& str.charAt(j) == ']'){
                    stack.pop();
                }
                else if(stack.peek() == '{'&& str.charAt(j) == '}'){
                    stack.pop();
                }
                else
                    stack.push(str.charAt(j));
            }
            if(stack.isEmpty())
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Rotate_Parentheses rotateParentheses = new Rotate_Parentheses();
        String a = "}]()[{";
        System.out.println(rotateParentheses.solution(a));
    }
}
