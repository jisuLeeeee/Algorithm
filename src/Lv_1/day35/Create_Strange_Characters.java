package Lv_1.day35;

import java.util.Arrays;

public class Create_Strange_Characters {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;

        System.out.print(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                answer += " ";
                idx = 0;
            }
            else if(idx % 2 == 0){
                answer += arr[i].toUpperCase();
                idx++;
            }
            else {
                answer += arr[i].toLowerCase();
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Create_Strange_Characters createStrangeCharacters = new Create_Strange_Characters();
        String a = "try hello world";
        System.out.println(createStrangeCharacters.solution(a));
    }
}
