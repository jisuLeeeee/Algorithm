package day8;

public class Lv_0_Addition_of_Hidden_Characters {
    public int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[^0-9]", "");
        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i) - '0'; // '0' => 아스키코드 48
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Addition_of_Hidden_Characters additionOfHiddenCharacters = new Lv_0_Addition_of_Hidden_Characters();
        String a = "aAb1B2cC34oOp";
        System.out.println(additionOfHiddenCharacters.solution(a));
    }
}
