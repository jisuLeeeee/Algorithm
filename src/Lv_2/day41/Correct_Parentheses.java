package Lv_2.day41;

public class Correct_Parentheses {
    boolean solution(String s) {
        int left = 0, right = 0;

        if(s.substring(0, 1).equals(")") || s.substring(s.length()-1, s.length()).equals("("))
            return false;

        for(int i=0; i<s.length(); i++){
            if(s.substring(i, i+1).equals("(")){
                left++;
            }
            else{
                right++;
                if(right > left)
                    return false;
            }
        }

        return left == right ? true : false;
    }

    public static void main(String[] args) {
        Correct_Parentheses correctParentheses = new Correct_Parentheses();
        String a = "(())()"; // “())()(()” => 반례
        System.out.println(correctParentheses.solution(a));
    }
}
