package Lv_2.day85;

import java.util.ArrayList;
import java.util.HashMap;


public class Third_round_Compression {
    public int[] solution(String msg) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String, Integer> dictionary = new HashMap<>();

        for(int i=0; i<26; i++){ // map에 문자와 번호 저장
            dictionary.put(String.valueOf((char)('A' + i)), i + 1);
        }

        if(1 == msg.length()){//만약 'A'일 경우
            result.add(dictionary.get(msg));
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
        for(int i=0; i<msg.length(); i++){
            int num = 1;

            while(num <= msg.length()){
                if(i + num > msg.length()){
                    result.add(dictionary.get(msg.substring(i, i+num-1))); // 색인 번호 저장
                    if(i+num-1 == msg.length()) // 끝 단어에 도달했을 때
                        return result.stream().mapToInt(Integer::intValue).toArray();
                }
                else if(dictionary.containsKey(msg.substring(i, i+num))){ // 사전에 단어 있으면
                    num++; // 다음 단어 확인을 위해 인덱스 번호 +1
                }
                else{
                    result.add(dictionary.get(msg.substring(i, i+num-1))); // 색인 번호 저장
                    dictionary.put(msg.substring(i, i+num), dictionary.size()+1); // 다음 단어 사전에 새로 저장
                    i = i+num-2;
                    break;
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Third_round_Compression thirdRoundCompression = new Third_round_Compression();
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        for(int i : thirdRoundCompression.solution(msg))
            System.out.println(i);
    }
}
