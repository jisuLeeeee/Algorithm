package day8;

public class Lv_0_Remove_Vowels {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)=='a' || my_string.charAt(i)=='e' || my_string.charAt(i)=='i' ||
                    my_string.charAt(i)=='o' || my_string.charAt(i)=='u') // = my_string.replaceAll("[aeiou]", "")
                answer += "";
            else
                answer += my_string.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Remove_Vowels removeVowels = new Lv_0_Remove_Vowels();
        String a = "nice to meet you";
        System.out.println(removeVowels.solution(a));
    }
}
