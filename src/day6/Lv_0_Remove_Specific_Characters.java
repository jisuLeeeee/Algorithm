package day6;

public class Lv_0_Remove_Specific_Characters {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] str_arr = my_string.split(letter);

        for(int i=0; i<str_arr.length; i++){
            answer += str_arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Remove_Specific_Characters removeSpecificCharacters = new Lv_0_Remove_Specific_Characters();
        String str = "abcdefg", ch = "f";
        System.out.println(removeSpecificCharacters.solution(str, ch));
    }
}
