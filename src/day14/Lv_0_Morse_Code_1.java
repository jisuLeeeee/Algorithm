package day14;

public class Lv_0_Morse_Code_1 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letter_arr = letter.split(" ");

        for(int i=0; i<letter_arr.length; i++){
            for(int j=0; j<morse.length; j++){
                if(letter_arr[i].equals(morse[j]))
                    answer += (char)(j + 97);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Morse_Code_1 morseCode1 = new Lv_0_Morse_Code_1();
        String a = ".... . .-.. .-.. ---";
        System.out.println(morseCode1.solution(a));
    }
}
