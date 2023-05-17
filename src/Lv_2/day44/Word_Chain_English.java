package Lv_2.day44;

import java.util.ArrayList;

public class Word_Chain_English {
    public int[] solution(int n, String[] words) {
        int[] answer = new int [2];
        ArrayList<String> list  = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            list.add(words[i]);

            if(i > 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Word_Chain_English wordChainEnglish = new Word_Chain_English();
        int a = 2;
        String[] b = {"land", "dream", "mom", "mom"};
        for(int i : wordChainEnglish.solution(a, b))
            System.out.println(i);
    }
}
