package day9;

public class Lv_0_Uppercase_Lowercase_Letters {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90){
                answer += (char)(my_string.charAt(i) + 32);
            }
            else{
                answer += (char)(my_string.charAt(i) - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Uppercase_Lowercase_Letters uppercaseLowercaseLetters = new Lv_0_Uppercase_Lowercase_Letters();
        String a = "ccccCCCC";
        System.out.println(uppercaseLowercaseLetters.solution(a));
    }
}
