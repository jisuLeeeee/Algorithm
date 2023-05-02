package Lv_1.day36;

public class Caesar_cipher {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ')
                answer += " ";
            else if((Character.isLowerCase(s.charAt(i)) && s.charAt(i) + n > 122) || (Character.isUpperCase(s.charAt(i)) && s.charAt(i) + n > 90))
                answer += (char)((s.charAt(i) + n) - 26);
            else
                answer += (char)(s.charAt(i) + n);
        }

        return answer;
    }

    public static void main(String[] args) {
        Caesar_cipher caesarCipher = new Caesar_cipher();
        String a = "a B z"; int b = 4;
        System.out.print(caesarCipher.solution(a, b));
    }
}
