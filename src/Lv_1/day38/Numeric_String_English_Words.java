package Lv_1.day38;

public class Numeric_String_English_Words {
    public int solution(String s) {
        int answer = 0;

        String[] eng = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};

        for(int i=0; i<eng.length; i++){
            if(s.contains(eng[i])){
                s = s.replace(eng[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Numeric_String_English_Words numericStringEnglishWords = new Numeric_String_English_Words();
        String a = "one4seveneight";
        System.out.println(numericStringEnglishWords.solution(a));
    }
}
